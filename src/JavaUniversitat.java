public class JavaUniversitat {
    public static int[] ausreichendeNicht(int[] noten) {
        int[] nichtausreichend = new int[100];
        int cnt = 0;
        for (int i : noten) {
            if (i < 40) {
                cnt++;
                nichtausreichend[cnt] = i;
            }

        }
        return nichtausreichend;
    }

    public static float durschnittWert(int[] noten) {
        int cnt = 0;
        int sum = 0;
        for (int i : noten) {
            cnt++;
            sum = i + sum;
        }
        return (float) sum / cnt;
    }

    public static int[] abgerundetenNoten(int[] noten) {
        int cnt = 0;
        int[] abgerundeten = new int[100];
        for (int i : noten) {
            if (i < 38 || i % 5 == 0) {
                //i nu se rotunjeste
            } else {

                int j = i;
                boolean x = true;
                while (x) {
                    j++;
                    if (j % 5 == 0) {
                        x = false;
                        if ((j - i) < 3) {
                            abgerundeten[cnt++] = j;

                        }

                    }
                }
            }
        }
        return abgerundeten;
    }


    public static int abgerundetenMax(int[] abgerundeten) {
        int max = abgerundeten[0];
        for (int i = 1; i < abgerundeten.length; i++) {
            if (abgerundeten[i] > max) {
                max = abgerundeten[i];
            }
        }
        return max;
    }

}
