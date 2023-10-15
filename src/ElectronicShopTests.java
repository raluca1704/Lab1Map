import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ElectronicShopTests {
    @Test
    public void biligsteTastaturTestGood() {
        int[] input = {40, 35, 70, 15, 45};
        int outputExpected = ElectronicShop.biligsteTastatur(input);
        int output = 15;
        assertEquals(output, outputExpected);
        System.out.println("\nBiligsteTastatur Test Good Succes.");

    }
    @Test
    public void biligsteTastaturTestBad() {
        int[] input = {40, 35, 70, 15, 45};
        int outputExpected = ElectronicShop.biligsteTastatur(input);
        int output = 1;
        assertFalse((output==outputExpected), "for test to succes output should be wrong");
        System.out.println("\nBiligsteTastatur Test Bad Succes.");

    }

    @Test
    public void teurestGegenstandTestGood() {
        int[] input1 = {15, 20, 10, 35};
        int[] input2 = {20, 15, 40, 15};
        int outputExpected = ElectronicShop.teurestGegenstand(input1, input2);
        int output = 40;
        assertEquals(output, outputExpected);
        System.out.println("\nTeurestGegenstand Test Good Succes.");

    }
    @Test
    public void teurestGegenstandTestBad() {
        int[] input1 = {15, 20, 10, 35};
        int[] input2 = {20, 15, 40, 15};
        int outputExpected = ElectronicShop.teurestGegenstand(input1, input2);
        int output = 4;
        assertFalse((output==outputExpected), "for test to succes output should be wrong");
        System.out.println("\nTeurestGegenstand Test Bad Succes.");

    }

    @Test
    public void unterBudgetTestGood() {
        int[] input1 = {15, 45, 20};
        int input2 = 30;
        int outputExpected = ElectronicShop.unterBudget(input1, input2);
        int output = 20;
        assertEquals(output, outputExpected);
        System.out.println("\nUnterBudget Test Good Succes.");

    }
    @Test
    public void unterBudgetTestBad() {
        int[] input1 = {15, 45, 20};
        int input2 = 30;
        int outputExpected = ElectronicShop.unterBudget(input1, input2);
        int output = 2;
        assertFalse((output==outputExpected), "for test to succes output should be wrong");
        System.out.println("\nUnterBudget Test Bad Succes.");

    }

    @Test
    public void kannKaufenTestGood() {
        int[] input1 = {40, 50, 60};
        int[] input2 = {8, 12};
        int input3 = 60;
        int outputExpected = ElectronicShop.kannKaufen(input1, input2, input3);
        int output = 58;
        assertEquals(output, outputExpected);
        System.out.println("\nKannKaufen Test Good Succes.");

    }
    @Test
    public void kannKaufenTestBad() {
        int[] input1 = {40, 50, 60};
        int[] input2 = {8, 12};
        int input3 = 60;
        int outputExpected = ElectronicShop.kannKaufen(input1, input2, input3);
        int output = 5;
        assertFalse((output==outputExpected), "for test to succes output should be wrong");
        System.out.println("\nKannKaufen Test Bad Succes.");

    }
}
