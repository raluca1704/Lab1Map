import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Problem3Tests {
    @Test
    public void arrSumme(){
        int[] input1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] input2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] expectedOutput=Problem3.arrSumme(input1, input2);
        int[] output={1,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(output,expectedOutput);
        System.out.println("\nArrSumme Test Succes.");

    }
    @Test
    public void arrDiff(){

    }
    @Test
    public void arrMull(){

    }
    @Test
    public void arrDiv(){

    }


}
