import java.util.*;

class TriangularPark {
  public static int PerimeterOfTriagnle(int side1, int side2, int side3) {
    return 5000 / (side1 + side2 + side3);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter side1");
    int side1 = sc.nextInt();
    System.out.println("enter side2");
    int side2 = sc.nextInt();
    System.out.println("enter side3");
    int side3 = sc.nextInt();
    System.out.println("The number of rounds user needs to do to complete 5km run");
    System.out.println(PerimeterOfTriagnle(side1, side2, side3));
  }
}