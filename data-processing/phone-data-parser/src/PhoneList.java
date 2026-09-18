import java.util.*;

public class PhoneList {

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
