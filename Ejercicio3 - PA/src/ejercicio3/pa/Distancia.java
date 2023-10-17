
package ejercicio3.pa;

public class Distancia extends Medida {
    public Distancia(double cantidad) {
       super(cantidad);
    
    }
    public double metroamilimetro(){
        return getCantidad() * 1000;
    }
    
    public double metroacenti(){
        return getCantidad() * 100;
    }
    
    public double metroakm(){
        return getCantidad() / 1000;
    }
}
