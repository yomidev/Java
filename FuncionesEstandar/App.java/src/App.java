
import java.lang.reflect.Array;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        //Math
        System.out.println("Valor Absoluto:" + Math.abs(-123));
        System.out.println("Exponente: " + Math.pow(4, 10) );
        System.out.println("Raiz Cuadrada" + Math.sqrt(1000000));
        System.out.println("Maximo: "+ Math.max(700, -1));
        System.out.println("Minimo: "+ Math.min(60,35));
        System.out.println("Random: "+ Math.random());

        //String
        System.out.println("\n");
        String cadena = "El dia de hoy haremos un cereal";
        System.out.println("Longuitud: "+ cadena.length());
        System.out.println("Cadena en indice indicado: "+ cadena.substring(10));
        System.out.println("Buscar indice: "+ cadena.indexOf("cereal"));
        System.out.println("Remplazar: "+ cadena.replace('h', 's'));
        System.out.println("Mayusculas: "+ cadena.toUpperCase());
        System.out.println("Minusculas: "+ cadena.toLowerCase());
        System.out.println("Sin espacios: "+ cadena.trim());

        //Arrays

        System.out.println("\n");
        /*int [] numero = {3,1,4,5,6,7,9,34};
        int [] numero2 = {3,1,4,5,6,7,9,34};
        int [] n2;
        n2 = new int[10];
        System.out.println("Ordenar: "+Array.sort(numero));
        System.out.println("Busqueda Binaria: "+ Array.binarySearch(numero, 4));
        System.out.println("Llenado:" + Array.fill(n2, 3));
        System.out.println("Comparar: "+ Array.equals(numero, numero2));*/

        Scanner a= new Scanner(System.in);
        String palabra;
        System.out.println("Ingresa una palabra: ");
        palabra = a.nextLine();
        System.out.println("nueva palabra: "+ palabra.replace('n', 'x' ));
      System.out.println("la palabra invertida es: " + palabra.length());
     String invertida="";
      for (int i =palabra.length()-1; i >=0; i--) {
        invertida=invertida+palabra.charAt(i);
     }
     System.out.println("la cadena invertida es: " +invertida);

     StringBuilder sb = new StringBuilder(palabra);
     String x = sb.reverse().toString();
     System.out.println(x);
    }

   



}
