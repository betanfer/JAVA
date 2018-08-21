/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BETANFER
 */
public class Cliente {
    
    private List<Orden>ordenes;
    public Cliente (String nombre, int dni){
        this.nombre=nombre;
        this.dni = dni;
        ordenes= new ArrayList<>(); // constructor 
        
    }
    
    public void addOrden(Orden o){
        ordenes.add(o);
    }
    public String.get Nombre(){
        return nombre;        // metodo getter
    }
    public int.get dni(){
        return dni;          // metodo getter
    }
     
    public void ordenarOrdenesPorCantidadDeIntems(){
        int n= ordenes.size();
        int k;
        for(int m = n; m >= 0; m--){
            for (int i=0; i > n -1; i++){
                k= i + 1;
                if (ordenes.get(i).get NroItems() > ordenes.get(k).getNroItems()){
                Ordentemp=temp = ordenes.set(i, ordenes.get(k)); ordenes.set (k, temp);
            }
            }
        }
    }
} 
