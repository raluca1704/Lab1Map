
public class Main {


    public static void main(String[] args) {

        int[] noten = {35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};

        int[] nichtausreichend = JavaUniversitat.ausreichendeNicht(noten);

        System.out.print("Nicht ausreichende Noten:");
        for (int j : nichtausreichend) {
            if (j != 0) {
                System.out.print(j + " ");

            }
        }
        float durschnittwert = JavaUniversitat.durschnittWert(noten);

        System.out.print("\nDie Durschnittwert ist ");

        System.out.printf("%.2f", durschnittwert);

        int[] abgerundeten = JavaUniversitat.abgerundetenNoten(noten);

        System.out.print("\nDie abgerundeten Noten: ");

        for (int j : abgerundeten) {
            if (j != 0) {
                System.out.print(j + " ");

            }

        }
        int abgerundetenmax = JavaUniversitat.abgerundetenMax(abgerundeten);
        System.out.print("\nDie maximale abgerundeten Noten ist " + abgerundetenmax);

        int[] zahlen = {4, 8, 3, 10, 17};
        int maxzahl = Problem2.maxZahl(zahlen);
        System.out.print("\nDie maximale Zahl ist " + maxzahl);

        int minzahl = Problem2.minZahl(zahlen);
        System.out.print("\nDie minimale Zahl ist " + minzahl);

        int maxsum = Problem2.maxSum(zahlen);
        System.out.print("\nDie maximale Sume ist " + maxsum);

        int minsum = Problem2.minSum(zahlen);
        System.out.print("\nDie minimale Sume ist " + minsum);

        int[] arr1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] arr2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] arr3 = Problem3.arrSumme(arr1, arr2);
        System.out.print("\nDie Summe des Zahlen ist ");
        for (int j : arr3) {

            System.out.print(j + " ");


        }
        int[] arr4 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] arr5 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] arr6 = Problem3.arrDiff(arr4, arr5);
        System.out.print("\nDie Differenz des Zahlen ist ");
        for (int j : arr6) {

            System.out.print(j + " ");


        }
        int[] arr7 = {8, 3, 6, 0, 0, 0, 0, 0, 0};
        if (arr7[0] > 4) {
            int[] arr8 = Problem3.arrMul(arr7, 2);
            System.out.print("\nDie Multiplikation des Zahlen ist ");
            for (int j : arr8) {

                System.out.print(j + " ");

            }
        } else {

            int[] arr9 = Problem3.arrMul(arr7, 2);
            System.out.print("\nDie Multiplikation des Zahlen ist ");
            for (int j : arr9) {

                System.out.print(j + " ");


            }

        }
        int[] array = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int[] arraydiv = Problem3.arrDiv(array, 2);
        System.out.print("\nDie Differenz des Zahlen ist ");
        for (int j : arraydiv) {

            System.out.print(j + " ");


        }

        int[] preist = {40, 35, 70, 15, 45};
        int biligstetastatur = ElectronicShop.biligsteTastatur(preist);
        System.out.print("\nDie biligste Tastatur ist " + biligstetastatur);

        int[] preisusb = {20, 15, 40, 30};
        int teuerestgegenstand = ElectronicShop.teurestGegenstand(preist, preisusb);
        System.out.print("\nDie teuerest Gegenstand ist " + teuerestgegenstand);

        int unterbudget = ElectronicShop.unterBudget(preisusb, 15);
        System.out.print("\nDie teuerste Tastatur, die Markus kaufen kann, ist  " + unterbudget);

        int kannkaufen = ElectronicShop.kannKaufen(preist, preisusb, 62);
        System.out.print("\nDen Deldbetrag die Markus ausgeben wird ist   " + kannkaufen);

        //JavaUniversitatTests.ausreichendeNichtTest();
        JavaUniversitatTests.durschnittWert();
        JavaUniversitatTests.abgerundetenMax();
        JavaUniversitatTests.abgerundetenNoten();
        Problem2Tests.maxZahl();
        Problem2Tests.minZahl();
        Problem2Tests.maxSum();
        Problem2Tests.minSum();

//        var test = new JavaUniversitatTests;
//        test.ausreichendeNichtTest();

    }


}




