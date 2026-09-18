// RainfallProgram.java
import java.util.Scanner;

public class RainfallProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RainfallStats stats = new RainfallStats(); // Create an instance of RainfallStats
        
        System.out.println("Enter rainfall measurements (type 'end' to finish):");
        
        while (true) {
            String input = scanner.next(); // Read user input
            if (input.equalsIgnoreCase("end")) {
                break; // Exit loop if user types 'end'
            }
            try {
                double measurement = Double.parseDouble(input); // Convert input to double
                stats.addMeasurement(measurement); // Add measurement to stats
            } catch (NumberFormatException e) {
                // Handle case where input is not a valid number
                System.out.println("Invalid input. Please enter a numeric value.");
            } catch (InvalidRainfallException e) {
                // Handle case where input is a negative number
                System.out.println(e.getMessage());
            }
        }
        
        scanner.close(); // Close the scanner
        
        // Display the results
        System.out.println("Number of measurements: " + stats.getCount());
        if (stats.getCount() > 0) {
            System.out.println("Mean rainfall: " + stats.getMean());
            System.out.println("Maximum rainfall: " + stats.getMax());
        }
    }
}