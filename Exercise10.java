public class Exercise10 {
    public static void main(String[] args) {
        int n = 5;
        int diff = diffrence(n);

        System.out.println("Difference is :  "+ diff);
    }

    public static int diffrence(int n) {
        int sum = 0;
        int SumOfSquare = 0;

        for (int i = 1; i <= n; i++) {
            sum = i*i+sum;
            SumOfSquare = i + SumOfSquare;
        }
        int  diff = sum - (SumOfSquare*SumOfSquare);
        return diff;
    }
}


