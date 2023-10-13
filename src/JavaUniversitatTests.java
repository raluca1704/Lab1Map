public class JavaUniversitatTests {
    public static void ausreichendeNichtTest(){
        int[] input={35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
        int[] output=JavaUniversitat.ausreichendeNicht(input);
        int[] expectedOutput = {35, 30, 23, 12, 11};
        assert(output == expectedOutput);
        System.out.println("\nAusreichendeNicht Test Succes.");
    }
    public static void durschnittWert(){
        double input=50.13;
        double output=JavaUniversitat.ausreichendeNicht(input);
        double expectedOutput =50.13;
        assert(output == expectedOutput);
        System.out.println("durschnittWert Test Succes.");
    }
}
