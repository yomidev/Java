/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinarnumero;

/**
 *
 * @author Yomi
 */
import java.util.*;
 public class Adivinarnumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int numero= (int)Math.random()*100;
        int numero = 7;
        int num;
        Scanner teclado= new Scanner(System.in);
        do { 
            System.out.println("Ingresa un numero");
            num= teclado.nextInt();
        
        } while (num!=numero);

    }
    
}
