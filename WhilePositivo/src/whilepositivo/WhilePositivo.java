/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whilepositivo;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class WhilePositivo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int suma = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        numero = teclado.nextInt();

        while(numero >= 0){
            suma = suma+ numero;
            System.out.println("Ingresa un numero: ");
            numero = teclado.nextInt();
        }
        
        System.out.println("La suma de los numeros ingresado es: "+ suma);
    }
    
}
