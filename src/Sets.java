import java.util.Set;
import java.util.TreeSet;

public class Sets {


    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("carlos");
        conjunto.add("carlos");
        conjunto.add("karla");
        conjunto.add("victoria");
        System.out.println("nombres del set");
        conjunto.forEach(System.out::println);
        // Remover elemento
        conjunto.remove("karla");
        System.out.println("nueva lista");
        conjunto.forEach(System.out::println);
    }

}
