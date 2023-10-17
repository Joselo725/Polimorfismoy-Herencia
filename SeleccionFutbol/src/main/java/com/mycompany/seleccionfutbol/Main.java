package com.mycompany.seleccionfutbol;
/**
 *
 * @author Jose Cobeña Casanova
 */

public class Main {
   public static void main(String[] args) {
        Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
        Masajista raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        // Usar métodos específicos para cada rol
        iniesta.entrenar();
        delBosque.dirigirEntrenamiento();
        raulMartinez.darMasaje();
    }   
}
