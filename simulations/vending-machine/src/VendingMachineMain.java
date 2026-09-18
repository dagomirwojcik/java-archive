
public class VendingMachineMain {

	public static void main(String[] args) {

		VendingMachine machine = new VendingMachine();

		machine.insertCoin();
		machine.insertCoin();
		machine.insertCoin();
		boolean bar = machine.vendCandyBar();
		System.out.println("Got candy bar " + bar);
	}

}
