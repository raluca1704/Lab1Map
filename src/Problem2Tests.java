import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem2Tests {
    @Test
    public void maxZahl() {
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput = Problem2.maxZahl(input);
        int output = 17;
        assertEquals(output, expectedOutput);
        System.out.println("\nMaxZahl Test Succes.");
    }

    @Test
    public void minZahl() {
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput = Problem2.minZahl(input);
        int output = 3;
        assertEquals(output, expectedOutput);
        System.out.println("\nMinZahl Test Succes.");
    }

    @Test
    public void maxSum() {
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput = Problem2.maxSum(input);
        int output = 39;
        assertEquals(output, expectedOutput);
        System.out.println("\nMaxSum Test Succes.");
    }

    @Test
    public void minSum() {
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput = Problem2.minSum(input);
        int output = 25;
        assertEquals(output, expectedOutput);
        System.out.println("\nMinSum Test Succes.");
    }
}
