/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constantes;

/**
 *
 * @author Yomi
 */
//import java.text.DecimalFormat;
import java.util.*;
public class Constantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double PI = 3.1416;

        double radio = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa la medida del radio del circulo: ");
        radio = teclado.nextDouble();

        double area = PI*((radio*radio))/2;
        //DecimalFormat decimal = new DecimalFormat("#.000");
        area = Math.round(area);
        System.out.println("El area del circulo es: "+area);

    }
    
}
