/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author Jose Cobeña Casanova
 */
public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Animal(); // Creamos una instancia de Animal
        Animal miPerro = new Perro();   // Creamos una instancia de Perro
        Animal miLoro = new Loro();     // Creamos una instancia de Gato

        miAnimal.sonido(); // Llamamos al método sonido() de Animal
        miPerro.sonido();  // Llamamos al método sonido() de Perro
        miLoro.sonido();    // Llamamos al método sonido() de Gato
    }
}
    
