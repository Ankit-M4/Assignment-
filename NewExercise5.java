import java.util.*;
public class NewExercise5 {
    public static void main(String[] args) {
        int input = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        input = Integer.parseInt(sc.nextLine());
        int num = input;
      //  int count = 0;
        int sum=0;
            while (num > 0) {
                int a = num % 10;
                System.out.println("Cube of " + a + " is " + (a * a * a));
                num = num / 10;
                sum=sum+(a*a*a);

            }
        System.out.println( "sum of these number"+sum);


        }
        }



