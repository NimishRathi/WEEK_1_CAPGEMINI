import java.util.Scanner;

public class WordLengthSplitter {

    // Method to calculate the length of a string without using the built-in length() method
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

    // Method to split text into words using charAt() without using the split() method
    public static String[] customSplit(String text) {
        int length = calculateLengthWithoutLengthMethod(text);

        // First, count the number of words
        int wordCount = 0;
        boolean inWord = false;

        // Loop through the text to count words based on spaces
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            if (currentChar != ' ' && !inWord) {
                wordCount++;  // Start of a new word
                inWord = true;
            } else if (currentChar == ' ') {
                inWord = false;
            }
        }

        // Create an array to store words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();

        // Loop again to actually extract the words
        inWord = false;
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            if (currentChar != ' ') {
                currentWord.append(currentChar);  // Append character to current word
                inWord = true;
            } else if (currentChar == ' ' && inWord) {
                words[wordIndex++] = currentWord.toString();  // Add completed word to the array
                currentWord.setLength(0);  // Reset current word
                inWord = false;
            }
        }

        // Add the last word if exists
        if (inWord) {
            words[wordIndex] = currentWord.toString();
        }

        return words;
    }

    // Method to convert words and their lengths into a 2D array
    public static String[][] getWordsWithLength(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];  // Word
            wordLengths[i][1] = String.valueOf(calculateLengthWithoutLengthMethod(words[i]));  // Length as String
        }
        return wordLengths;
    }

    // Method to display the 2D array in a tabular format
    public static void displayWordLengthTable(String[][] wordLengths) {
        System.out.println("Word\t\tLength");
        System.out.println("----------------------");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t\t" + Integer.parseInt(wordLength[1])); // Convert String length to Integer for display
        }
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();  // Use nextLine() to read the full sentence

        // Split the text using the customSplit method
        String[] words = customSplit(userInput);

        // Get the words along with their lengths
        String[][] wordLengths = getWordsWithLength(words);

        // Display the word-length table
        displayWordLengthTable(wordLengths);

        // Close the scanner
        scanner.close();
    }
}
