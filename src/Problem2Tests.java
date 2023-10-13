public class Problem2Tests {
    public static void maxZahl(){
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput=Problem2.maxZahl(input);
        int output=17;
        assert (output==expectedOutput);
        System.out.println("\nMaxZahl Test Succes.");
    }
    public static void minZahl(){
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput=Problem2.maxZahl(input);
        int output=3;
        assert (output==expectedOutput);
        System.out.println("\nMinZahl Test Succes.");
    }
}
