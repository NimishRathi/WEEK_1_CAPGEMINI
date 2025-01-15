import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the string without using the length() method
    public static int findStringLength(String str) {
        int length = 0;
        // Loop through the string until we reach the end
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Catch exception when we reach the end of the string
        }
        return length;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String str) {
        int length = findStringLength(str);
        boolean[] visited = new boolean[length]; // Array to track if a character has been checked
        char[] uniqueChars = new char[length]; // Array to store unique characters
        int uniqueIndex = 0; // Index for unique characters array
        
        // Outer loop to iterate over each character in the string
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if the character has appeared before
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, store it in the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueIndex++] = currentChar;
            }
        }

        // Create a final array with the exact size for unique characters
        char[] result = new char[uniqueIndex];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueIndex);

        return result;
    }

    // Method to display the result of unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        if (uniqueChars.length == 0) {
            System.out.println("No unique characters found.");
        } else {
            System.out.print("Unique characters: ");
            for (char c : uniqueChars) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find unique characters using user-defined methods
        char[] uniqueChars = findUniqueCharacters(inputString);

        // Display the result
        displayUniqueCharacters(uniqueChars);

        // Close scanner
        scanner.close();
    }
}
