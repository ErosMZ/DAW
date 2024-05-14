package baseDEDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;

    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono;
    }
}

class Pedido {
    private String descripcion;
    private double precio;

    public Pedido(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Descripción: " + descripcion + ", Precio: $" + precio;
    }
}

public class GestorPedidos {
    private Connection connection;

    public GestorPedidos() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nombre_base_de_datos", "usuario", "contraseña");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void agregarCliente(String nombre, String direccion, String telefono) {
        String query = "INSERT INTO clientes (nombre, direccion, telefono) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nombre);
            statement.setString(2, direccion);
            statement.setString(3, telefono);
            statement.executeUpdate();
            System.out.println("Cliente agregado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorPedidos gestorPedidos = new GestorPedidos();

        boolean ejecutar = true;
        while (ejecutar) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    gestorPedidos.agregarCliente(nombre, direccion, telefono);
                    break;
                case 2:
                    ejecutar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }

        scanner.close();
    }
}
