/**
 *Se usará el método startsWith
 */
package mx.itson.quesadilla.example;

import java.util.Scanner;

/**
 *
 * @author yols
 */
public class Main {

    public static void main(String[] args) {
        
        

        System.out.println("write the text to valuate: ");
        Scanner scanner = new Scanner(System.in);
        String enunciado = scanner.nextLine(); 
        
        String newOration = enunciado.replace("-", " ").replace("(", " ").replace(")", " ").replace(enunciado, enunciado);
        System.out.println(newOration);
        
        String[] listaNum = enunciado.split(",");
        
       
        
        
        
        /*
    

        boolean itIsUsed = enunciado.startsWith("a");

        if (itIsUsed) {
            System.out.println("Si inicia con a");
        } else {
            System.out.println("No inicia con a");

        }

        ////////////
        if (enunciado.startsWith("a")) {
            System.out.println("Si inicia con a");
        }else{
        System.out.println("No inicia con a");
    }
        
        
        
        System.out.println(enunciado.startsWith("a") || enunciado.startsWith("A")? "Si inicia con a":"No inicia con a");
        
*/
    }  
    
}
