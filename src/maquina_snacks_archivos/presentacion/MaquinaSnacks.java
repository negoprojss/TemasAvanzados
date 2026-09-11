package maquina_snacks_archivos.presentacion;

import maquina_snacks_archivos.dominio.Snack;
import maquina_snacks_archivos.servicio.IServicioSnacks;
import maquina_snacks_archivos.servicio.ServicioSnacksArchivos;
import maquina_snacks_archivos.servicio.ServicioSnacksLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnachs();
    }

    public static void maquinaSnachs(){
        var salir = false;
        var consola = new Scanner(System.in);
        // Creamos el objeto para obtener el servicio de snacks (lista)
        IServicioSnacks servicioSnacks = new ServicioSnacksArchivos();
        //creamos la lista de productos de tipo snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("\n\n\n+++ Maquina de Snacks +++\n");
        servicioSnacks.mostrarSnacks(); // Mostrar

        while (!salir){
            try {
                var opcion = motrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos,servicioSnacks);

            }catch (Exception e){
                System.out.println("Ocurrio un error"+ e.getMessage());
            }
            finally {
                {
                    System.out.println();// imprime un salto de linea con cada iteracion
                }
            }
        }

    }

    private static int motrarMenu(Scanner consola){
        System.out.print("""
                Menu:
                1.Compara snack
                2.Mostrar ticket
                3.Agregar Nuevo Snack
                4.Salir
                Elige una opcion:""");
        // Leemos y retornamos la opcion seleccionada
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola,List<Snack> productos, IServicioSnacks servicioSnacks){
        var salir = false;
        switch (opcion){
            case 1 -> comparaSnack(consola,productos,servicioSnacks);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola,servicioSnacks);
            case 4 -> {
                System.out.println("**** Regresa Pronto! ****");
                salir= true;
            }
        }
        return salir;
    }

    private static void comparaSnack(Scanner consola, List<Snack> productos, IServicioSnacks servicioSnacks){
        System.out.println("Que snack quieres compara (id)? ");
        var idSnack = Integer.parseInt(consola.nextLine());
        //Validar que el snack exista en la lista de snack
        var snackEncontrado = false;
        for (var snack: servicioSnacks.getSnacks()){
            if (idSnack == snack.getIdSnack()){
                //Agregamos el snack a la lista de productos
                productos.add(snack);
                System.out.println("OK, Snack agregado: " + snack);
                snackEncontrado= true;
                break;
            }
        }
        if (!snackEncontrado){
            System.out.println("ID de snack no encontrado: " + idSnack);
        }

    }

    private static void mostrarTicket(List<Snack> productos){
        var ticket ="*** Ticket de Venta ***";
        var total =0.0;
        for (var producto: productos){
            ticket += "\n\t-"+producto.getNombre()+ "- $"+producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal -> $"+ total;
        System.out.println(ticket);
    }

    private  static void agregarSnack(Scanner consola,IServicioSnacks servicioSnacks){
        System.out.print("Ingresa el nombre del nuevo Snack: ");
        var nombre = consola.nextLine();
        System.out.print("Ingresa el precio del nuevo Snack: ");
        var precio = Double.parseDouble(consola.nextLine());
        servicioSnacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Tu snack se agrego correctamente");
        servicioSnacks.mostrarSnacks();
    }

}
