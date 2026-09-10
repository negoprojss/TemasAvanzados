package excepciones;

public class Excepciones {
    public static void main(String[] args) {
        int valor1 =10, valor2 =0;
        try {
            var resultados = valor1 / valor2;
            System.out.println("resultado = " + resultados);
        }catch (Exception e){
            System.out.println("erro ocurrrido : "+e);
        }
    }
}
