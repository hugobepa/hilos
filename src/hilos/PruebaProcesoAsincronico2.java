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
public class PruebaProcesoAsincronico2 extends Thread{
    public static void main(String[] args) {
        Thread hilo3 =new ProcesoAsincrono("proceso 3");
        Thread hilo4 =new ProcesoAsincrono("proceso 4");
       //Se inician processos desde el run de Processos asincronos con Threath
        hilo3.start();
        hilo4.start();
    }
    
}
