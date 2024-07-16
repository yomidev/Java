/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datosnoprimitivos;

/**
 *
 * @author Yomi
 */
public class DatosNoPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String
        String saludo = "Hola, como estas?";
        System.out.println(saludo + saludo.length());

        // Vector
        char [] array = {'a','e','i','o','u'};
        boolean [] barray = {true, false, false, true};
        System.out.println("Primer posicion es: "+barray[0]);
        System.out.println("Ultima posicion es: "+barray[3]);
    }
    
}
