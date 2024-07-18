/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner a=new Scanner(System.in);
int num;
System.out.println("Ingresa un numero");
num = a.nextInt();
if(num%2==0){
    System.out.print("El numero es par");

}else{
    System.out.print("El No es par");
}
    }
    
}
