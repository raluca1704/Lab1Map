import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectronicShopTests {
    @Test
    public void biligsteTastatur() {
        int[] input = {40, 35, 70, 15, 45};
        int outputExpected = ElectronicShop.biligsteTastatur(input);
        int output = 15;
        assertEquals(output, outputExpected);
        System.out.println("\nBiligsteTastatur Test Succes.");

    }

    @Test
    public void teurestGegenstand() {
        int[] input1 = {15, 20, 10, 35};
        int[] input2 = {20, 15, 40, 15};
        int outputExpected = ElectronicShop.teurestGegenstand(input1, input2);
        int output = 40;
        assertEquals(output, outputExpected);
        System.out.println("\nTeurestGegenstand Test Succes.");

    }

    @Test
    public void unterBudget() {
        int[] input1 = {15, 45, 20};
        int input2 = 30;
        int outputExpected = ElectronicShop.unterBudget(input1, input2);
        int output = 20;
        assertEquals(output, outputExpected);
        System.out.println("\nUnterBudget Test Succes.");

    }

    @Test
    public void kannKaufen() {
        int[] input1 = {40, 50, 60};
        int[] input2 = {8, 12};
        int input3 = 60;
        int outputExpected = ElectronicShop.kannKaufen(input1, input2, input3);
        int output = 58;
        assertEquals(output, outputExpected);
        System.out.println("\nKannKaufen Test Succes.");

    }
}
