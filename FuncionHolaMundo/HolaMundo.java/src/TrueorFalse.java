
import java.util.Scanner;

public class TrueorFalse {
    public static void main(String[] args) {
        Scanner ho=new Scanner(System.in);
        System.out.println("ingresa un numero");
        int u= ho.nextInt();

          System.out.print("el resultado es "+jas(u));

    }
    public static boolean jas(int k){
        if (k>0) {
            return true;
        } else {
            return false;
        }
    }

}
