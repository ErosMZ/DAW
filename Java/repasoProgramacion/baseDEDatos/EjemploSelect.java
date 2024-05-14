package baseDEDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EjemploSelect {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // Establecer conexión con la base de datos
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nombre_base_de_datos", "usuario", "contraseña");

            // Definir la consulta SELECT
            String sql = "SELECT * FROM tabla_ejemplo";

            // Preparar la consulta
            statement = connection.prepareStatement(sql);

            // Ejecutar la consulta y obtener el resultado
            resultSet = statement.executeQuery();

            // Procesar el resultado
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                // Aquí puedes obtener otros campos según la estructura de tu tabla

                // Imprimir el resultado
                System.out.println("ID: " + id + ", Nombre: " + nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

