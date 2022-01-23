package ch.bbw.ab.savecalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 *
 * @author Andelo Batinic
 * @version 27. Januar 2022
 */

public class SaveCalculatorTest {
    /**
     * Rigorous Test :-)
     */

    // @Before
    private SaveCalculator testee;
    @Before
    public void createSavCalculatorTeste() {
        testee = new SaveCalculator();
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    // Namensgebung der Testfunktion
    @Test
    public void testSumZweiPositiveIsOk() {
        int value1 = 10;
        int value2 = 20;
        assertEquals(30, testee.summe(value1, value2));
    }

    @Test
    public void testSubZweiNegativeIstOk() {
        int value1 = 10;
        int value2 = 20;
        assertEquals(-10, testee.subtraktion(value1, value2));
    }

    //Unittest zu Exceptionhandling
    @Test
    public void testZweiSumMaxValueIsNotOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MAX_VALUE;
        testee.summe(value1, value2);
    }

    @Test
    public void testSubMinValueMaxValueIsNotOk() {
        int value1 = Integer.MIN_VALUE;
        int value2 = Integer.MAX_VALUE;
        testee.subtraktion(value1, value2);
    }

    //Sichbarkeit
    @Test
    public void testVolumenDreiPositivIstOk() {
        int breite = 10;
        int laenge = 10;
        int hoehe = 10;
        testee.volumen(breite, laenge, hoehe);
    }

    //Äquivalenzklassen
    //Addition
    @Test
    public void testSumZweiPositiveIstOk() {
        int value1 = 23;
        int value2 = 37;
        testee.summe(value1, value2);
    }

    @Test
    public void testSumEinPositiveEinNegativeIstOk() {
        int value1 = -23;
        int value2 = 37;
        testee.summe(value1, value2);
    }

    @Test
    public void testSumEinPostiveMitNullIstOk() {
        int value1 = 0;
        int value2 = 37;
        testee.summe(value1, value2);
    }

    @Test
    public void testSumEinPositiveMaxValueIstNotOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 37;
        testee.summe(value1, value2);
    }

    @Test
    public void testSumZweiNegativeIstOk() {
        int value1 = -23;
        int value2 = -37;
        testee.summe(value1, value2);
    }

    @Test
    public void testSumNullMaxValueIstOk() {
        int value1 = 0;
        int value2 = Integer.MAX_VALUE;
        testee.summe(value1, value2);
    }

    @Test
    public void testSumMaxValueMinValueIstOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MIN_VALUE;
        testee.summe(value1, value2);
    }

    @Test
    public void testSumeEinNegativeMinusNullIstOk() {
        int value1 = -54;
        int value2 = -0;
        testee.summe(value1, value2);
    }
}
