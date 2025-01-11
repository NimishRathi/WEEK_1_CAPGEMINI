import java.util.*;

class Chocolates {

   public static int[] findRemainderAndQuotient(int number, int divisor) {
      int quotient = number / divisor;
      int reminder = number % divisor;
      return new int[] { quotient, reminder };
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter number of choclate");
      int number = sc.nextInt();
      System.out.println("enter number of students  ");
      int divisor = sc.nextInt();
      int result[] = findRemainderAndQuotient(number, divisor);
      System.out.println("number of choclate each student will get " + result[0]);
      System.out.println("remaining choclate" + result[1]);

   }
}