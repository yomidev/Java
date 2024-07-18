/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablademultiplicar;

/**
 *
 * @author Yomi
 */

import java.util.Scanner;
public class TabladeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado;
        int numero;
        int limite;
        Scanner hola=new Scanner(System.in);
        System.out.println("ingresa un numero");
        numero=hola.nextInt();
        System.out.println("ingresa el limite");
        limite=hola.nextInt();
        for (int i = 0; i <= limite; i++) {
            resultado= numero*i;
            System.out.println(numero + "x" + i+"="+ resultado);
        }
    }
    
}
