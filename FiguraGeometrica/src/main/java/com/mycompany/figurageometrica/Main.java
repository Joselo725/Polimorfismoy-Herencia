
package com.mycompany.figurageometrica;
/*/
 * @author Jose Cobeña Casanova
 */
public class Main {
    public static void main(String[] args) {
    FiguraGeometrica figura;
       
       figura = new Esfera(5); //cree uan instacia de esfera
       System.out.println("Area de la figura: " + figura.calcularArea());
       
       figura = new Semiesfera(3); // crear una instancia de Semiesfera
       System.out.println("Area de la figura: " + figura.calcularArea());
    }
}
