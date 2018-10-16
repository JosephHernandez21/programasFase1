
package E_Romanos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernandez
 */
public class Romanos {
 
    
    public static void main (String[] args) {
        
        
     
        Scanner en = new Scanner(System.in);
     
        System.out.println("Ingreso el numero : ");//Se ingresa el numero deseado
        int numeros = en.nextInt();
        romanos2 romanos = new romanos2(numeros);
        String Str ="";
        Str = Str + "Numero " + numeros + " = " + romanos.getEquivalente() +"\n";//se decalra el equivalente
         
        System.out.println(Str); //se le da salida a el equivalente

       
    }

}
