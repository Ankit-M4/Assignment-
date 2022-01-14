public class Exercise8 {
    public static void main(String[] args) {
        int[] a = {10,11,5,2, 12, 13, 14, 12, 15, 16, 18, 85};
        int min;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] >a[j]) {
                    min = a[i];
                    a[i] = a[j];
                    a[j] = min;
                }

                // System.out.println(max);
            }
        }
        System.out.println(a[1]);
    }
}
