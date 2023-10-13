
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static java.lang.Math.round;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaUniversitatTests {
    @Test
    public void ausreichendeNichtTest(){
        int[] input={35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
        int[] output=JavaUniversitat.ausreichendeNicht(input);
        int[] expectedOutput = {35, 30, 23, 12, 11};
       assertArrayEquals(expectedOutput,output);
        //System.out.println(Arrays.toString(output));
        System.out.println("\nAusreichendeNicht Test Succes.");
    }
    @Test
    public void durschnittWert(){
        int[] input={35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
        double output=JavaUniversitat.durschnittWert(input);
        double expectedOutput =50.13333511352539;
        //nu merge nicicum sa fac cu 2 decimale
        assertEquals(expectedOutput,output);
        System.out.println("\nDurschnittWert Test Succes.");

    }
    @Test
    public  void abgerundetenNoten(){
        int[] input={35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
        int[] output=JavaUniversitat.abgerundetenNoten(input);
        int[] expectedOutput ={50, 60, 45, 100};
        System.out.println(Arrays.toString(output));
        assertArrayEquals(expectedOutput,output);
        System.out.println("\nAbgerundetenNoten Test Succes.");
    }
    public static void abgerundetenMax(){
        int[] input={35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
        int output=JavaUniversitat.abgerundetenMax(input);
        int expectedOutput =100;
        assert(output == expectedOutput);
        System.out.println("\nAbgerundetenMax Test Succes.");
    }
}
