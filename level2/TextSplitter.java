import java.util.Scanner;

public class TextSplitter {

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
        // Calculate the length of the string
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

    // Method to compare two String arrays and return true if they are identical
    public static boolean compareArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();  // Use nextLine() to read the full sentence

        // Split the text using the customSplit method
        String[] customWords = customSplit(userInput);

        // Split the text using the built-in split() method
        String[] splitWords = userInput.split("\\s+");

        // Display the results
        System.out.println("Words using custom method:");
        for (String word : customWords) {
            System.out.print(word + " ");
        }
        System.out.println("\n");

        System.out.println("Words using built-in split() method:");
        for (String word : splitWords) {
            System.out.print(word + " ");
        }
        System.out.println("\n");

        // Compare the two arrays
        boolean areArraysEqual = compareArrays(customWords, splitWords);
        System.out.println("Are the two arrays equal? " + areArraysEqual);

        
    }
}
