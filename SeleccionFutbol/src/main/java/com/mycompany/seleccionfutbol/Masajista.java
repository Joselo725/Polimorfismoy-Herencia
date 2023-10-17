/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seleccionfutbol;

/**
 *
 * @author Jose Cobeña Casanova
 */
public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista() {
        super();
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println("El masajista da un masaje a un jugador.");
    }
}
