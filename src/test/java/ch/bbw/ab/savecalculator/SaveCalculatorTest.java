package ch.bbw.ab.savecalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 *
 * @author Andelo Batinic
 * @version 6. Januar 2022
 */

public class SaveCalculatorTest {
    /**
     * Rigorous Test :-)
     */

    private SaveCalculator teste;
    @Before
    public void createSavCalculatorTeste() {
        teste = new SaveCalculator();
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    // Namensgebung der Testfunktion
    @Test
    public void testZweiPositiveIsOk() {
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

    // @Before und @After

}
