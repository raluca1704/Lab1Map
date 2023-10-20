public class Problem3 {


    public static int[] arrSumme(int[] termensumm, int[] termensumm2) {
        int rest = 0;
        int[] resultsumm = new int[termensumm.length + 1];
        for (int i = termensumm.length - 1; i >= 0; i--) {

            if ((termensumm[i] + termensumm2[i]) < 10) {
                resultsumm[i] = termensumm[i] + termensumm2[i] + rest;
                if (resultsumm[i] >= 10) {
                    resultsumm[i] = resultsumm[i] % 10;
                    rest = 1;
                }
            } else {
                resultsumm[i] = (termensumm[i] + termensumm2[i]) % 10 + rest;
                rest = 1;

            }

        }
        if (rest == 1) {
            resultsumm[0] = rest;
        }
        return resultsumm;
    }

    public static int[] arrDiff(int[] deimpartit, int[] impartitor) {

        int[] cat = new int[deimpartit.length];
        for (int i = deimpartit.length - 1; i >= 0; i--) {
            if (deimpartit[i] < impartitor[i]) {
                cat[i] = deimpartit[i] + 10 - impartitor[i];
                deimpartit[i - 1] = deimpartit[i - 1] - 1;

            } else {
                cat[i] = deimpartit[i] - impartitor[i];
            }
        }
        return cat;
    }

    public static int[] arrMul(int[] termeninmultire, int ziff) {
        int rest = 0;
        int[] resultinmultire = new int[termeninmultire.length];
        int[] resultinmultiredinminte= new int[resultinmultire.length + 1];

        for (int i = termeninmultire.length - 1; i >= 0; i--) {
            if (termeninmultire[i] * ziff > 9) {
                resultinmultire[i] = (termeninmultire[i] * ziff) % 10 + rest;
                rest = (termeninmultire[i] * ziff) / 10;
            } else {
                resultinmultire[i] = termeninmultire[i] * ziff + rest;
                if (resultinmultire[i] > 9) {
                    resultinmultire[i]=resultinmultire[i]%10;
                    rest = 1;
                } else rest = 0;
            }

        }
        if (rest > 0) {

            for (int i = resultinmultiredinminte.length - 1; i > 0; i--) {
                resultinmultiredinminte[i] = resultinmultire[i - 1];
            }
            resultinmultiredinminte[0] = rest;
            return resultinmultiredinminte;
        } else return resultinmultire;
    }


    public static int[] arrDiv(int[] array, int ziff) {

        int[] arraydiv = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % ziff == 0) {
                arraydiv[i] = array[i] / ziff;
            } else {
                arraydiv[i] = array[i] / ziff;
                array[i + 1] = arraydiv[i] * 10 + array[i + 1];
            }

        }
        return arraydiv;
    }

}
