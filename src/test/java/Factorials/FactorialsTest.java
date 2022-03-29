package Factorials;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FactorialsTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testZero()
    {
    	Factorials f= new Factorials();
    	int f1=f.factorials(0);
        assertTrue("expected value of zero factorial is 1", f1==1 );
    }
    @Test
    public void testNine()
    {
    	Factorials f= new Factorials();
    	int f1=f.factorials(9);
        assertTrue( f1==362880 );
    }
}