/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * Interrupeix el process
 */

    public class ProcesoInterruptus extends Thread{
    
    
    
    
    //constructor herencia Thread
    public ProcesoInterruptus(String msg)
    {   //herecia de Thread
        super(msg);
    }
    
     
   
    
    @Override
    public void run()
    {  
        for(int i =0;i<=20;i++){
            //variable mostrar nombre proceso
            if (Thread.interrupted()) {
        // We've been interrupted: no more crunching.
        return;
    }
            System.out.println(this.getName());
        }
            
    }    
}
    

