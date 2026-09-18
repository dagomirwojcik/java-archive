import java.io.*;

public class FindBestPhones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
            // Read the Phone Data From a File
            PhoneList phoneList = PhoneParser.parseFile("phone-data-short.txt");
            
            // Print the Model Names of the Best Phones
            for (Phone phone : phoneList.getBestPhones()) {
                System.out.println(phone.getModel());
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
	}

}
