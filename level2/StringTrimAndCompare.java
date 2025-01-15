import java.util.Scanner;

public class StringTrimAndCompare {

    // Method to find the start and end points to trim the leading and trailing spaces
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the first non-space character (leading space)
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character (trailing space)
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt() method
    public static String createSubstring(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String inputString = scanner.nextLine();

        // Use charAt() method to find the trim indices
        int[] trimIndices = findTrimIndices(inputString);

        // Create a substring using the trim indices
        String trimmedString = createSubstring(inputString, trimIndices[0], trimIndices[1]);

        // Use the built-in trim() method to trim spaces
        String trimmedUsingBuiltIn = inputString.trim();

        // Compare the two strings
        boolean areEqual = compareStrings(trimmedString, trimmedUsingBuiltIn);

        // Display the result
        System.out.println("\nTrimmed string using charAt(): '" + trimmedString + "'");
        System.out.println("Trimmed string using built-in trim(): '" + trimmedUsingBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + areEqual);

        // Close scanner
        scanner.close();
    }
}
