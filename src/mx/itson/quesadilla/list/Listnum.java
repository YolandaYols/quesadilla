/**
 * Contiene métodos para ordenar una lista de números por área
 *
 * @author yols
 */
package mx.itson.quesadilla.list;

/**
 *
 * @author yols
 */
public class Listnum {

    /**
     * Remplaza lo que se quiere quitar
     *
     * @param accommodate Modifica la lista de numeros cada vez que encuentre un
     * -,(,),"". Será reemplazado
     * @return Cada componente será una fracción de la cadena otorgada
     */
    public String list(String accommodate) {
        String newOration = accommodate.replace("-", " ").replace("(", " ").replace(")", " ").replace(" ", "");
        System.out.println(newOration);
        return newOration;
    }

    /**
     * Separa una cadena de texto si se encuentra una coma y 
     * startsWith indicará si una cadena comienza por el carácter del area señalado  
     *
     * @param ordenar Lista de números que será ordenada por fracciones
     * @return Array de string será una fracción de la cadena otorgada
     * 
     */
    public String[] order(String ordenar) {
        String[] num = ordenar.split(",");

        String tijuana = "664";
        int tijuan = 0;
        String hermosillo = "662";
        int hermosill = 0;
        String guaymas = "622";
        int guayma = 0;

        int Unknown = 0;

        for (String nums : num) {
            if (nums.startsWith(tijuana)) {
                tijuan++;
            }

        }

        for (String nums : num) {
            if (nums.startsWith(hermosillo)) {
                hermosill++;
            }
        }

        for (String nums : num) {
            if (nums.startsWith(guaymas)) {
                guayma++;
            }
        }

        System.out.println("Hay " + guayma + " de Guaymas");
        System.out.println("Hay " + hermosill + " de Hermosillo");
        System.out.println("Hay " + tijuan + " de Tijuana");
        System.out.println("Hay " + Unknown + " desconocidos");

        return num;

        /*
       

       


        return num;
         */
    }

}
