import java.util.Scanner;

public class WordLengthAnalyzer {

    // Method to calculate the length of a string without using length() method
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Accessing each character
                count++; // Increment count for each character
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when the index goes out of bounds
        }
        return count;
    }

    // Method to split the text into words using charAt() method
    public static String[] splitTextIntoWords(String sentence) {
        int length = findLength(sentence);
        int wordCount = 0;
        boolean inWord = false;

        // Counting words based on spaces
        for (int i = 0; i < length; i++) {
            if (sentence.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (sentence.charAt(i) == ' ') {
                inWord = false;
            }
        }

        // Create an array to store the words
        String[] words = new String[wordCount];
        StringBuilder wordBuilder = new StringBuilder();
        int wordIndex = 0;
        inWord = false;

        // Extracting the words
        for (int i = 0; i < length; i++) {
            char currentChar = sentence.charAt(i);
            if (currentChar != ' ') {
                wordBuilder.append(currentChar);
                inWord = true;
            } else if (currentChar == ' ' && inWord) {
                words[wordIndex++] = wordBuilder.toString();
                wordBuilder.setLength(0); // Reset the builder
                inWord = false;
            }
        }

        // Add the last word if there's any
        if (inWord) {
            words[wordIndex] = wordBuilder.toString();
        }

        return words;
    }

    // Method to return a 2D array of words and their lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findLength(words[i])); // Convert length to string
        }
        return wordLengths;
    }

    // Method to find the shortest and longest words
    public static int[] findShortestAndLongest(String[][] wordLengths) {
        int[] result = new int[2]; // result[0] = shortest, result[1] = longest

        // Initialize with the first word's length
        int minLength = Integer.parseInt(wordLengths[0][1]);
        int maxLength = Integer.parseInt(wordLengths[0][1]);
        String shortestWord = wordLengths[0][0];
        String longestWord = wordLengths[0][0];

        // Loop through the words to find the shortest and longest
        for (String[] wordLength : wordLengths) {
            int currentLength = Integer.parseInt(wordLength[1]);
            if (currentLength < minLength) {
                minLength = currentLength;
                shortestWord = wordLength[0];
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestWord = wordLength[0];
            }
        }

        result[0] = minLength;
        result[1] = maxLength;
        return result;
    }

    // Method to display the result
    public static void displayResult(String[][] wordLengths, int[] result) {
        System.out.println("Shortest word length: " + result[0]);
        System.out.println("Longest word length: " + result[1]);

        System.out.println("\nWords with lengths:");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + " -> " + wordLength[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        // Splitting the input into words
        String[] words = splitTextIntoWords(userInput);

        // Get words and their lengths
        String[][] wordLengths = getWordsAndLengths(words);

        // Find the shortest and longest word lengths
        int[] shortestAndLongest = findShortestAndLongest(wordLengths);

        // Display results
        displayResult(wordLengths, shortestAndLongest);

        // Close the scanner
        scanner.close();
    }
}
