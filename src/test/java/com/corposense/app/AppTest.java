package com.corposense.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Simple Test
     */
    @Test
    public void shouldCalculateTotal()
    {
    	App app = new App();
    	int total = app.getTotal(2, 3);
        assertTrue( app != null );
        assertEquals(total, 5);
    }
}
