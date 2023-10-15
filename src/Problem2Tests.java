import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Problem2Tests {
    @Test
    public void maxZahlTestGood() {
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput = Problem2.maxZahl(input);
        int output = 17;
        assertEquals(output, expectedOutput);
        System.out.println("\nMaxZahl Test Good Succes.");
    }
    @Test
    public void maxZahlTestBad() {
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput = Problem2.maxZahl(input);
        int output = 3;
        assertFalse((output== expectedOutput), "for test to succes the output should be wrong");
        System.out.println("\nMaxZahl Test Succes.");
    }

    @Test
    public void minZahlTestGood() {
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput = Problem2.minZahl(input);
        int output = 3;
        assertEquals(output, expectedOutput);
        System.out.println("\nMinZahl Test Good Succes.");
    }
    @Test
    public void minZahlTestBad() {
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput = Problem2.minZahl(input);
        int output = 4;
        assertFalse((output== expectedOutput), "for test to succes the output should be wrong");
        System.out.println("\nMinZahl Test Bad Succes.");
    }

    @Test
    public void maxSumTestGood() {
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput = Problem2.maxSum(input);
        int output = 39;
        assertEquals(output, expectedOutput);
        System.out.println("\nMaxSum Test Good Succes.");
    }
    @Test
    public void maxSumTestBad() {
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput = Problem2.maxSum(input);
        int output = 30;
        assertFalse((output== expectedOutput), "for test to succes the output should be wrong");
        System.out.println("\nMaxSum Test Bad Succes.");
    }

    @Test
    public void minSumTestGood() {
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput = Problem2.minSum(input);
        int output = 25;
        assertEquals(output, expectedOutput);
        System.out.println("\nMinSum Test Good Succes.");
    }
    @Test
    public void minSumTestBad() {
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput = Problem2.minSum(input);
        int output = 24;
        assertFalse((output== expectedOutput), "for test to succes the output should be wrong");
        System.out.println("\nMinSum Test Bad Succes.");
    }
}
