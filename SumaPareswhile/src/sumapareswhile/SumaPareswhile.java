/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumapareswhile;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class SumaPareswhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner par = new Scanner(System.in);
        int num, suma=0;
        do {
            System.out.println("Ingrese un numero");
            num = par.nextInt();
            if (num%2==0){
                suma=suma+num;

            }
        } while (num>0);
        System.out.println("suma es " + suma);
    }
    
}
