package comp.logic.gates;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOR {
	
	@Test
	public void testOR(){
		
		OR or = new OR(false, false);
		assertFalse(or.out());
		
		or = new OR(false, true);
		assertTrue(or.out());

		or = new OR(true, false);
		assertTrue(or.out());

		or = new OR(true, true);
		assertTrue(or.out());
	}
}
