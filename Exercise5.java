import java.util.*;
public class Exercise5 {
    public static void main(String[]args){
        int input = 0;
        int n1 ;
        int n2 ;
        int n3 ;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first  number");
        n1 = sc.nextInt();
        System.out.println("Enter a second  number");
        n2 = sc.nextInt();
        System.out.println("Enter a third number");
        n3 = sc.nextInt();

       // for(int i = 0;i<=input;i++){
            System.out.println("the cube of the first number "+n1*n1*n1);
            System.out.println("the cube of the second number "+n2*n2*n2);
            System.out.println("the cube of the third number" +n3*n3*n3);
            sum = n1*n1*n1+n2*n2*n2+n3*n3*n3;
        System.out.println("sum of the number"+sum);





    }
}
