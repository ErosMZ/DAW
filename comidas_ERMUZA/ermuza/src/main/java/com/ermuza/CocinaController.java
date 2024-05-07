package com.ermuza;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
        idPlatoColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        
        try {
            cargarPlatosDesdeBD();
            cargarComandasDesdeBD();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void cargarPlatosDesdeBD() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:33006/ERMUZA", "root", "dbrootpass");
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
    private TableColumn<?,?> NumComandaCol;
    
    @FXML
    private TableColumn<?,?> IdPlatoCol;
    @FXML
    private TableColumn<?,?> CantidadCol;
    @FXML
    private TableColumn<?,?> EstadoCol;

    private void cargarComandasDesdeBD() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:33006/ERMUZA", "root", "dbrootpass");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT id_Comanda, id_Plato, Cantidad, Estado FROM detalleComanda");

        while (resultSet.next()) {
            Comandas comand = new Comandas();
            comand.setDetalleComanda(resultSet.getString("id_Comanda"));
            comand.setIdComanda(resultSet.getString("id_Plato"));
            comand.setCantidad(resultSet.getString("Cantidad"));
            comand.setCantidad(resultSet.getString("Estado"));
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
    
    public void AccionEliminar(){

    

    }
    public void AccionEditar(){

        

    }
}       
