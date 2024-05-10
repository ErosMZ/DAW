package com.ermuza;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class CamareroController implements Initializable {
    // me falta en el login coger el nombre para que solo muestre las comandas de las mesas que les pertenece
    // tambien falta el boton de eliminar 
    // falta la tabla que le llega a la cocina que se accedera con el desplegable que hay arriba
    @FXML
    private TableView<ComandaCamarero> tablaComandas;
    
    @FXML
    private TableColumn<ComandaCamarero, Integer> idColumn;
    
    @FXML
    private TableColumn<ComandaCamarero, Integer> idMesaColumn;
    
    @FXML
    private TableColumn<ComandaCamarero, String> estadoColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("idComanda"));
        idMesaColumn.setCellValueFactory(new PropertyValueFactory<>("idMesa"));
        estadoColumn.setCellValueFactory(new PropertyValueFactory<>("estado"));
        
        try {
            cargarComandasDesdeBD();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void cargarComandasDesdeBD() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:33006/ERMUZA", "root", "dbrootpass");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM comandas");

        ObservableList<ComandaCamarero> comandasList = FXCollections.observableArrayList();

        while (resultSet.next()) {
            int idComanda = resultSet.getInt("id_Comanda");
            int idMesa = resultSet.getInt("id_Mesa");
            String estado = resultSet.getString("Estado");

            ComandaCamarero comanda = new ComandaCamarero(idComanda, idMesa, estado);
            comandasList.add(comanda);
        }

        tablaComandas.setItems(comandasList);

        resultSet.close();
        statement.close();
        connection.close();
    }

    public void botonAñadir() {

        ComandaCamarero comandaSeleccionada = tablaComandas.getSelectionModel().getSelectedItem();

        if (comandaSeleccionada != null) {
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:33006/ERMUZA", "root", "dbrootpass");
                String nuevoEstado = "";

                if (comandaSeleccionada.getEstado().toLowerCase().equals("abierta")) {
                    nuevoEstado = "cerrada";
                } else if (comandaSeleccionada.getEstado().toLowerCase().equals("cerrada")) {
                    nuevoEstado = "cobrada";
                }else if (comandaSeleccionada.getEstado().toLowerCase().equals("cobrada")) {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Error");
                    alert.setHeaderText("Esa comanda ya esta creada");
                    alert.setContentText("Por favor, seleccione otra comanda de la lista.");
                    alert.showAndWait();
                }

                String updateQuery = "UPDATE comandas SET Estado = ? WHERE id_Comanda = ?";
                PreparedStatement statement = connection.prepareStatement(updateQuery);
                statement.setString(1, nuevoEstado);
                statement.setInt(2, comandaSeleccionada.getIdComanda());
                statement.executeUpdate();

                cargarComandasDesdeBD();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Estado de Comanda Actualizado");
                alert.setHeaderText("El estado de la comanda ha sido actualizado:");
                alert.setContentText("ID de Comanda: " + comandaSeleccionada.getIdComanda() + "\nNuevo Estado: " + nuevoEstado);
                alert.showAndWait();

                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText("No se ha seleccionado ninguna comanda");
            alert.setContentText("Por favor, seleccione una comanda de la lista.");
            alert.showAndWait();
        }
    }
}