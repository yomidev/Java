/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int MAX_EDAD=100;
        Scanner T =new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad");
        edad= T.nextInt();
        if (edad >=0 && edad<=12){
            System.out.println("Es niño");
        }else if (edad >=13 && edad <=17){
            System.out.println("Eres adolescente");
        }else if (edad >=18 && edad <=59){
            System.out.println("Eres adulto");
        }else {
            if(edad> MAX_EDAD){
                System.out.println("La edad no es valida");
            }else {
                System.out.println("Eres adulto mayor");
            }
 
        }
    }
    
}
