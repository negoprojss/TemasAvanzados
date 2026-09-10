package excepciones;

public class PruebaAritmentica {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(10,0);

            System.out.println("resultado: " + resultado);
        }catch (Exception e){
            System.out.println("erro ocurrrido : "+e);
        }
        finally {
            System.out.println("se reviso y se ejecuta");
        }
    }
}
