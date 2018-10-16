
package calculo_enobjetos;

import java.text.DecimalFormat;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernandez
 */
public class Calculo_EnObjetos {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        Double med;
        int selc;

        med = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida de un lado: "));
        
        DecimalFormat des = new DecimalFormat("#.00");
        Cuadrado a = new Cuadrado(med);
        
        System.out.println("Ingrese el calculo deseado: \n1.Calculo del area de un cuadrado \n2.Calculo del perimetro de un cuadrado \n3.Calculo del volumen de un cubo \n4.Calculo del perimetro de un cubo \n5.Cancelar");
        selc  = en.nextInt();
        
        Cubo a2 = new Cubo(med);
        Cuadrado a1 = new Cuadrado(med);
        
        switch(selc){
            case 1:

                System.out.println("El resultado seria: " + des.format(a1.getCalA()));
            break;
            
            case 2:
                System.out.println("El resultado seria: " + des.format(a1.getCalP()));
            break;
            
            case 3:
                System.out.println("El resultado seria: " + des.format(a2.getCalV()));
            break;
            
            case 4:
                System.out.println("El resultado seria: " + des.format(a2.getCalP()));
            break;
            
            case 5:
                System.out.println("La medida ingresada fue: "+des.format(med));
            break;
            
            default:
                System.out.println("Ingrese una opcion valida");
            break;
        }
    }
    
}
