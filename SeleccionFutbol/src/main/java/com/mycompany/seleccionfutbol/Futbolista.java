/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seleccionfutbol;

/**
 *
 * @author Jose Cobeña Casanova
 */
public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;

    public Futbolista() {
        super();
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void entrenar() {
        System.out.println("El futbolista entrena para el partido.");
    }

    public void jugarPartido() {
        System.out.println("El futbolista juega el partido.");
    }
}
