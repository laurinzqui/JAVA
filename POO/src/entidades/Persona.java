package entidades;

public class Persona {
    // 1. Propiedades o atributos
    public String nombre;
    public int edad;
    public String correo;
    public String telefono;

    // 2. Constructor (con parametros)
    public Persona(String nombre, int edad, String correo, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
    }

    // 3. Métodos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
        System.out.println("Telefono: " + telefono);
        System.out.println();
    }

    public static void main(String[] args) {
        Persona laura = new Persona("Laura", 25, "laura@example.com", "123456789");
        laura.mostrarInformacion();

        Persona john = new Persona("John", 30, "john@example.com", "987654321");
        john.mostrarInformacion();

        Persona maria = new Persona("Maria", 28, "maria@example.com", "456789123");
        maria.mostrarInformacion();

        Persona david = new Persona("David", 35, "david@example.com", "321654987");
        david.mostrarInformacion();

        Persona sarah = new Persona("Sarah", 22, "sarah@example.com", "654123789");
        sarah.mostrarInformacion();
    }
}
