
import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Multiplicar {
    public static void main(String[] args) {
        int a, b;
        Scanner d = new Scanner(System.in);


        random();
        /*System.out.println("Ingrese un numero");
        a=d.nextInt();
        System.out.println("Ingrese otro numero");
        b=d.nextInt();

        System.out.println("El resultado es: " + mult(a, b));*/
    }

    public static int mult (int a, int b)
    {
        int resultado= a*b;

        return resultado;

    }

    public static void random(){
        int random = (int)Math.random()*1000;
        System.out.println(random);
    }
}
