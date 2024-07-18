/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whilesuma100;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class WhileSuma100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner rojo = new Scanner(System.in);
        int num, suma=0;
        System.out.println("Ingresa un numero: ");
        num = rojo.nextInt();
        while (suma<=100) {
            suma=suma + num;
            System.out.println("Ingresa un numero: ");
            num = rojo.nextInt();


            
        }
        System.out.println("La suma ya es 100");
    }
    
}
