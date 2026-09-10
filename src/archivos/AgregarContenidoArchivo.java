package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;

public class AgregarContenidoArchivo {
    public static void main(String[] args) {
        boolean anexar = false;
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            //revisra si existe archivo
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            var nuevoContenido = "\nNuevo\nContenido";
            salida.println(nuevoContenido);
            salida.close();
        }catch (Exception e){
            System.out.println("Error al escrivir al archivo: "+e);
        }
    }
}
