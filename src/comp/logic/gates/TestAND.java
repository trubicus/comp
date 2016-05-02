package comp.logic.gates;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAND{
	
	@Test
	public void andTest(){
		AND and = new AND();
		and.connectA(new Value(false));
		and.connectB(new Value(false));
		assertFalse(and.output());
		
		and = new AND();
		and.connectA(new Value(false));
		and.connectB(new Value(true));
		assertFalse(and.output());

		and = new AND();
		and.connectA(new Value(true));
		and.connectB(new Value(false));
		assertFalse(and.output());

		and = new AND();
		and.connectA(new Value(true));
		and.connectB(new Value(true));
		assertTrue(and.output());
	}

}
