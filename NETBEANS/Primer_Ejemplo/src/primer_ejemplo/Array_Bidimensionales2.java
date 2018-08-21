/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
*/
package primer_ejemplo;

/**
 *
 * @author BETANFER
 */
public class Array_Bidimensionales2 {
    
    public static void main ( String []args){
        
         int [][] matrix ={
        {10,15,18,19,21},
        {5,25,37,41,15},
        {7,19,32,14,90},
        {85,2,7,40,27}    
        
    };
     
    for (int i=0; i< 4;i++){
    System.out.println();
     for (int j=0; j< 5; j++){
        
            System.out.print( matrix [i][j]+" ");
    }
} 
    
}
    }
   
