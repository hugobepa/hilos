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


import org.junit.Test;
import static org.junit.*;

public class AtomicExampleTest
{
    private MyObject obj;

    @Before
    public void setUp()
    {
        obj = new MyObject();
        obj.setWhatImReading( new Book( "Java 2 From Scratch" ) );
    }

    @Test
    public void testUpdate()
    {
        obj.setWhatImReading( new Book( 
                "Pro Java EE 5 Performance Management and Optimization" ) );
        Assert.assertEquals( "Incorrect book name", 
                "Pro Java EE 5 Performance Management and Optimization", 
                obj.getWhatImReading().getName() );
    }

}
