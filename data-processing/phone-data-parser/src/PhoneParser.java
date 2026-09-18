import java.io.*;

public class PhoneParser {
	// Parses a Single Line of Phone Data into a Phone object
    public static Phone parse(String data) {
        String[] parts = data.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid phone data format.");
        }
        return new Phone(parts[0], Double.parseDouble(parts[1]), Integer.parseInt(parts[2]));
    }

    // Reads Phone Data From a File and Returns a PhoneList
    public static PhoneList parseFile(String filename) throws IOException {
        PhoneList phoneList = new PhoneList();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                phoneList.addPhone(parse(line)); // Parse each line and add to the list
            }
        }
        return phoneList;
    }
}
