/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhilepassword;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class DoWhilePassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String password = "password";
        String userPassword;
        
        do{
            
            System.out.println("Ingresa la contraseña");
            userPassword = teclado.next();
            
        }while(!userPassword.equals(password));
        
        System.out.println("Contraseña correcta");
    }
    
}
