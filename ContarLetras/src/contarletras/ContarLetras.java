/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contarletras;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class ContarLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a =new Scanner(System.in);
        String palabra;
       int contador = 0;
       System.out.print("Ingresa una palabra");
       palabra = a.nextLine();
       for (int i = 0; i < palabra.length(); i++) {
        if(palabra.charAt(i)=='e'){
            contador +=1;

        }
           
       }
    System.out.print("El numero de letras e es: "+ contador);

    }
    
}
