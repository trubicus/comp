package comp.logic.gates;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAND{
	
	@Test
	public void andTest(){
		AND and = new AND(false, false);
		assertFalse(and.out());
		
		and = new AND(false, true);
		assertFalse(and.out());

		and = new AND(true, false);
		assertFalse(and.out());

		and = new AND(true, true);
		assertTrue(and.out());
	}

}
