/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double a, b, suma, resta, mult, div;
        
        System.out.println("Ingresa el primer valor");
        a = teclado.nextDouble();
        System.out.println("Ingresa el segundo valor");
        b = teclado.nextDouble();
        
        suma = a + b;
        resta = a - b;
        mult = a*b;
        div = a/b;
        
        /*System.out.println("Suma:" + suma);
        System.out.println("Resta:" + resta);
        System.out.println("Multiplicacion:"+ mult);
        System.out.println("Division:"+ div);*/

        System.out.print("Ingresa la operacion a realizar: ");
        String c = teclado.next();

        switch(c){
            case "+":
            System.out.println("Suma:" + suma);
            break;
            case "-":
            System.out.println("Resta:" + resta);
            break;
            case "*":
            System.out.println("Multiplicacion:"+ mult);
            break;
            case "/":
            if(b == 0){
                System.out.println("No se puede dividir entre 0");
            }else{
                System.out.println("Division:"+ div);
            }
            break;
            default:
                System.out.println("La opcion ingresada no existe");
            break;
        }

        /*if(c.equals("+")){
            System.out.println("Suma:" + suma);
        }else if(c.equals("-")){
            System.out.println("Resta:" + resta);
        }else if(c.equals("*")){
            System.out.println("Multiplicacion:"+ mult);
        }else if(c.equals("/")){
            if(b == 0){
                System.out.println("No se puede dividir entre 0");
            }else{
                System.out.println("Division:"+ div);
            }
        }else{
            System.out.println("La opcion no existe");
        }*/

        teclado.close();
    }
    
}
