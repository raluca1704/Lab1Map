public class Problem2Tests {
    public static void maxZahl(){
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput=Problem2.maxZahl(input);
        int output=17;
        assert (output==expectedOutput):"\nMaxZahl Test Succes.";
    }
    public static void minZahl(){
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput=Problem2.maxZahl(input);
        int output=3;
        assert (output==expectedOutput):"\nMinZahl Test Succes.";
    }
    public static void maxSum(){
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput=Problem2.maxZahl(input);
        int output=39;
        assert (output==expectedOutput):"\nMaxSum Test Succes.";
    }
    public static void minSum(){
        int[] input = {4, 8, 3, 10, 17};
        int expectedOutput=Problem2.maxZahl(input);
        int output=25;
        assert (output==expectedOutput):"\nMinSum Test Succes.";
    }
}
