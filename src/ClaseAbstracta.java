public class ClaseAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica =new Circulo();
        figuraGeometrica.dibujar();

    }
}

// clase abstracta
abstract  class  FiguraGeometrica{
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println("se dibuja un Rectangulo");
    }
}
class Circulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println("se dibuja un circulo ");
    }
}