import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectronicShopTests {
    @Test
    public void biligsteTastatur(){
        int[] input={40, 35, 70, 15, 45};
        int outputExpected=ElectronicShop.biligsteTastatur(input);
        int output=15;
        assertEquals(output,outputExpected);
        System.out.println("\nBiligsteTastatur Test Succes.");

    }
    @Test
    public void teurestGegenstand(){

    }
    @Test
    public void unterBudget(){

    }
    @Test
    public void kannKaufen(){

    }
}
