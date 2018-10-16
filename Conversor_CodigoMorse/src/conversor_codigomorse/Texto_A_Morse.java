
package conversor_codigomorse;

/**
 *
 * @author Hernandez
 */
public class Texto_A_Morse {
 
    private String mens;

    public Texto_A_Morse(String mensaje){
        
        String let = "abcdefghijklmnopqrstuvwxyz0123456789áéíóú";
        mensaje = mensaje.toLowerCase();

        String codigo[] = new String[55];
        String espacios = "   ";
        String mor = "";

        codigo[0] = ".-";//a
        codigo[1] = "-...";//b
        codigo[2] = "-.-.";//c
        codigo[3] = "-..";//d
        codigo[4] = ".";//e
        codigo[5] = "..-.";//f
        codigo[6] = "--.";//g
        codigo[7] = "....";//h
        codigo[8] = "..";//i
        codigo[9] = ".---";//j
        codigo[10] = "-.-";//k
        codigo[11] = ".-..";//l
        codigo[12] = "--";//m
        codigo[13] = "-.";//n
        codigo[14] = "---";//o
        codigo[15] = ".--.";//p
        codigo[16] = "--.-";//q
        codigo[17] = ".-.";//r
        codigo[18] = "...";//s
        codigo[19] = "-";//t
        codigo[20] = "..-";//u
        codigo[21] = "...-";//v
        codigo[22] = ".--";//w
        codigo[23] = "-..-";//x
        codigo[24] = "-.--";//y
        codigo[25] = "--..";//z
        codigo[26] = "-----";//0
        codigo[27] = ".----";//1
        codigo[28] = "..---";//2
        codigo[29] = "...--";//3
        codigo[30] = "....-";//4
        codigo[31] = ".....";//5
        codigo[32] = "-....";//6
        codigo[33] = "--...";//7
        codigo[34] = "---..";//8
        codigo[35] = "----.";//9
        codigo[36] = ".-";//a
        codigo[37] = ".";//e
        codigo[38] = "..";//i
        codigo[39] = "---";//o
        codigo[40] = "..-";//u


        for  (int i = 0; i < mensaje.length() ; i++){ 
            if (mensaje.charAt(i)==' ') mor = mor+espacios+' ';
            else {
                    for  (int j = 0; j < let.length() ; j++) {
                            if (mensaje.charAt(i) == let.charAt(j))
                                    mor = mor + codigo[j]+' ';
                            }
                    }
            }

        mens = mor;
        
        }
                
    public String getMensaje(){return mens;}
    
}
