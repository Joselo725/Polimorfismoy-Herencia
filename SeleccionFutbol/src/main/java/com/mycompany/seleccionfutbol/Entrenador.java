/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seleccionfutbol;

/**
 *
 * @author Jose Cobeña Casanova
 */
public class Entrenador extends SeleccionFutbol {
    private String idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirEntrenamiento() {
        System.out.println("El entrenador dirige el entrenamiento.");
    }

    public void dirigirPartido() {
        System.out.println("El entrenador dirige el partido.");
    }
}
