import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VendingMachineJUnitTest {

	@Test
	void testInsertCoin() {
		VendingMachine machine = new VendingMachine();
		machine.insertCoin();
		assertEquals(1, machine.getBalance());
	}

}
