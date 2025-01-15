import java.util.Scanner;

public class StringLengthCalculator {

    // Method to calculate string length without using length() method
    public static int calculateLengthWithoutLengthMethod(String str) {
        int length = 0;
        try {
            // Infinite loop until an exception occurs (out of bounds)
            while (true) {
                str.charAt(length);  // Accessing each character of the string
                length++;  // Increase the length for each character
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Catch the exception when the index exceeds the string length
        }
        return length;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input a string
        System.out.print("Enter a string: ");
        String userInput = scanner.next(); // Use next() to read a single word input
        
        // Calculate string length using the user-defined method
        int customLength = calculateLengthWithoutLengthMethod(userInput);
        
        // Display the result
        System.out.println("Length of the string using custom method: " + customLength);
        
        // Display the result using the built-in length() method
        System.out.println("Length of the string using built-in length() method: " + userInput.length());
    }
}
