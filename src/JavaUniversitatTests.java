
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class JavaUniversitatTests {
    @Test
    public void ausreichendeNichtTestGood() {
        //test fur erwarteten fall
        int[] input = {35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
        int[] output = JavaUniversitat.ausreichendeNicht(input);
        int[] expectedOutput = {35, 30, 23, 12, 11};
        assertArrayEquals(expectedOutput, output);
        //System.out.println(Arrays.toString(output));
        System.out.println("\nAusreichendeNicht Test Good Succes.");
    }

    @Test
    public void ausreichendeNichtTestBad() {
        int[] inputBad = {50, 77, 88, 99, 43};
        int[] expectedOutputBad = {32};
        int[] outputBad = JavaUniversitat.ausreichendeNicht(inputBad);
        assertFalse(Arrays.equals(expectedOutputBad, outputBad), "for test to succes array should contain smth");
        System.out.println("\nAusreichendeNicht Test Bad Success.");

    }

    @Test
    public void durschnittWertTest() {
        int[] input = {35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
        double output = JavaUniversitat.durschnittWert(input);
        double expectedOutput = 50.13333511352539;
        //nu merge nicicum sa fac cu 2 decimale
        assertEquals(expectedOutput, output);
        System.out.println("\nDurschnittWert Test Good Succes.");

    }

    @Test
    public void durschnittWertTestBad() {
        int[] inputBad = {35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
        float expectedOutputBad = 32;
        float outputBad = JavaUniversitat.durschnittWert(inputBad);
        assertFalse((expectedOutputBad== outputBad), "for test to succes the given average should be wrong");
        System.out.println("\nDurschnittWert Test Bad Success.");

    }

    @Test
    public void abgerundetenNotenTestGood() {
        int[] input = {35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
        int[] output = JavaUniversitat.abgerundetenNoten(input);
        int[] expectedOutput = {50, 60, 45, 100};
        // System.out.println(Arrays.toString(output));
        assertArrayEquals(expectedOutput, output);
        System.out.println("\nAbgerundetenNoten Test Good Succes.");
    }
    @Test
    public void abgerundetenNotenTestBad() {
        int[] input = {35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
        int[] output = JavaUniversitat.abgerundetenNoten(input);
        int[] expectedOutput = {50};
        // System.out.println(Arrays.toString(output));
        assertFalse(Arrays.equals(expectedOutput, output), "for test to succes array should contain smth wrong");
        System.out.println("\nAbgerundetenNoten Test Bad Succes.");
    }

    @Test
    public void abgerundetenMaxTestGood() {
        int[] input = {35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
        int[] abgerundetenNoten = JavaUniversitat.abgerundetenNoten(input);
        int output = JavaUniversitat.abgerundetenMax(abgerundetenNoten);
        int expectedOutput = 100;
        assertEquals(expectedOutput, output);
        System.out.println("\nAbgerundetenMax Test Good Succes.");
    }
    @Test
    public void abgerundetenMaxTestBad() {
        int[] input = {35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
        int[] abgerundetenNoten = JavaUniversitat.abgerundetenNoten(input);
        int output = JavaUniversitat.abgerundetenMax(abgerundetenNoten);
        int expectedOutput = 9;
        assertFalse((expectedOutput== output), "for test to succes the given output should be wrong");
        System.out.println("\nAbgerundetenMax Test Bad Succes.");
    }
}
