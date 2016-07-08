package comp.logic.gates;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOR {
	
	@Test
	public void testOR(){
		
		OR or = new OR();
		or.connectA(new Value(false));
		or.connectB(new Value(false));
		assertFalse(or.output());

		or = new OR();
		or.connectA(new Value(false));
		or.connectB(new Value(true));
		assertTrue(or.output());
		
		or = new OR();
		or.connectA(new Value(true));
		or.connectB(new Value(false));
		assertTrue(or.output());

		or = new OR();
		or.connectA(new Value(true));
		or.connectB(new Value(true));
		assertTrue(or.output());



	}
}
