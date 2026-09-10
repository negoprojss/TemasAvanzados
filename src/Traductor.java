public interface Traductor {
    //publicos y abstract
    void traducir();

    // metodos con implementacion por default
    default void iniciarTraductor(){
        System.out.println("inicia traductor....");
    }
}

class ingles implements Traductor{
    public void traducir(){
        System.out.println("traduzco ingles");
    }
}

class Frances implements Traductor{
    public void traducir(){
        System.out.println("traduzco en frances");
    }
    @Override
    public void iniciarTraductor() {
        System.out.println("Inicia traductor en frances...");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
        // traductor en franceas
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }

}
