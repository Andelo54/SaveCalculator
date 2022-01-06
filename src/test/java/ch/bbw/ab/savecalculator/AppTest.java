package ch.bbw.ab.savecalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 *
 * @author Andelo Batinic
 * @version 6. Januar 2022
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
    public void testZweiPositiveIsOk() {
        SaveCalculator teste = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertEquals(30, teste.summe(value1, value2));
    }

    @Test
    public void testZweiNegativeIstOk() {
        SaveCalculator teste = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertEquals(-10, teste.subtraktion(value1, value2));
    }
}
