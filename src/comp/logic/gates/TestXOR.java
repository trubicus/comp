package comp.logic.gates;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestXOR {

	@Test
	public void test() {
		XOR xor = new XOR(false, false);
		assertFalse(xor.out());
		
		xor = new XOR(false, true);
		assertTrue(xor.out());
		
		xor = new XOR(true, false);
		assertTrue(xor.out());

		xor = new XOR(true, true);
		assertFalse(xor.out());
	}

}
