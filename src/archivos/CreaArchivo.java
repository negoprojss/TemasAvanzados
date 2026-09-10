package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreaArchivo {
    public static void main(String[] args) {
        var nombreArchivo ="Mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            if (archivo.exists()){
                System.out.println("El archivo ya existe");
            }else {
                //Creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                // se agurde el archivo
                salida.close();
                System.out.println("Se ha Creado el archivo");
            }
        }catch (IOException e){
            System.out.println("Error al crear archivo"+e.getMessage());
            e.getStackTrace();
        }
    }
}
