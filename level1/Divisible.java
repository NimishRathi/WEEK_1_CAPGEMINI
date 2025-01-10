import java.util.*;

public class Divisible {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if (number % 5 == 0) {
      System.out.println("YES devisible");
    } else {
      System.out.println("not devisible");
    }
  }
}
