
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer valor");
        num1 =  a.nextInt();
        System.out.println("Ingrese el segundo valor");
        num2 =  a.nextInt();
        Menu();
       int opcion;
       System.out.println("ingrese la operacion a realizar");
       opcion=a.nextInt();
       switch (opcion) {
           case 1 :
               System.out.println("La suma es:" + suma(num1, num2));
               break;
               case 2:
               System.out.println("La resta es:" + resta(num1, num2));
               break;
               case 3:
               System.out.println("La muliplicacion es: "+multiplicacion(num1, num2));
               break;
               case 4:
               System.out.print("La dividon es:"+ division(num1, num2)
               );
               break;
               default:
               throw new AssertionError();
       } 
    }
    public static void Menu(){
        System.out.println("1.+");
        System.out.println("2.-");
        System.out.println("3.*");
        System.out.println("4./");
    }

    public static int suma(int a,int b){
        int resultado=a+b;
        return resultado;
    }
     
    public static int division (int a, int b)
{
    int resultado = a/b;
    return resultado;
}
    public static int resta(int a, int b){
        int resultado=a-b;
        return resultado;
    }
    public static int multiplicacion (int a, int b){
        int resultado= a*b;
        return resultado;
    }
}
