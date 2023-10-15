public class ElectronicShop {

    public static int biligsteTastatur(int[] preist) {
        int min = preist[0];
        for (int i = 1; i < preist.length; i++) {
            if (preist[i] < min) {
                min = preist[i];
            }
        }
        return min;

    }

    public static int teurestGegenstand(int[] preist, int[] preisusb) {
        int maxt = preist[0];
        for (int i = 1; i < preist.length; i++) {
            if (preist[i] > maxt) {
                maxt = preist[i];
            }
        }
        int maxu = preisusb[0];
        for (int i = 1; i < preisusb.length; i++) {
            if (preisusb[i] > maxu) {
                maxu = preisusb[i];
            }
        }
        if (maxt > maxu) {
            return maxt;
        } else return maxu;
    }

    public static int unterBudget(int[] preisusb, int budget) {
        int max = 0;
        for (int i = 1; i < preisusb.length; i++) {
            if (max < preisusb[i] && preisusb[i] <= budget) {
                max = preisusb[i];
            }
        }
        return max;
    }

    public static int kannKaufen(int[] preist, int[] preisusb, int budget) {
        int maxpreis = 0;
        for (int i = 0; i < preist.length; i++) {
            for (int j = 0; j < preisusb.length; j++) {
                if ((preist[i] + preisusb[j]) > maxpreis && (preist[i] + preisusb[j]) <= budget) {
                    maxpreis = preist[i] + preisusb[j];
                }
            }

        }
        if (maxpreis == 0) {
            return -1;
        } else {
            return maxpreis;
        }
    }

}
