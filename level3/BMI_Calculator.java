import java.util.Scanner;

public class BMI_Calculator {

    // Method to compute BMI and status for each person
    public static String[][] calculateBMIAndStatus(double[][] personData) {
        String[][] bmiData = new String[personData.length][4]; // 2D array to store Height, Weight, BMI, and Status
        
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];  // Weight in kg
            double heightCm = personData[i][1]; // Height in cm
            double heightM = heightCm / 100; // Convert cm to meters
            double bmi = weight / (heightM * heightM); // BMI formula
            
            String status = getStatus(bmi); // Get BMI status
            
            // Store the data in the result array
            bmiData[i][0] = String.valueOf(heightCm);
            bmiData[i][1] = String.valueOf(weight);
            bmiData[i][2] = String.format("%.2f", bmi); // Format BMI to 2 decimal places
            bmiData[i][3] = status;
        }
        
        return bmiData;
    }

    // Method to determine the BMI status based on BMI value
    public static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    // Method to take height and weight data, calculate BMI and return a 2D array
    public static String[][] getBMIDataFromUser() {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][2]; // 2D array to store weight and height of 10 people
        
        // Taking user input for height and weight of 10 individuals
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data for person " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Height (in cm): ");
            personData[i][1] = scanner.nextDouble();
        }
        
        return calculateBMIAndStatus(personData);
    }

    // Method to display the BMI data in a tabular format
    public static void displayBMIData(String[][] bmiData) {
        System.out.println("\nPerson\tHeight (cm)\tWeight (kg)\tBMI\t\tStatus");
        System.out.println("----------------------------------------------------------");
        
        for (int i = 0; i < bmiData.length; i++) {
            System.out.println((i + 1) + "\t" + bmiData[i][0] + "\t\t" + bmiData[i][1] + "\t\t" + bmiData[i][2] + "\t\t" + bmiData[i][3]);
        }
    }

    public static void main(String[] args) {
        // Call the user-defined method to get the BMI data from the user and display it
        String[][] bmiData = getBMIDataFromUser();
        
        // Display the BMI data in tabular format
        displayBMIData(bmiData);
    }
}
