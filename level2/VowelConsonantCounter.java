import java.util.Scanner;

public class VowelConsonantCounter {

    // Check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char c) {
        // Convert to lowercase for uniformity
        char lowerChar = Character.toLowerCase(c);
        
        // Check if it's a vowel
        if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
            return "Vowel";
        }
        // If it's a letter and not a vowel, it's a consonant
        else if (lowerChar >= 'a' && lowerChar <= 'z') {
            return "Consonant";
        }
        // If it's neither a vowel nor consonant
        else {
            return "Not a Letter";
        }
    }

    // Count vowels and consonants in the given string
    public static int[] countVowelsAndConsonants(String input) {
        int[] counts = new int[2];  // counts[0] = vowels, counts[1] = consonants

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            String result = checkCharacterType(currentChar);
            
            // Update the count based on the character type
            if (result.equals("Vowel")) {
                counts[0]++;
            } else if (result.equals("Consonant")) {
                counts[1]++;
            }
        }
        return counts;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Get vowel and consonant counts
        int[] result = countVowelsAndConsonants(inputString);

        // Display the results
        System.out.println("Number of vowels: " + result[0]);
        System.out.println("Number of consonants: " + result[1]);

        // Close scanner to prevent resource leak
        scanner.close();
    }
}
