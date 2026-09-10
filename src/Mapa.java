import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre","Diego");
        persona.put("apellido","Flores");
        persona.put("edad","31");
        System.out.println("Valores del map");
        persona.entrySet().forEach(System.out::println);
        persona.put("edad","35");
        System.out.println("Valores del map");
        persona.entrySet().forEach(System.out::println);

        //Iterar sobres losd elementos del mapa por separado
        persona.forEach((llave, valor)->{
            System.out.println("llave: \n "+llave+" valor:  "+valor);
        });
    }
}
