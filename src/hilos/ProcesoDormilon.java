/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 *sleep() deteiene la ejecucion en milisegundos deseados
 */
public class ProcesoDormilon extends Thread
{
     public ProcesoDormilon(String msg)
    {   //herecia de Thread
        super(msg);
    }
    
    @Override
    public void run()
    {  
        for(int i =0;i<=20;i++){
           
            try {
                //variable mostrar nombre proceso
                sleep(5000);
                System.out.println(this.getName());
            } catch (InterruptedException ex) {
                Logger.getLogger(ProcesoDormilon.class.getName()).log(Level.SEVERE, null, ex);
            }
                
           
            
        }
            
    }    
    
}
