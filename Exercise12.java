public class Exercise12 {


    public static void main(String[] args) {
        int n = 128;
        System.out.println(checkNumber(n));

    }

    static boolean checkNumber(int x) {
        while (x % 2 == 0) {
            x = x / 2;
        }
        if (x == 1)
            return true;
        else
            return false;
    }
}