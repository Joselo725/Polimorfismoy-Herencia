
package ejercicio3.pa;

public class Peso extends Medida {
    public Peso(double cantidad) {
        super(cantidad);
    }

    public double gramoamiligramo() {
        return getCantidad() * 1000;
    }

    public double gramoakg() {
        return getCantidad() / 1000;
    }

    public double gramoatonelada() {
        return getCantidad() / 1000000;
    }
}

