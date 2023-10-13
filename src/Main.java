
public class Main {



    public static void main(String[] args) {
        JavaUniversitat.();
    }
//        JavaUniversitat gruppe = new JavaUniversitat();
//        gruppe.noten={35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
//        gruppe.nichtausreichend(noten);
//        int[] noten = {35, 46, 48, 60, 45, 30, 75, 23, 12, 11, 67, 59, 43, 100, 98};
//        int[] nichtausreichend = ausreichendeNicht(noten);
//
//        System.out.print("Nicht ausreichende Noten:");
//        for (int j : nichtausreichend) {
//            if (j != 0) {
//                System.out.print(j + " ");
//
//            }
//
//        }
//
//
//        float durschnittwert = durschnittWert(noten);
//
//        System.out.print("\nDie Durschnittwert ist ");
//
//        System.out.printf("%.2f", durschnittwert);
//
//        int[] abgerundeten = abgerundetenNoten(noten);
//
//        System.out.print("\nDie abgerundeten Noten: ");
//
//        for (int j : abgerundeten) {
//            if (j != 0) {
//                System.out.print(j + " ");
//
//            }
//
//        }
//        int abgerundetenmax = abgerundetenMax(abgerundeten);
//        System.out.print("\nDie maximale abgerundeten Noten ist " + abgerundetenmax);
//
//        int[] zahlen = {4, 8, 3, 10, 17};
//        int maxzahl = maxZahl(zahlen);
//        System.out.print("\nDie maximale Zahl ist " + maxzahl);
//
//        int minzahl = minZahl(zahlen);
//        System.out.print("\nDie maximale Zahl ist " + minzahl);
//
//        int maxsum = maxSum(zahlen);
//        System.out.print("\nDie maximale Sume ist " + maxsum);
//
//        int minsum = minSum(zahlen);
//        System.out.print("\nDie maximale Sume ist " + minsum);
//
//        int[] arr1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
//        int[] arr2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
//        int[] arr3 = arrSumme(arr1, arr2);
//        System.out.print("\nDie Summe des Zahlen ist ");
//        for (int j : arr3) {
//
//            System.out.print(j + " ");
//
//
//        }
//        int[] arr4 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
//        int[] arr5 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
//        int[] arr6 = arrDiff(arr4, arr5);
//        System.out.print("\nDie Differenz des Zahlen ist ");
//        for (int j : arr6) {
//
//            System.out.print(j + " ");
//
//
//        }
//        int[] arr7 = {8, 3, 6, 0, 0, 0, 0, 0, 0};
//        if (arr7[0] > 4) {
//            int[] arr8 = arrMul(arr7, 2);
//            System.out.print("\nDie Multiplikation des Zahlen ist ");
//            for (int j : arr8) {
//
//                System.out.print(j + " ");
//
//            }
//        } else {
//
//            int[] arr9 = arrMul(arr7, 2);
//            System.out.print("\nDie Multiplikation des Zahlen ist ");
//            for (int j : arr9) {
//
//                System.out.print(j + " ");
//
//
//            }
//
//        }
//        int[] array = {2, 3, 6, 0, 0, 0, 0, 0, 0};
//        int[] arraydiv = arrDiv(array, 2);
//        System.out.print("\nDie Differenz des Zahlen ist ");
//        for (int j : arraydiv) {
//
//            System.out.print(j + " ");
//
//
//        }
//
//        int[] preist = {40, 35, 70, 15, 45};
//        int biligstetastatur = biligsteTastatur(preist);
//        System.out.print("\nDie biligste Tastatur ist " + biligstetastatur);
//
//        int[] preisusb = {20, 15, 40, 30};
//        int teuerestgegenstand = teurestGegenstand(preist, preisusb);
//        System.out.print("\nDie teuerest Gegenstand ist " + teuerestgegenstand);
//
//        int unterbudget = unterBudget(preisusb, 15);
//        System.out.print("\nDie teuerste Tastatur, die Markus kaufen kann, ist  " + unterbudget);
//
//        int kannkaufen = kannKaufen(preist, preisusb, 62);
//        System.out.print("\nDen Deldbetrag die Markus ausgeben wird ist   " + kannkaufen);
//    }

//    public static int[] ausreichendeNicht(int[] noten) {
//        int[] nichtausreichend = new int[100];
//        int cnt = 0;
//        for (int i : noten) {
//            if (i < 40) {
//                cnt++;
//                nichtausreichend[cnt] = i;
//            }
//
//        }
//        return nichtausreichend;
//    }
//
//    public static float durschnittWert(int[] noten) {
//        int cnt = 0;
//        int sum = 0;
//        for (int i : noten) {
//            cnt++;
//            sum = i + sum;
//        }
//        return (float) sum / cnt;
//    }
//
//    public static int[] abgerundetenNoten(int[] noten) {
//        int cnt = 0;
//        int[] abgerundeten = new int[100];
//        for (int i : noten) {
//            if (i < 38 || i % 5 == 0) {
//                //i nu se rotunjeste
//            } else {
//
//                int j = i;
//                boolean x = true;
//                while (x) {
//                    j++;
//                    if (j % 5 == 0) {
//                        x = false;
//                        if ((j - i) < 3) {
//                            abgerundeten[cnt++] = j;
//
//                        }
//
//                    }
//                }
//            }
//        }
//        return abgerundeten;
//    }
//
//
//    public static int abgerundetenMax(int[] abgerundeten) {
//        int max = abgerundeten[0];
//        for (int i = 1; i < abgerundeten.length; i++) {
//            if (abgerundeten[i] > max) {
//                max = abgerundeten[i];
//            }
//        }
//        return max;
//    }

