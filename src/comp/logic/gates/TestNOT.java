package comp.logic.gates;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNOT {

	@Test
	public void testNOT() {
		NOT not = new NOT();
		not.connectA(new Value(true));
		assertFalse(not.output());
		
		not = new NOT();
		not.connectA(new Value(false));
		assertTrue(not.output());
	}

}
