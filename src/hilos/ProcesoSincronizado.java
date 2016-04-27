/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 *  Cada vez que un thread intenta acceder a un bloque sincronizado le pregunta
 * a ese objeto si no hay algún otro thread que ya tenga el lock para ese 
 * objecto.Si ya hay otro espera sino lompone en marcha
 * 
 * A veces nos interesa que un hilo se quede bloqueado a la espera de que ocurra 
 * algún evento, como la llegada de un dato para tratar o que el usuario termine 
 * de escribir algo en una interface de usuario. 
 * Todos los objetos java tienen el método wait() que deja bloqueado al hilo que 
 * lo llama y el método notify(), que desbloquea a los hilos bloqueados
 * por wait().
 */

    public class ProcesoSincronizado extends Thread{
    
    
    
    
    //constructor herencia Thread
    public ProcesoSincronizado(String msg)
    {   //herecia de Thread
        super(msg);
    }
    
     
   
    
    @Override
    public synchronized void run()
    {  
        for(int i =0;i<=20;i++){
            //variable mostrar nombre proceso
            System.out.println(this.getName());
        }
            
    } 
    
    
}
    

