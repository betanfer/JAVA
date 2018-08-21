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
public class Manipula_Cadenas02 { 
      public static void main (String []args){
        String nombre="Juan";
        System.out.println("Mi nombre es "+ nombre);
        System.out.println("Mi nombre tiene "+ nombre.length()+" letras."); // calcula que cantidad de letras.-
        System.out.print("La primera letra de "+ nombre+ " es la "+ nombre.charAt(0)); //calcula la posicion de la letra.-
        
        // COMO PODEMOS HACER PARA QUE NOS DIGA LA ULTIMA LETRA PERO QUE VALGA PARA CUALQUIER NOMBRE?? TENGA LA LONGITUD QUE TENGA
      int ultima_letra;
      ultima_letra=nombre.length();
      // CUANTAS LETRAS HAY DENTRO DE NOMBRE ?? 4
      
      System.out.println(" Y la ultima letra es la "+nombre.charAt(ultima_letra-1)); // Le estoy pidiendo que me devuelva que letra hay en charAt 
      //en la posicion 3 dentro de nombre(varible).-
      //Esto es valido para cualquier nombre ya sea largo o corto. Ejemplo "FELIPE JUAN FROILAN DE TODOS LOS SANTOS"
      
        
        
        
        
      }
      
}
