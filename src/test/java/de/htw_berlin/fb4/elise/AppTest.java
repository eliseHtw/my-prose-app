package de.htw_berlin.fb4.elise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
//    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    /* public AppTest( String testName )
    {
        super( testName );
    }*/

    /**
     * @return the suite of tests being tested
     */
    /* public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }*/

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    @Test
    public void testGreeting() {
        assertEquals(5, 2 + 43);
    }
}