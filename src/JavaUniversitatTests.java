public class JavaUniversitatTests {
    public static void ausreichendeNichtTest(){
        int[] input={35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
        int[] output=JavaUniversitat.ausreichendeNicht(input);
        int[] expectedOutput = {35, 30, 23, 12, 11};
        assert(output == expectedOutput);
        System.out.println("\nAusreichendeNicht Test Succes.");
    }
    public static void durschnittWert(){
        int[] input={35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
        double output=JavaUniversitat.durschnittWert(input);
        double expectedOutput =50.13;
        assert(output == expectedOutput);
        System.out.println("\nDurschnittWert Test Succes.");
    }
    public static void abgerundetenNoten(){
        int[] input={35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
        int[] output=JavaUniversitat.abgerundetenNoten(input);
        int[] expectedOutput ={50,60,45,100};
        assert(output == expectedOutput);
        System.out.println("\nAbgerundetenNoten Test Succes.");
    }
    public static void abgerundetenMax(){
        int[] input={35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
        int output=JavaUniversitat.abgerundetenMax(input);
        int expectedOutput =100;
        assert(output == expectedOutput);
        System.out.println("\nAbgerundetenMax Test Succes.");
    }
}
