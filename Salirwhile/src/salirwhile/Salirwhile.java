/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salirwhile;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class Salirwhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner orlando =new Scanner(System.in);
        System.out.print ("Ingresa una palabra");
        String palabra=orlando.nextLine();
        while (!palabra.equals("salir")) { 
            System.out.print ("Ingresa una palabra");
        palabra=orlando.nextLine();
        }
        System.out.println("Se escribio la palabra salir");
    }
    
}
