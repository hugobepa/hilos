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
 * 
 */
//se extiende de la classe constructor



public class PruebaProcesoSincronizado extends Thread{
    
     public static void main(String[] args) {
        Thread hilo1 =new ProcesoSincronizado("Sincronizado 1");
        Thread hilo2 =new ProcesoSincronizado("Sincronizado 2");
       //Se inician processos desde el run de Processos asincronos con Threath
        hilo1.start();
        hilo2.start();
    }
    
}