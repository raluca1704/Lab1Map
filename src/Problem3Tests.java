import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Problem3Tests {
    @Test
    public void arrSummeTestGood() {
        int[] input1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] input2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] expectedOutput = Problem3.arrSumme(input1, input2);
        int[] output = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(output, expectedOutput);
        System.out.println("\nArrSumme Test Good Succes.");

    }

    @Test
    public void arrSummeTestBad() {
        int[] input1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] input2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] expectedOutput = Problem3.arrSumme(input1, input2);
        int[] output = {3, 0, 0, 0, 0, 0, 0, 0, 0};
        assertFalse(Arrays.equals(expectedOutput, output), "for test to succes array should contain smth wrong");
        System.out.println("\nArrSumme Test Bad Succes.");

    }


    @Test
    public void arrDiffTestGood() {
        int[] input2 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] input1 = {8, 3, 0, 0, 0, 0, 0, 0, 0};

        int[] expectedOutput = Problem3.arrDiff(input1, input2);
        int[] output = {2, 9, 0, 0, 0, 0, 0, 0, 0};
//        System.out.println(Arrays.toString(output));
        assertArrayEquals(output, expectedOutput);
        System.out.println("\nArrDiff Test Good Succes.");

    }
    @Test
    public void arrDiffTestBad() {
        int[] input2 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] input1 = {8, 3, 0, 0, 0, 0, 0, 0, 0};

        int[] expectedOutput = Problem3.arrDiff(input1, input2);
        int[] output = {3, 9, 0, 0, 0, 0, 0, 0, 0};
//        System.out.println(Arrays.toString(output));
        assertFalse(Arrays.equals(expectedOutput, output), "for test to succes array should contain smth wrong");
        System.out.println("\nArrDiff Test Bad Succes.");

    }

    @Test
    public void arrMulTest2Good() {
        int[] input1 = {9};
        int input2 = 2;

        int[] expectedOutput = Problem3.arrMul(input1, input2);
        int[] output = {1,8};
        assertArrayEquals(output, expectedOutput);
        System.out.println("\nArrMul Test Good Succes.");


    }
    @Test
    public void arrMulTestGood() {
        int[] input1 = {8, 3, 6, 0};
        int input2 = 3;

        int[] expectedOutput = Problem3.arrMul(input1, input2);
        int[] output = {2, 5, 0, 8, 0};
        assertArrayEquals(output, expectedOutput);
        System.out.println("\nArrMul Test Good Succes.");


    }
    @Test
    public void arrMulTestBad() {
        int[] input1 = {8, 3, 6, 0, 0, 0, 0, 0, 0};
        int input2 = 2;

        int[] expectedOutput = Problem3.arrMul(input1, input2);
        int[] output = { 6, 7, 2, 0, 0, 0, 0, 0, 0, 0};
        assertFalse(Arrays.equals(expectedOutput, output), "for test to succes array should contain smth wrong");
        System.out.println("\nArrMul Test Bad Succes.");


    }

    @Test
    public void arrDivTestGood() {
        int[] input1 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int input2 = 2;

        int[] expectedOutput = Problem3.arrDiv(input1, input2);
        int[] output = {1, 1, 8, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(output, expectedOutput);
        System.out.println("\nArrDiv Test Good Succes.");


    }
    @Test
    public void arrDivTestBad() {
        int[] input1 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int input2 = 2;

        int[] expectedOutput = Problem3.arrDiv(input1, input2);
        int[] output = {6,1, 8, 0, 0, 0, 0, 0, 0};
        assertFalse(Arrays.equals(expectedOutput, output), "for test to succes array should contain smth wrong");
        System.out.println("\nArrDiv Test Bad Succes.");


    }


}
