/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forma;

/**
 *
 * @author Jose Cobeña Casanova
 */
public class Main {
    public static void main(String[] args) {
        GestorFormas gestor = new GestorFormas();

        Circulo circulo = new Circulo(8.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);

        gestor.agregarForma(circulo);
        gestor.agregarForma(rectangulo);

        gestor.mostrarAreas();
    }
}
