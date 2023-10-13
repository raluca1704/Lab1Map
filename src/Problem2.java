public class Problem2 {

    public static int maxZahl(int[] zahlen) {
        int max = zahlen[0];
        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] > max) {
                max = zahlen[i];
            }
        }
        return max;
    }

    public static int minZahl(int[] zahlen) {
        int min = zahlen[0];
        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] < min) {
                min = zahlen[i];
            }
        }
        return min;
    }

    public static int maxSum(int[] zahlen) {
        int sum = 0;
        for (int j : zahlen) {
            sum = j + sum;
        }
        int minzahl = minZahl(zahlen);
        return sum - minzahl;
    }

    public static int minSum(int[] zahlen) {
        int sum = 0;
        for (int j : zahlen) {
            sum = j + sum;
        }
        int maxzahl = maxZahl(zahlen);
        return sum - maxzahl;
    }
}
