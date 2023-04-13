package ejercicio_9;

public class Main {  

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        
        cliente.edad = 24;
        cliente.nombre = "Jose";
        cliente.telefono = 1123244;

        cliente.credito = 6000;

        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        System.out.println(" ");

        Trabajador trabajador = new Trabajador();

        trabajador.edad = 35;
        trabajador.nombre = "Martin";
        trabajador.telefono = 1132435;

        trabajador.salario = 100000;

        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    
    } 
    

}

class Persona {
    public int edad;
    public String nombre;
    public int telefono;    
}

class Cliente extends Persona {
    public int credito;
}

class Trabajador extends Cliente {
    public int salario;
}