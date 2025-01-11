import java.util.*;

class QuotientAndReminder {

   public static int[] findRemainderAndQuotient(int number, int divisor) {
      int quotient = number / divisor;
      int reminder = number % divisor;
      return new int[] { quotient, reminder };
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter number");
      int number = sc.nextInt();
      System.out.println("enter divisor");
      int divisor = sc.nextInt();
      int result[] = findRemainderAndQuotient(number, divisor);
      System.out.println("quotient" + result[0]);
      System.out.println("reminder" + result[1]);

   }
}