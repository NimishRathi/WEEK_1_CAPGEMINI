import java.util.Scanner;

public class VotingEligibility {

    // Method to generate a 1D array of random ages for n students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            // Generate a random 2-digit age (between 10 and 99)
            ages[i] = 10 + (int)(Math.random() * 90);  // 10 to 99
        }
        return ages;
    }

    // Method to determine whether each student can vote based on their age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2]; // 2D array to store age and voting eligibility

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];

            // Validate if the age is negative (if so, they cannot vote)
            if (age < 0) {
                result[i][0] = String.valueOf(age);
                result[i][1] = "Cannot Vote";
            }
            // Check if the age is 18 or above for voting eligibility
            else if (age >= 18) {
                result[i][0] = String.valueOf(age);
                result[i][1] = "Can Vote";
            } else {
                result[i][0] = String.valueOf(age);
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayVotingEligibility(String[][] result) {
        System.out.println("Age\tCan Vote");
        System.out.println("---------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for number of students (fixed to 10 for this problem)
        int numStudents = 10;
        
        // Generate random ages for 10 students
        int[] studentAges = generateAges(numStudents);

        // Check voting eligibility based on ages
        String[][] votingEligibility = checkVotingEligibility(studentAges);

        // Display the results in a tabular format
        displayVotingEligibility(votingEligibility);

        // Close scanner
        scanner.close();
    }
}
