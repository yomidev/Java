import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
       String nombre;
       int a;
       Scanner teclado = new Scanner(System.in);
       System.out.println("Ingresa tu nombre");
       nombre = teclado.nextLine();

       holaMundo();
       System.out.println(holaMundoString());

       //Hola con nombre
       holaPersona(nombre);
    }


    //Funciones
    public static void holaMundo(){
        System.out.println("Hola Mundo");
    }

    public static String holaMundoString(){
       String hola= "Hola Mundo";
        return hola;
    }

    //
    public static void holaPersona(String nombre){
        System.out.println("Hola "+nombre);
    }
}
