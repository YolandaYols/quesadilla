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

        String nuevaOracion = enunciado.replace("-", "")
                .replace(" ", "")
                .replace("(", "")
                .replace(")", "");

        String[] telefonos = nuevaOracion.split(",");
        int guaymas = 0;
        int hermosillo = 0;
        int tijuana = 0;
        int desconocido = 0;

        for (String t : telefonos) {
            if (t.startsWith("622")) {
                guaymas++;
            } else if (t.startsWith("664")) {
                tijuana++;
            } else if (t.startsWith("662")) {
                hermosillo++;
            } else {
                desconocido++;
            }

            System.out.println("Hay " + guaymas + " números de guaymas");
            System.out.println("Hay " + tijuana+ " números de tijuana");
            System.out.println("Hay " + hermosillo + " números de hermosillo");
            System.out.println("Hay " + desconocido + " números desconocidos");

        }
        /*
        String newOration = enunciado.replace("-", " ").replace("(", " ").replace(")", " ").replace(enunciado, enunciado);
        System.out.println(newOration);
        
        String[] listaNum = enunciado.split(",");
    

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
