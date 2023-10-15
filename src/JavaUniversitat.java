

public class JavaUniversitat {
    public static int[] ausreichendeNicht(int[] noten) {
        int cnt = 0;
        for (int i : noten) {
            if (i < 40) {
                cnt++;
            }
        }
        int[] nichtausreichend = new int[cnt];
        cnt = 0;
        for (int i : noten) {
            if (i < 40) {

                nichtausreichend[cnt] = i;
                cnt++;
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

        float res = (float) sum / cnt;

        return res;
    }

    public static int[] abgerundetenNoten(int[] noten) {
        int cnt = 0;
        for (int v=0;v<noten.length; v++) {
            if (noten[v] > 38 && noten[v] % 5 != 0 ){
                if(noten[v]%10!=1 && noten[v]%10!=2 && noten[v]%10!=6 && noten[v]%10!=7){
                cnt++;
                }
            }
        }
        int[] abgerundeten = new int[cnt];

            cnt = 0;
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
                                abgerundeten[cnt] = j;
                                cnt++;

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
