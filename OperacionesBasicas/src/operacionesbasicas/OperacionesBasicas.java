/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesbasicas;

/**
 *
 * @author Yomi
 */
public class OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Suma, resta, division y multiplicacion
        int a = 123;
        int b = 678;

        int suma, resta, multiplicacion, division, residuo;

        suma = a+b;
        resta = a-b;
        multiplicacion = a*b;
        division = a/b;
        residuo = a%b;

        int asignacionsuma = a+=b;
        int asignacionresta = a-=b;
        int asignacionm = a*=b;
        int asignaciond = a/=b;
        int asignacionr = a%=b;

        int incremento = a++;
        int decremento = b--;

        boolean identico = (a==b);
        boolean diferente = (a!=b);
        boolean mayor = (a>b);
        boolean menor = (a<b);
        boolean mayorigual = (a>=b);
        boolean menorigual = (a<=b);

        boolean and = (a>b) && (b<a);
        boolean or = (a>b) || (b<a);
        boolean not = !(a<b);


        System.out.println("Suma:" + suma);
        System.out.println("Resta:" + resta);
        System.out.println("Multiplicacion:" + multiplicacion);
        System.out.println("Division:" + division);
        System.out.println("Residuo:" + residuo);
        System.out.println("Sumar asignacion: "+ asignacionsuma);
        System.out.println("Resta asignacion: "+ asignacionresta);
        System.out.println("Multpilcacion asignacion: "+ asignacionm);
        System.out.println("Division asignacion: "+ asignaciond);
        System.out.println("Residuo asignacion: "+ asignacionr);
        System.out.println("Incremento: " + incremento);
        System.out.println("Decremento:" + decremento);
        System.out.println("Identico: "+ identico);
        System.out.println("Diferente: "+ diferente);
        System.out.println("Mayor: "+ mayor);
        System.out.println("Menor: "+ menor);
        System.out.println("Mayor igual: "+ mayorigual);
        System.out.println("Menor igual: "+ menorigual);
        System.out.println("AND: "+ and);
        System.out.println("OR: "+ or);
        System.out.println("NOT: "+ not);
    }
}
