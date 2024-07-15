/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        System.out.println("Hola 2");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre:");
        String nombre = teclado.nextLine();
        
        System.out.println("Hola"+" "+ nombre +" "+"!");
    }
    
}
