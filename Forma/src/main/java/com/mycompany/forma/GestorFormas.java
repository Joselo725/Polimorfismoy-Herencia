package com.mycompany.forma;

import java.util.ArrayList;
import java.util.List;

class GestorFormas {
    private List<Forma> formas = new ArrayList<>();

    public void agregarForma(Forma forma) {
        formas.add(forma);
    }

    public void mostrarAreas() {
        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
