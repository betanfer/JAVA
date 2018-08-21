/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer_ejemplo;

/**
 *
 * @author BETANFER
 */
public class Calculo_conMath3 {
    public static void main(String []args){
        double base=5;
        double exponente=3;
        int resultado=(int)Math.pow(base, exponente); // metodo de numero y potencia.-
        System.out.println(resultado);
        System.out.println("El resultado de "+base+" elevado a "+exponente+" es "+resultado );
    }
    
}
