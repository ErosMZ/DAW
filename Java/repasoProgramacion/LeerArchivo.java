import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class LeerArchivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileInputStream fis = new FileInputStream(new File("SAC.bin"));
            ObjectInputStream ois = new ObjectInputStream(fis);

            boolean continuar = true;

            while (continuar) {
                System.out.println("\nMenú:");
                System.out.println("1. Nombre del objeto");
                System.out.println("2. Constelación");
                System.out.println("3. Magnitud límite");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                
                int opcion = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea
                
                switch (opcion) {
                    case 1:
                        System.out.print("Nombre del objeto: ");
                        String nombreObjeto = sc.nextLine().trim();
                        buscarPorNombre(ois, nombreObjeto);
                        break;
                    case 2:
                        System.out.print("Constelación: ");
                        String constelacion = sc.nextLine().trim();
                        buscarPorConstelacion(ois, constelacion);
                        break;
                    case 3:
                        System.out.print("Magnitud límite: ");
                        double magnitudLimite = sc.nextDouble();
                        buscarPorMagnitud(ois, magnitudLimite);
                        break;
                    case 4:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            }

            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    private static void buscarPorNombre(ObjectInputStream ois, String nombre) {
        try {
            while (true) {
                String obj = (String) ois.readObject();
                if (obj.contains(nombre)) {
                    System.out.println(obj);
                }
            }
        } catch (Exception e) {
            // Fin del archivo alcanzado
        }
    }

    private static void buscarPorConstelacion(ObjectInputStream ois, String constelacion) {
        try {
            while (true) {
                String obj = (String) ois.readObject();
                if (obj.contains(constelacion)) {
                    System.out.println(obj);
                }
            }
        } catch (Exception e) {
            // Fin del archivo alcanzado
        }
    }

    private static void buscarPorMagnitud(ObjectInputStream ois, double magnitudLimite) {
        try {
            while (true) {
                String obj = (String) ois.readObject();
                String[] partes = obj.split(" ");
                double magnitud = Double.parseDouble(partes[partes.length - 1]);
                if (magnitud <= magnitudLimite) {
                    System.out.println(obj);
                }
            }
        } catch (Exception e) {
            // Fin del archivo alcanzado
        }
    }
}
