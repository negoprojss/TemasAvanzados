package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        // leer mi archivo
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            System.out.println("Contenido del archivo: ");
            // abrer el archivo para lectura
            var entreda = new BufferedReader(new FileReader(archivo));
            //Leemos lineas a linea el archivo
            var linea = entreda.readLine();
            //leemos todas las lineas
            while (linea != null){
                System.out.println(linea);
                // antes de terminar el cliclo, nos movemos a la siguiente liena
                linea = entreda.readLine();
            }
            // cerrar archivo
            entreda.close();
        }catch (Exception e){
            System.out.println("Error al leer archivo" + e);
        }
    }
}
