package ch.bbw.ab.savecalculator;

/**
 * Application
 * @author Andelo Batinic
 * @version 27. Januar 2022
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "The Save Calculation!" );
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Hmm wieso ergibt das ohne Fehlermeldung einfach -2 ???");
        System.out.println("Das kann nicht stimmen!");
        System.out.println();

        System.out.println("Sicher rechnen mit dem SaveCalculator");
        SaveCalculator calculator = new SaveCalculator();
        System.out.println("10 + 10: " + calculator.summe(10, 10));
        System.out.println("End");
    }
}
