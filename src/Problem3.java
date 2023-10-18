public class Problem3 {


    public static int[] arrSumme(int[] arr1, int[] arr2) {
        int rest = 0;
        int[] arr3 = new int[arr1.length + 1];
        for (int i = arr1.length - 1; i >= 0; i--) {

            if ((arr1[i] + arr2[i]) < 10) {
                arr3[i] = arr1[i] + arr2[i] + rest;
                if (arr3[i] >= 10) {
                    arr3[i] = arr3[i] % 10;
                    rest = 1;
                }
            } else {
                arr3[i] = (arr1[i] + arr2[i]) % 10 + rest;
                rest = 1;

            }

        }
        if (rest == 1) {
            arr3[0] = rest;
        }
        return arr3;
    }

    public static int[] arrDiff(int[] arr4, int[] arr5) {

        int[] arr6 = new int[arr4.length];
        for (int i = arr4.length - 1; i >= 0; i--) {
            if (arr4[i] < arr5[i]) {
                arr6[i] = arr4[i] + 10 - arr5[i];
                arr4[i - 1] = arr4[i - 1] - 1;

            } else {
                arr6[i] = arr4[i] - arr5[i];
            }
        }
        return arr6;
    }

    public static int[] arrMul(int[] arr7, int ziff) {
        int rest = 0;
        int[] arr8 = new int[arr7.length];
        int[] arr9 = new int[arr8.length + 1];

        for (int i = arr7.length - 1; i >= 0; i--) {
            if (arr7[i] * ziff > 9) {
                arr8[i] = (arr7[i] * ziff) % 10 + rest;
                rest = (arr7[i] * ziff) / 10;
            } else {
                arr8[i] = arr7[i] * ziff + rest;
                if (arr8[i] > 9) {
                    arr8[i]=arr8[i]%10;
                    rest = 1;
                } else rest = 0;
            }

        }
        if (rest > 0) {

            for (int i = arr9.length - 1; i > 0; i--) {
                arr9[i] = arr8[i - 1];
            }
            arr9[0] = rest;
            return arr9;
        } else return arr8;
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
