/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos.atomicos;

/**
 *
 * @author hugo
 */
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 *
 * El Javadoc para AtomicReferenceFieldUpdater lo define de la siguiente manera:

    Una utilidad basada en el reflejo que habilita las actualizaciones atómicas
    * para campos designados de referencia volátil de clases designadas. 
    * Esta clase está diseñada para usarse en estructuras de datos atómicos 
    * en las cuales muchos campos de referencia del mismo nodo están independientemente 
    * sujetos a actualizaciones atómicas.
    * 
    * El valor real aquí es que el método getWhatImReading es ejecutado sin
    * sincronización de ningún tipo, mientras que setWhatImReading se ejecuta 
    * como una operación atómica.
     el método setWhatImReading() y hace valer que el valor cambia 
     * 
     * java.util.concurrent.atomic de lo que estaría grabando su propio 
     * bloque de código sincronizado:
     * valor: AtomicInteger, AtomicBoolean, AtomicLong, AtomicIntegerArray
     * modulo:AtomicIntegerFieldUpdater, AtomicLongFieldUpdater 
     * y AtomicReferenceFieldUpdater    aplicados a un campo volátil.
    * 
 */
public class MyObject
{
    private volatile Book whatImReading;

    private static final AtomicReferenceFieldUpdater<MyObject,Book> updater =
            AtomicReferenceFieldUpdater.newUpdater( 
                       MyObject.class, Book.class, "whatImReading" );

    public Book getWhatImReading()
    {
        return whatImReading;
    }

    public void setWhatImReading( Book whatImReading )
    {
        //this.whatImReading = whatImReading;
        updater.compareAndSet( this, this.whatImReading, whatImReading );
    }
}