    //problem2
//    public static int maxZahl(int[] zahlen) {
//        int max = zahlen[0];
//        for (int i = 1; i < zahlen.length; i++) {
//            if (zahlen[i] > max) {
//                max = zahlen[i];
//            }
//        }
//        return max;
//    }
//
//    public static int minZahl(int[] zahlen) {
//        int min = zahlen[0];
//        for (int i = 1; i < zahlen.length; i++) {
//            if (zahlen[i] < min) {
//                min = zahlen[i];
//            }
//        }
//        return min;
//    }
//
//    public static int maxSum(int[] zahlen) {
//        int sum = 0;
//        for (int j : zahlen) {
//            sum = j + sum;
//        }
//        int minzahl = minZahl(zahlen);
//        return sum - minzahl;
//    }
//
//    public static int minSum(int[] zahlen) {
//        int sum = 0;
//        for (int j : zahlen) {
//            sum = j + sum;
//        }
//        int maxzahl = maxZahl(zahlen);
//        return sum - maxzahl;
//    }
//    //problem 3
//
//    public static int[] arrSumme(int[] arr1, int[] arr2) {
//        int rest = 0;
//        int[] arr3 = new int[arr1.length + 1];
//        for (int i = arr1.length - 1; i >= 0; i--) {
//
//            if ((arr1[i] + arr2[i]) < 10) {
//                arr3[i] = arr1[i] + arr2[i] + rest;
//                if (arr3[i] >= 10) {
//                    arr3[i] = arr3[i] % 10;
//                    rest = 1;
//                }
//            } else {
//                arr3[i] = (arr1[i] + arr2[i]) % 10 + rest;
//                rest = 1;
//
//            }
//
//        }
//        if (rest == 1) {
//            arr3[0] = rest;
//        }
//        return arr3;
//    }
//
//    public static int[] arrDiff(int[] arr4, int[] arr5) {
//
//        int[] arr6 = new int[arr4.length];
//        for (int i = arr4.length - 1; i >= 0; i--) {
//            if (arr4[i] < arr5[i]) {
//                arr6[i] = arr4[i] + 10 - arr5[i];
//                arr4[i - 1] = arr4[i - 1] - 1;
//
//            } else {
//                arr6[i] = arr4[i] - arr5[i];
//            }
//        }
//        return arr6;
//    }
//
//    public static int[] arrMul(int[] arr7, int ziff) {
//        int rest = 0;
//        int[] arr8 = new int[arr7.length + 1];
//        int[] arr9 = new int[arr8.length + 1];
//
//        for (int i = arr7.length - 1; i >= 0; i--) {
//            if (arr7[i] * ziff > 9) {
//                arr8[i] = (arr7[i] * ziff) % 10 + rest;
//                rest = (arr7[i] * ziff) / 10;
//            } else {
//                arr8[i] = arr7[i] * ziff + rest;
//                if (arr8[i] > 9) {
//                    rest = 1;
//                } else rest = 0;
//            }
//
//        }
//        if (rest > 0) {
//
//            for (int i = arr9.length - 1; i > 0; i--) {
//                arr9[i] = arr8[i - 1];
//            }
//            arr9[0] = rest;
//            return arr9;
//        } else return arr8;
//    }
//
//
//    public static int[] arrDiv(int[] array, int ziff) {
//
//        int[] arraydiv = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % ziff == 0) {
//                arraydiv[i] = array[i] / ziff;
//            } else {
//                arraydiv[i] = array[i] / ziff;
//                array[i + 1] = arraydiv[i] * 10 + array[i + 1];
//            }
//
//        }
//        return arraydiv;
//    }
//
//    //problema 4
//    public static int biligsteTastatur(int[] preist) {
//        int min = preist[0];
//        for (int i = 1; i < preist.length; i++) {
//            if (preist[i] < min) {
//                min = preist[i];
//            }
//        }
//        return min;
//
//    }
//
//    public static int teurestGegenstand(int[] preist, int[] preisusb) {
//        int maxt = preist[0];
//        for (int i = 1; i < preist.length; i++) {
//            if (preist[i] > maxt) {
//                maxt = preist[i];
//            }
//        }
//        int maxu = preisusb[0];
//        for (int i = 1; i < preisusb.length; i++) {
//            if (preisusb[i] > maxu) {
//                maxu = preisusb[i];
//            }
//        }
//        if (maxt > maxu) {
//            return maxt;
//        } else return maxu;
//    }
//
//    public static int unterBudget(int[] preisusb, int budget) {
//        int max = preisusb[0];
//        for (int i = 1; i < preisusb.length; i++) {
//            if (max < preisusb[i] && max < budget) {
//                max = preisusb[i];
//            }
//        }
//        return max;
//    }
//
//    public static int kannKaufen(int[] preist, int[] preisusb, int budget) {
//        int maxpreis = 0;
//        for (int i = 1; i < preist.length; i++) {
//            for (int j = 1; j < preisusb.length; j++) {
//                if ((preist[i] + preisusb[j]) > maxpreis && (preist[i] + preisusb[j] )<=budget) {
//                    maxpreis = preist[i] + preisusb[j];
//                }
//            }
//
//        }
//        if( maxpreis== 0) {
//            return -1;
//        }
//        else
//        {
//            return maxpreis;
//        }
//    }

}

