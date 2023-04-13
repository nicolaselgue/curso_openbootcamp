
package ejercicio_8;

public class Main {
    
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.setEdad(34);
        persona.setNombre("Jose");
        persona.setTelefono(1143335546);

        int edad = persona.getEdad();
        String nombre = persona.getNombre();
        int telefono = persona.getTelefono();

        System.out.println(edad); 
        System.out.println(nombre);
        System.out.println(telefono);

    }

}

class Persona {
    private int edad;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    private int telefono;

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }

}
