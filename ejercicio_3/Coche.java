package ejercicio_3;

public class Coche {
    
    public static void main(String[] args) {
        Coche1 miCoche = new Coche1();
        miCoche.IncrementarPuertas();
        miCoche.IncrementarPuertas();
        miCoche.IncrementarPuertas();
        miCoche.IncrementarPuertas();

        System.out.println(miCoche.puertas);
    }

}

class Coche1 {
    public int puertas = 2;

    public void IncrementarPuertas() {
        this.puertas++;

    }

}