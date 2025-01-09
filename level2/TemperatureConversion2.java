import java.util.*;

public class TemperatureConversion2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int fahrenheit = input.nextInt();

    int celsiusResult = (fahrenheit - 32) * 5 / 9;

    System.out.println("The " + fahrenheit + "  fahrenheit is " + celsiusResult + " celsius");
  }
}