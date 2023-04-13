package ejercicio_4;

public class Main {
    
    public static void main(String[] args) {

    // if
        int numeroif = -5 ;
        if (numeroif >= 0) {
            System.out.println("El numero es positivo");        
        }else if (numeroif < 0) {
            System.out.println("El numero es negativo");
        }
System.out.println(" ");
    // bucle_while
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
System.out.println(" ");
    // do_while    
        int numeroWhile2 = 0;
        do {
            System.out.println(numeroWhile2);
            numeroWhile2 = numeroWhile2 + 1;
        } while (numeroWhile2 < 2);

System.out.println(" ");       
    // for    
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1 ) {
            System.out.println(numeroFor);
        }
        
System.out.println(" ");
    // switch
        var estacion = "invierno";
        
        switch(estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");    
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;    
            default:
                System.out.println("No es una estacion");    
        }

    }


}
