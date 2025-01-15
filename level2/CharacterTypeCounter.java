import java.util.Scanner;

public class CharacterTypeCounter {

    // Method to check if a character is a vowel, consonant, or not a letter
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

    // Method to check characters in the string and categorize them into Vowel, Consonant, or Not a Letter
    public static String[][] findCharacterTypes(String input) {
        String[][] charTypes = new String[input.length()][2];

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            String charType = checkCharacterType(currentChar);
            
            // Store the character and its type
            charTypes[i][0] = String.valueOf(currentChar);
            charTypes[i][1] = charType;
        }
        return charTypes;
    }

    // Method to display the character types in a tabular format
    public static void displayCharacterTypes(String[][] charTypes) {
        System.out.println("Character\tType");
        System.out.println("--------------------");
        
        for (String[] charType : charTypes) {
            System.out.println(charType[0] + "\t\t" + charType[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find character types (Vowel, Consonant, or Not a Letter)
        String[][] characterTypes = findCharacterTypes(inputString);

        // Display the character types in a tabular format
        displayCharacterTypes(characterTypes);

        // Close the scanner
        scanner.close();
    }
}
