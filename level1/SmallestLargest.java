import java.util.*;

class SmallestLargest {
      public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
            int smallest = Math.min(number1, Math.min(number2, number3));
            int largest = Math.max(number1, Math.max(number2, number3));
            return new int[] { smallest, largest };

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number1");
            int number1 = sc.nextInt();
            System.out.println("enter number2");
            int number2 = sc.nextInt();
            System.out.println("enter number3");
            int number3 = sc.nextInt();

            int[] result = findSmallestAndLargest(number1, number2, number3);
            System.out.println("Smallest number is " + result[0]);
            System.out.println("Largest number is " + result[1]);

      }
}