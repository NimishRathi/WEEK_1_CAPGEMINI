import java.util.*;

class ConverToMilesInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km = input.nextInt();
        double Miles = 0.62137119 * km;
        System.out.println("The total miles is " + Miles + " mile for the given km " + km);
    }
}