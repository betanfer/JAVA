/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer_ejemplo;

/** Refundiciones int raiz=(int)Math.round( num1);
 * Convertir un tipo de dato en otro poniendo entre parentesis delante del tipo de dato. Existe cierta perdida de informacion
 * NUMERO GRANDE LONG NUMERO ENTERO INT
 *
 * @author BETANFER
 */
public class Calculos_conMath2 {
    public static void main (String []args) {
        double num1=5.85;
        int resultado=(int)Math.round(num1); // metodo que redondea el valor de la variable num1.-
        System.out.println(resultado);
    }
    
}
