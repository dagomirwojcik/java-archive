import java.util.*;

public class Phone {

	private String model;
    private double screenSize;
    private int batteryCapacity;

    // Constructor to initialize phone details with validation
    public Phone(String model, double screenSize, int batteryCapacity) {
        if (screenSize <= 0 || batteryCapacity <= 0) {
            throw new IllegalArgumentException("Screen size and battery capacity must be positive values.");
        }
        this.model = model.replace("_", " "); // Replace underscores with spaces in model name
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
    }

    // Method to check if this phone dominates another phone
    public boolean dominates(Phone other) {
        return (this.screenSize > other.screenSize && this.batteryCapacity >= other.batteryCapacity) ||
               (this.screenSize >= other.screenSize && this.batteryCapacity > other.batteryCapacity);
    }

    // Getter method to retrieve the phone model
    public String getModel() {
        return model;
    }
}

// Class representing a collection of phones
class PhoneList {
    private List<Phone> phones = new ArrayList<>();

    // Method to add a phone to the list
    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    // Returns an unmodifiable list of all phones
    public List<Phone> getAllPhones() {
        return Collections.unmodifiableList(phones);
    }

    // Returns a list of 'best' phones that are not dominated by any other phone
    public List<Phone> getBestPhones() {
        List<Phone> bestPhones = new ArrayList<>();
        for (Phone p1 : phones) {
            boolean isBest = true;
            for (Phone p2 : phones) {
                if (p2.dominates(p1)) {
                    isBest = false;
                    break;
                }
            }
            if (isBest) {
                bestPhones.add(p1);
            }
        }
        return Collections.unmodifiableList(bestPhones);
    }
}
