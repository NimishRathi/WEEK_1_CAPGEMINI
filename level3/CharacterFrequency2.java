import java.util.Scanner;

public class CharacterFrequency1 {

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String str) {
        int length = str.length();
        boolean[] isVisited = new boolean[length]; // To keep track of already visited characters
        char[] uniqueChars = new char[length]; // Array to store unique characters
        int uniqueIndex = 0; // Index for uniqueChars array
        
        // Loop through the string to find unique characters
        for (int i = 0; i < length; i++) {
            if (isVisited[i]) {
                continue; // Skip if the character is already visited
            }

            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Check if the character repeats later in the string
            for (int j = i + 1; j < length; j++) {
                if (str.charAt(j) == currentChar) {
                    isVisited[j] = true; // Mark as visited
                    isUnique = false; // Mark as not unique
                }
            }

            if (isUnique) {
                uniqueChars[uniqueIndex++] = currentChar; // Store the unique character
            }
        }

        // Create a final array with only unique characters
        char[] result = new char[uniqueIndex];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueIndex);

        return result;
    }

    // Method to find frequency of characters in the string
    public static String[][] findCharacterFrequency(String str) {
        int[] frequency = new int[256]; // Array to store frequency of characters (256 ASCII characters)

        // Loop through the string to count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequency[currentChar]++; // Increment the frequency of the character
        }

        // Find unique characters in the string
        char[] uniqueChars = findUniqueCharacters(str);

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through the unique characters to store character and its frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Store character
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); // Store frequency
        }

        return result;
    }

    // Method to display the 2D array of characters and their frequencies
    public static void displayCharacterFrequency(String[][] frequencyData) {
        System.out.println("\nCharacter\tFrequency");
        System.out.println("---------------------------");

        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(frequencyData[i][0] + "\t\t" + frequencyData[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the frequency of characters and store them in a 2D array
        String[][] frequencyData = findCharacterFrequency(inputString);

        // Display the result
        displayCharacterFrequency(frequencyData);

        // Close the scanner
        scanner.close();
    }
}
