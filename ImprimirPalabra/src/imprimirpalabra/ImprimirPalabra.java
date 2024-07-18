/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imprimirpalabra;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class ImprimirPalabra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner a=new Scanner(System.in);
        String b;
        int limite;
        System.out.println("Ingresa palabra");
        b=a.nextLine();
        System.out.println("Ingresa el numero de veces");
        limite=a.nextInt();
        for (int i = 0; i <=limite; i++) {
            System.out.println(b);
            
        }
    }
    
}
