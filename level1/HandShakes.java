import java.util.*;

class HandShakes {

  public int Calculate(int numberOfStudents) {
    return (numberOfStudents * (numberOfStudents - 1)) / 2;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter numberOfStudents ");
    int numberOfStudents = sc.nextInt();
    HandShakes obj = new HandShakes();
    System.out.println(obj.Calculate(numberOfStudents));

  }
}