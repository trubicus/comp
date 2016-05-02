package comp.logic.gates;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestXOR {

	@Test
	public void test() {
		XOR xor = new XOR();
		xor.connectA(new Value(false));
		xor.connectB(new Value(false));
		assertFalse(xor.output());
		
		xor = new XOR();
		xor.connectA(new Value(false));
		xor.connectB(new Value(true));
		assertTrue(xor.output());
		
		xor = new XOR();
		xor.connectA(new Value(true));
		xor.connectB(new Value(false));
		assertTrue(xor.output());

		xor = new XOR();
		xor.connectA(new Value(true));
		xor.connectB(new Value(true));
		assertFalse(xor.output());
	}

}
