/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Listo, nuestros hilos ya no deben preocuparse de nada. El hilo que espera por los datos hace esto

Object dato = listaSincronizada.getDato();

y eso se quedará bloqueado hasta que haya algún dato disponible. Mientras, el hilo que guarda datos sólo tiene que hacer esto otro

listaSincronizada.addDato(dato);
 */
public class MiListaSincronizada
{
   private List<Object>  lista = new ArrayList<Object>();

   public synchronized void addDato(Object dato)
   {
      lista.add(dato);
      //notifica que esta libre
      lista.notify();
   }

   public synchronized Object getDato() throws InterruptedException
   {
      if (lista.size()==0)
          // espera notificacion
         wait();
      Object dato = lista.get(0);
      lista.remove(0);
      return dato;
   }
} 
