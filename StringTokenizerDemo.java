import java.util.*;
public class StringTokenizerDemo {
    public static void main(String[]args){
        int a = 0;
        String b;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integers");
        b = sc.nextLine();
        StringTokenizer set  = new StringTokenizer(b);
        while (set.hasMoreElements()){
            String temp = set.nextToken();
            a = Integer.parseInt(temp);
            System.out.println(a);
            sum = sum + a;

        }
        System.out.println("sum of the integers is:"+sum);

    }

}
