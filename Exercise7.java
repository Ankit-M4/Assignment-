import java.util.Arrays;
public class Exercise7 {
    public static void main(String[] args) {
        int num;
        int n;
        int a[] = {1,21,78,15,18,17,20};
        n = a.length;
        int b[] = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

}


