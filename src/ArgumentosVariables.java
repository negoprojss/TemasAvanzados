public class  ArgumentosVariables {
    public static void main(String[] args) {
//        imprimirNumeros(1,2,3,4,5); // varargs (argumentos varibles)
        variosParametros("karla",10,20,30);
    }

    private static void variosParametros(String nombre, int... numeros) {
        System.out.println("nombre: " + nombre);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int... numeros) {

        for (var i=0; i < numeros.length; i++)
        System.out.println(numeros[i] + " ");
    }

}
