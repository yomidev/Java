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

        //Numero menor
        int minimo = numeros[0];
        for (int i = 0; i< numeros.length; i++) {
            if(numeros[i]<minimo){
                minimo = numeros[i];
            }
        }

        System.out.println("El numero menor: " + minimo);
        







        //Ejercicios
        String [] actores = { "Timothée Chalamet", "Florence Pugh", "Margot Robin",
            "Cate Blanchet", "Jennifer Lawrence", " ", "Anna Taylor Joy", " ", " ", "Ryan Gosling"
        };

        String [] cantantes;
        cantantes = new String[10];

        int [] lados;

    }
}
