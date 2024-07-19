/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palabraswhile;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;

public class PalabrasWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a;
        Scanner l = new Scanner(System.in);
        do { 
            System.out.print("ingresa una palabra");
            a = l.nextLine();
            if (a.equals("salir")) {
                break;
                
            }   
        } while (true);
        



        /*while ( !a.equals("Salir")) { 
            System.out.print("ingresa una palabra");
            a = l.nextLine();
            
        }*/
        /*while (true) {
            
            if (a.equals("salir")) {
                break;
                
            }
            System.out.print("ingresa una palabra");
        a = l.nextLine();
        }*/
    }
    
}
