public class Exercise9 {
    public static void main(String[] args) {
        diffrence diff = new diffrence();
      //  diff.calculate_sum();
        System.out.println(diff.calculate_sum());
    }
}
    class diffrence {



        public int calculate_sum() {
            int number = 15;
            int sum = 0;
            int sum1 = 1;
            int Allsum = 0;
            for (int i = 1; i <= number; i++) {
                sum = sum + i / 3;
                sum1 = sum + i / 5;
                Allsum = sum + sum1;

            }
            return Allsum;
        }
    }


