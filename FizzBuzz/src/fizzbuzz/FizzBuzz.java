/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fizzbuzz;
import java.util.Scanner;
/**
 *
 * @author Yomi
 */
public class FizzBuzz {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
       int b,c;
       int i;
       
        System.out.print("ingresa el primer valor");
        b=a.nextInt();
        do { 
        System.out.print("ingrese el segundo valor");
        c=a.nextInt();
 
       } while (c<b );
       for (i=b;i<=c;i++){
        if (i%3==0 && i%5 == 0) {
            System.out.println("fizz buzz");
        
        }else if(i%5==0){
            System.out.println("buzz");
        } else if(i%3 == 0){
            System.out.println("fizz ");
        }else {
            System.out.println(i);
        }

    }
       /*System.out.print("ingresa el primer valor");
       b=a.nextInt();
       System.out.print("ingrese el segundo valor");
       c=a.nextInt();*/

       // int i;
        /*if (b>c){
            for (i=b;i<=c;i++){
                if (i%3==0 && i%5 == 0) {
                    System.out.println("fizz buzz");
                
                }else if(i%5==0){
                    System.out.println("buzz");
                } else if(i%3 == 0){
                    System.out.println("fizz ");
                }else {
                    System.out.println(i);
                }

            }
        }else {
            System.out.println("El segundo valor es menor al primero");
        }*/
        /*while (c<b){
            System.out.println("Ingresar seugndo numero");
            c =a.nextInt();
        }
        for (i=b;i<=c;i++){
            if (i%3==0 && i%5 == 0) {
                System.out.println("fizz buzz");
            
            }else if(i%5==0){
                System.out.println("buzz");
            } else if(i%3 == 0){
                System.out.println("fizz ");
            }else {
                System.out.println(i);
            }

        }*/


    
    }
}
