import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManipulacionArchivos {

    public static void leerArchivo(String fileName) {
        File file;// Apunta a un archivo fisico en el disco duro
        FileReader reader;// llave con permiso de solo lectura
        BufferedReader bufer;
        String line;
        try {
            System.out.println("FileName: " + fileName);
            // crear un apuntador al archivo fisico
            file = new File("C:\\archivos\\" + fileName + ".txt");

            // abrir el archivo para lectura
            reader = new FileReader(file);
            // configurar el bufer para leer el archivo
            bufer = new BufferedReader(reader);
            while ((line = bufer.readLine()) != null) {
                System.out.println("Linea leida: " + line);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.toString());
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        System.out.println("Lectura de archivos de texto");
        System.out.println("Escriba el nombre del archivo: ");
        fileName = bufer.readLine();
        leerArchivo(fileName);
    }
}