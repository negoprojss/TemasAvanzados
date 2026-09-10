import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista= new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jeves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
//        miLista.add("Domingo");

        for(Object elemento: miLista){
            System.out.println("Dia de la semana : " + elemento);
        }


//        funcion lambda
        miLista.forEach(elemento -> {
            System.out.println("elementos: _ "+elemento);
        });

        miLista.forEach(System.out::println);
        List<String> nombre = Arrays.asList("pedro","karla","amairani");
        nombre.forEach(System.out::println);

    }
}
