/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurageometrica;

/**
 *
 * @author Jose Cobeña Casanova
 */
public class Esfera extends FiguraGeometrica {
    private final double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return 4 * Math.PI * radio * radio;
    }
}
