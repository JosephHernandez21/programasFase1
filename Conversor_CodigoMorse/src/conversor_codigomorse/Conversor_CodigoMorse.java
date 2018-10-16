
package conversor_codigomorse;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Hernandez
 */
public class Conversor_CodigoMorse {

    public static void main(String[] args) throws IOException {
        int elec;
        char selec;
        Scanner en1 = new Scanner(System.in);
        
        do{
        
        System.out.println("Elija una opcion: \n1.Convertir de texto a codigo morse. \n2.Convertir de codigo morse a texto.");
        elec = en1.nextInt();
        
        switch(elec){
            
            case 1:
                System.out.println("Ingrese el texto a convertit: ");
                String text="";
                Scanner en = new Scanner(System.in);
                text = en.nextLine();
                Texto_A_Morse sal = new Texto_A_Morse(text);      
                System.out.println("El resultado seria: "+sal.getMensaje());          
            break;
                
            case 2:
                System.out.println("Ingrese el codigo a traducir: ");
                String text2="";
                Scanner e3 = new Scanner(System.in);
                text2 = e3.nextLine();
                Morse_A_Texto sal2 = new Morse_A_Texto(text2);
                System.out.println("El resultado seria: "+sal2.getMensaje());
            break;
            
            default:
                System.out.println("Ingrese una opcion valida");
            break;
            
        }
            System.out.println("¿Desea repetir?(S/N) ");
            selec =(char) System.in.read();
            
            System.out.println("\n");
        }while(selec == 's' || selec == 'S');
        
    }
    
}
