import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        String a = "abbdcd";
        Alphabet abc = new Alphabet();
        if (abc.india(a))
            System.out.println("Positive");
        else
            System.out.println("not posotive");
}
}
class Alphabet {
    public boolean india(String a) {
        int n = a.length();
        char c[] = new char[n];
        for (int i = 0; i < n; i++) {
            c[i] = a.charAt(i);
        }
        Arrays.sort(c);
        for (int i = 0; i < n; i++)
            if (c[i] != a.charAt(i))
                return false;
        return true;
    }

}




