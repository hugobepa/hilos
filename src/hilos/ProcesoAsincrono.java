/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author hugo
 */

    public class ProcesoAsincrono extends Thread{
    
    
    
    
    //constructor herencia Thread
    public ProcesoAsincrono(String msg)
    {   //herecia de Thread
        super(msg);
    }
    
     
   
    
    @Override
    public void run()
    {  
        for(int i =0;i<=20;i++){
            //variable mostrar nombre proceso
            System.out.println(this.getName());
        }
            
    }    
}
    

