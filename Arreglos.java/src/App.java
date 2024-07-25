import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Declaracion de tipos de arrays
        //Ejemplos
        int [] numeros = {123, 342, 20, 10, 23, 19, 69, 72, 1000};
        String [] anime;
        anime = new String[10];
        String [] kpop = { "BLACKPINK", "STRAY KIDS", "TWICE", "(G)I-DLE", "NEWJEANS",
                "TOMORROW x TOGETHER", "ENHYPEN", "BTS", " ", "SEVENTEEN", " ", " ", "REDVELVET",
                " ","LE SSERAFIM"
        };
        String[] songs;
        Scanner teclado = new Scanner(System.in);
        /*System.out.println("Cuantas canciones quieres ingresar: ");
        int num = teclado.nextInt();
        songs = new String[num];
        String c;
        for (int idx = 0; idx < songs.length; idx++) {
            System.out.println("Ingresa un cancion: ");
            c = teclado.nextLine();
            songs[idx] = c;
            
        }

        System.out.println("Impresion: "+ Arrays.toString(songs));*/

        String group;
        for (int idx = 0; idx < kpop.length; idx++) {
           if(kpop[idx].equals(" ")){
                System.out.println("Ingresa un grupo de KPOP: ");
                group = teclado.nextLine();
                kpop[idx] = group;
           }    
        }
        System.out.println("Impresion del Array: "+ Arrays.toString(kpop));
        String integrantes, canciones;
        for (int idx = 0; idx < kpop.length; idx++) {
            System.out.println("Ingresa el nombre de tu bias de "+ kpop[idx] + ":");
            integrantes = teclado.nextLine();
            System.out.println("Ingresa tu cancion favorira de "+ kpop[idx]+ ":");
            canciones = teclado.nextLine();

            kpop[idx] = kpop[idx].concat(" - ").concat(integrantes).concat(" - ").concat(canciones); 
        }

        System.out.println("Impresion nueva: "+ Arrays.toString(kpop));

        String buscar;
        System.out.println("Elemento a buscar: ");
        buscar = teclado.nextLine().toUpperCase();
        boolean found = false;
        for (int idx = 0; idx < kpop.length; idx++) {
           if(kpop[idx].toUpperCase().contains(buscar)){
                System.out.println("Informacion encontrada: "+ "\n" + kpop[idx]);
                found = true;
                break;
           }else if(!found){
                System.out.println("No tengo información sobre: "+ buscar);
                break;
           }
        }

        //Agregarle valores
        String animeName;
        for (int idx = 0; idx < anime.length; idx++) {
            System.out.println("Ingresa un anime: ");
            animeName = teclado.nextLine();
            anime[idx] = animeName;
        }
        System.out.println("Impresion del Array: "+ Arrays.toString(anime));



        //Numero Mayor
        int mayor = numeros[0];
        for (int idx = 0; idx < numeros.length; idx++) {
            if(numeros[idx]>mayor){
                mayor = numeros[idx];
            }
        }
        System.out.println("El numero mayor es: "+ mayor);
        //Promedio de numeros
        int suma = 0;
        for (int idx = 0; idx < numeros.length; idx++) {
           suma = suma+numeros[idx];
        }
        double promedio = suma/numeros.length;
        System.out.println("El promedio de los numeros es: "+ promedio);
        //Invertir
        int [] invertido;
        invertido = new int[numeros.length];
        for (int idx = 0; idx < numeros.length; idx++) {
            invertido[idx] = numeros[numeros.length -1 -idx];
        }
        System.out.println("Array invertido:" + Arrays.toString(invertido));
    }
}
