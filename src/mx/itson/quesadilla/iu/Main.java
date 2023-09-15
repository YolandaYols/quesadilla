package mx.itson.quesadilla.iu;

import java.util.Scanner;
import mx.itson.quesadilla.list.Listnum;

/**
 *
 * @author yols
 */
public class Main {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Write list of numbers");
        String number = sc.nextLine();
        
        String result = new Listnum().list(number);
        
        String[] orderList = new Listnum().order(result);
        for (String s: orderList) {
            System.out.println(s);
        }
        
        
        
        
    }
    
}
