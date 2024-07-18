/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;

public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner a=new Scanner(System.in);
int year;
System.out.println("Ingresa un año:");
year=a.nextInt();
if(year%4==0) {
    System.out.println("El año es bisiesto");

}else{
    System.out.println("El año no es bisiesto");
}   }
    
}
