import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem3Tests {
    @Test
    public void arrSumme() {
        int[] input1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] input2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] expectedOutput = Problem3.arrSumme(input1, input2);
        int[] output = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(output, expectedOutput);
        System.out.println("\nArrSumme Test Succes.");

    }

    @Test
    public void arrDiff() {
        int[] input2 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] input1 = {8, 3, 0, 0, 0, 0, 0, 0, 0};

        int[] expectedOutput = Problem3.arrDiff(input1, input2);
        int[] output = {2, 9, 0, 0, 0, 0, 0, 0, 0};
//        System.out.println(Arrays.toString(output));
        assertArrayEquals(output, expectedOutput);
        System.out.println("\nArrDiff Test Succes.");

    }

    @Test
    public void arrMull() {
        int[] input1 = {8, 3, 6, 0, 0, 0, 0, 0, 0};
        int input2 = 2;

        int[] expectedOutput = Problem3.arrMul(input1, input2);
        int[] output = {1, 6, 7, 2, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(output, expectedOutput);
        System.out.println("\nArrMul Test Succes.");


    }

    @Test
    public void arrDiv() {
        int[] input1 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int input2 = 2;

        int[] expectedOutput = Problem3.arrDiv(input1, input2);
        int[] output = {1, 1, 8, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(output, expectedOutput);
        System.out.println("\nArrDiv Test Succes.");


    }


}
