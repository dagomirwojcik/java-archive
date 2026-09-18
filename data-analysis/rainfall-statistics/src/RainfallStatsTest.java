// RainfallStatsTest.java
import org.junit.Test;
import static org.junit.Assert.*;

public class RainfallStatsTest {
    // Test that adding a negative measurement throws an InvalidRainfallException
    @Test (expected = InvalidRainfallException.class)
    public void testNegativeMeasurementThrowsException() throws InvalidRainfallException {
        RainfallStats stats = new RainfallStats();
        stats.addMeasurement(-5); // Try adding a negative value
    }
    
    // Test that calling getMean without any measurements throws an IllegalStateException
    @Test (expected = IllegalStateException.class)
    public void testGetMeanWithoutMeasurementsThrowsException() {
        RainfallStats stats = new RainfallStats();
        stats.getMean(); // Try getting mean without data
    }
    
    // Test that calling getMax without any measurements throws an IllegalStateException
    @Test (expected = IllegalStateException.class)
    public void testGetMaxWithoutMeasurementsThrowsException() {
        RainfallStats stats = new RainfallStats();
        stats.getMax(); // Try getting max without data
    }
}
