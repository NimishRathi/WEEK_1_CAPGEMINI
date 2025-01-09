import java.util.*;

public class AreaTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();

        double areaTriangle = 0.5 * base * height;

        System.out.println("The Area of Triangle is: " + areaTriangle);
    }
}