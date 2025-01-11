import java.util.*;

class CalculateWind {
     public static double calculateWindChill(double temp, double windSpeed) {
          double windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
          return windChill;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter  temperature");
          double temp = sc.nextDouble();
          System.out.println("enter windSpeed  ");
          double windSpeed = sc.nextDouble();
          System.out.println(calculateWindChill(temp, windSpeed));

     }
}