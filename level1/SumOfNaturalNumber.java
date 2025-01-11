import java.util.*;

class SumOfNaturalNumber {

   public static int sumNumber(int number, int sum) {
      for (int i = 1; i <= number; i++) {
         sum = sum + i;
      }
      return sum;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int sum = 0;
      System.out.println("enter the number");
      int number = sc.nextInt();
      System.out.println("Sum of the number is ");
      System.out.println(sumNumber(number, sum));

   }
}