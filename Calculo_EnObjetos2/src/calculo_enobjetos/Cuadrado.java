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
public class Cuadrado {

    private Double calculoA;
    private Double calculoP;
    
    public Cuadrado(Double medida) {
        
        calculoA = medida*medida;
        calculoP = medida * 4;
        
    }
    
    public Double getCalA(){return calculoA;}
    public Double getCalP(){return calculoP;}
   
}
