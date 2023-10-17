
package com.mycompany.seleccionfutbol;

/**
 *
 * @author Jose Cobeña Casanova
 */
public class SeleccionFutbol {
    private int id;
    private String Nombre;
    private String Apellidos;
    private int Edad;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Edad = edad;
    }

    public void Concentrarse() {
        System.out.println("El integrante se concentra.");
    }

    public void Viajar() {
        System.out.println("El integrante viaja para el partido.");
    }
}
