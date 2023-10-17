package ejercicio3.pa;

import java.util.Scanner;

public class Ejercicio3PA {

    public static void main(String[] args) {
        int _op;
        double cantidad;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escoja un tipo de medida:");
            System.out.println("1.- Peso");
            System.out.println("2.- Longitud");
            System.out.println("3.- Salir");
            _op = sc.nextInt();

            switch (_op) {
                case 1:
                    System.out.println("Ingrese la cantidad de gramos a convertir.");
                    cantidad = sc.nextDouble();
                    Peso p = new Peso(cantidad);
                    System.out.println("La cantidad en miligramos es: " + p.gramoamiligramo());
                    System.out.println("La cantidad en kilogramos es: " + p.gramoakg());
                    System.out.println("La cantidad en toneladas es: " + p.gramoatonelada());
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de metros a convertir.");
                    cantidad = sc.nextDouble();
                    Distancia d = new Distancia(cantidad);
                    System.out.println("La cantidad en miligramos es: " + d.metroamilimetro());
                    System.out.println("La cantidad en centímetros es: " + d.metroacenti());
                    System.out.println("La cantidad en kilómetros es: " + d.metroakm());
                    break;
            }
        } while (_op != 3);
    }
}
