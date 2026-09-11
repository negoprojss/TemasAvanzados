package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks {
    private  final  String NOMBRE_ARCHIVO = "snacks.txt";
    // Crear la lista de snacks
    private  List<Snack> snacks = new ArrayList<>();

    //Constructor clase
    public ServicioSnacksArchivos(){
        //Creamos el archivo si no existe
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try {
            existe = archivo.exists();
            if (existe){
               // this.snacks = obtenerSnacks();
            }else {
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo");
            }
        }catch (Exception e){
            System.out.println("Error al crear el archivo: "+ e.getMessage());
        }
        // Si no existe, cargamos algunos snacks iniciales
        if (!existe){
            cargarSnacksIniciales();
        }

    }

    private  void cargarSnacksIniciales(){
        this.agregarSnack(new Snack("Papas",70));
        this.agregarSnack(new Snack("Refresco",50));
        this.agregarSnack(new Snack("Sandwich",120));
    }


    @Override
    public void agregarSnack(Snack snack) {
        // 1. Agregamos el nuevo snack, 1. a la lista e memoria
        this.snacks.add(snack);
        // 2. Guardar en archivo snack em el archivo
        this.agregarSnackArchivo(snack);

    }

    private  void agregarSnackArchivo(Snack snack){
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(snack.escribirSnack());
            salida.close();// se manda a guardar la info
        }catch (Exception e){
            System.out.println("error al escribir: "+ e);
        }
    }


    @Override
    public void mostrarSnacks() {

    }

    @Override
    public List<Snack> getSnacks() {
        return List.of();
    }
}
