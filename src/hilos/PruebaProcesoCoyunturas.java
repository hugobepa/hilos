/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 *va creando los objetos y ejecutando su correspondiente hilos llamando a start().
 * En este caso dado que la ejecución es asíncrona, ya no esperará a que cada ciclo 
 * termine sino que irá atendiendo de una cada vez que sea posible. 
 * Si un Thread necesita esperar a que otro termine (por ejemplo el Thread 
 * padre espera a que termine el hijo) puede usar el método join(). 
 * ¿Por que se llama así? Crear un proceso es como una bifurcación, se abren
 * 2 caminos, que uno espere a otro es lo contrario, una unificación.
 * 
 */
//se extiende de la classe constructor



public class PruebaProcesoCoyunturas extends Thread{
    
     public static void main(String[] args) throws InterruptedException {
        Thread hilo1 =new ProcesoAsincrono("join 1");
        Thread hilo2 =new ProcesoAsincrono("join 2");
       //Se inician processos desde el run de Processos asincronos con Threath
        hilo1.start();
        hilo1.join();
        
        hilo2.start();
        hilo2.join();
    }
    
}