package com.ermuza;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class CocinaController implements Initializable {
    
    // tabla platos
    @FXML
    private TableView<Platos> tablaPlatos;
    
    @FXML
    private TableColumn<Platos, String> idPlatoColumn;
    
    @FXML
    private TableColumn<Platos, String> nombreColumn;
   

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
        // TABLA PLATOS

        idPlatoColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        // TABLA COMANDAS

        NumComandaCol.setCellValueFactory(cellData -> cellData.getValue().idComandaProperty());
        IdPlatoCol.setCellValueFactory(cellData -> cellData.getValue().idPlatoProperty());
        CantidadCol.setCellValueFactory(cellData -> cellData.getValue().cantidadProperty());
        EstadoCol.setCellValueFactory(cellData -> cellData.getValue().estadoProperty());
        
        try {
            cargarPlatosDesdeBD();
            cargarComandasDesdeBD();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void cargarPlatosDesdeBD() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ERMUZA", "root", "1234");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM platos");

        while (resultSet.next()) {
            Platos plato = new Platos();
            plato.setId(resultSet.getString("id_plato"));
            plato.setNombre(resultSet.getString("descripcion"));
            tablaPlatos.getItems().add(plato);
        }

        resultSet.close();
        statement.close();
        connection.close();
    }

        //
    // tabla platos
        //
    @FXML
    private TableView<Comandas> tablaComandas;
    @FXML
    private TableColumn<Comandas,String> NumComandaCol;
    
    @FXML
    private TableColumn<Comandas,String> IdPlatoCol;
    @FXML
    private TableColumn<Comandas,String> CantidadCol;
    @FXML
    private TableColumn<Comandas,String> EstadoCol;

    private void cargarComandasDesdeBD() throws SQLException {
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ERMUZA", "root", "1234");
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT id_Comanda, id_Plato, Cantidad, Estado FROM detalleComanda");

    // Limpiar la tabla de comandas antes de cargar nuevos datos
    tablaComandas.getItems().clear();

    while (resultSet.next()) {
        Comandas comand = new Comandas();
        
        comand.setIdComanda(resultSet.getString("id_Comanda"));
        comand.setIdPlato(resultSet.getString("id_Plato"));
        comand.setCantidad(resultSet.getString("Cantidad"));
        comand.setEstado(resultSet.getString("Estado"));
        tablaComandas.getItems().add(comand);
    }

    resultSet.close();
    statement.close();
    connection.close();
}

        //
    // Botones
        //

    @FXML
    private Button botonEliminar;
    @FXML
    private Button botonEditar;
    @FXML
    private Button botonAceptar;

    @FXML
    private TextField textFieldNombrePlato;
    @FXML
    private TextField textFieldIDPlato;
    
    public void AccionEliminar(){

    

    }
    public void AccionEditar() {
        // Obtener la comanda seleccionada en la tabla de comandas
        Comandas comandaSeleccionada = tablaComandas.getSelectionModel().getSelectedItem();
        
        if (comandaSeleccionada != null) {
            // Cambiar el estado de la comanda a "Listo"
            comandaSeleccionada.setEstado("Listo");
        } else {
            // Si no se ha seleccionado ninguna comanda, mostrar un mensaje de advertencia
            System.out.println("¡Por favor, seleccione una comanda para marcar como listo!");
        }
    }

    
    
    @FXML
private void AccionAceptar() {
    String nombrePlato = textFieldNombrePlato.getText();
    String idPlato = textFieldIDPlato.getText(); // Obtener el valor del campo ID
    
    // Verificar si ambos campos están vacíos
    if (!nombrePlato.isEmpty() && !idPlato.isEmpty()) {
        Platos nuevoPlato = new Platos();
        nuevoPlato.setNombre(nombrePlato);
        nuevoPlato.setId(idPlato);
        tablaPlatos.getItems().add(nuevoPlato);
        textFieldNombrePlato.clear(); // Limpiar los TextField después de agregar el plato
        textFieldIDPlato.clear();
    } else {
        try {
            App.setRoot("error");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}



        // Otros códigos...

    }

