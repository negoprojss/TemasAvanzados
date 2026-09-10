import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        var persona = new Persona();
        persona.setNombre("karla");
        persona.setApellidos("sanchez");
        System.out.println("persona = " + persona);
        System.out.println("Nombre: = " + persona.getNombre());
        System.out.println("Apellido: = " + persona.getApellidos());
    }
}

class Persona implements Serializable {
    private String nombre;
    private String apellidos;

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
