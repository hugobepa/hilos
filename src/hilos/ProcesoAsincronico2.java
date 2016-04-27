/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * La diferencia fundamental es que en vez de extender de Thread extendemos 
 * de Runnable y al momento de crear los objetos lo hacemos usando 
 * el constructor de la clase Thread enviándole como argumento un objeto de 
 * la clase ConHilos que implementó a Runnable. 
 * 
 */
public class ProcesoAsincronico2 implements Runnable {
    
     //constructor herencia Thread
    String atributo;
    

    public ProcesoAsincronico2(String msg)
    {   //herecia de Thread
       this.atributo=msg;
    }
    
    @Override
    public void run()
    {  
        for(int i =0;i<=20;i++){
            //variable mostrar nombre proceso
            System.out.println(atributo);
        }
            
    }    
}
