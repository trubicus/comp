package comp.logic.gates;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNOT {

	@Test
	public void testNOT() {
		NOT not = new NOT(true);
		assertFalse(not.out());
		
		not = new NOT(false);
		assertTrue(not.out());
	}

}
