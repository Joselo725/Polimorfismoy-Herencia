/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurageometrica;

/**
 *
 * @author Jose Cobeña Casanova
 */
public class Semiesfera extends FiguraGeometrica {
    private final double radio;

    public Semiesfera(double radio) {
        this.radio = radio;
    }

    
    public double calcularArea() {
        return 2 * Math.PI * radio * radio + Math.PI * radio * radio / 2;
    }
}

 
