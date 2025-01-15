import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String str) {
        char[] chars = str.toCharArray(); // Convert the string to a char array
        int[] frequency = new int[chars.length]; // Array to store frequency of each character
        String[] result = new String[chars.length]; // Array to store characters and their frequencies
        
        // Outer loop to go through each character in the string
        for (int i = 0; i < chars.length; i++) {
            // Skip if the character is already counted
            if (chars[i] == '0') {
                continue;
            }

            // Initialize frequency to 1 for each character
            frequency[i] = 1;
            
            // Inner loop to find duplicates of the current character
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++; // Increment frequency for duplicates
                    chars[j] = '0'; // Mark the duplicate character as '0'
                }
            }
        }

        // Store characters and their frequencies in the result array
        int resultIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[resultIndex] = chars[i] + ":" + frequency[i];
                resultIndex++;
            }
        }

        // Create a new array to return the exact size of the result array
        String[] finalResult = new String[resultIndex];
        System.arraycopy(result, 0, finalResult, 0, resultIndex);

        return finalResult;
    }

    // Method to display the frequency of characters
    public static void displayCharacterFrequency(String[] frequencyData) {
        System.out.println("\nCharacter Frequency:");
        for (String data : frequencyData) {
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the method to find the frequency of characters
        String[] frequencyData = findCharacterFrequency(inputString);

        // Display the result
        displayCharacterFrequency(frequencyData);

        // Close the scanner
        scanner.close();
    }
}
