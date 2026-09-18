
public class RainfallStats {
    // Variables to store the count of measurements, total sum, and maximum value
    private int count = 0;
    private double total = 0;
    private double max = Double.MIN_VALUE;
    
    // Method to add a measurement to the statistics
    public void addMeasurement(double measurement) throws InvalidRainfallException {
        if (measurement < 0) {
            // If the measurement is negative, throw a custom exception
            throw new InvalidRainfallException("Negative rainfall measurements are not allowed.");
        }
        // Increment count of measurements
        count++;
        // Add measurement to total sum
        total += measurement;
        // Update max value if the new measurement is greater
        if (measurement > max) {
            max = measurement;
        }
    }
    
    // Method to get the number of measurements entered
    public int getCount() {
        return count;
    }
    
    // Method to calculate the mean rainfall
    public double getMean() {
        if (count == 0) {
            // Throw an exception if no measurements have been recorded
            throw new IllegalStateException("No measurements recorded.");
        }
        return total / count; // Calculate and return mean
    }
    
    // Method to get the maximum rainfall recorded
    public double getMax() {
        if (count == 0) {
            // Throw an exception if no measurements have been recorded
            throw new IllegalStateException("No measurements recorded.");
        }
        return max; // Return max value
    }
}