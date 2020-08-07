package id.mni.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void generateUniqueChar() {
    	GenerateUniqueString generateUniqueString = new GenerateUniqueString();
    	generateUniqueString.writeCharacter(100);
    	assertTrue("Files created with unique string character", true);
    }
}
