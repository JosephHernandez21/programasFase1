/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo_enobjetos;

/**
 *
 * @author Hernandez
 */
public class Cubo {
    
    private Double calculoV;
    private Double calculoP;
    
    public Cubo(Double medida) {
        
        calculoV = medida*medida*medida;
        calculoP = medida * 14;
        
    }
    
    public Double getCalV(){return calculoV;}
    public Double getCalP(){return calculoP;}
   
}
