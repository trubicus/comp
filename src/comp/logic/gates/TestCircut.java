package comp.logic.gates;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCircut {

  @Test
  public void simpleCircuit(){
    Value xValue = new Value(true);
    Value yValue = new Value(true);
    
    Gate tree = new OR();
    Gate andGate1 = new AND();
    Gate andGate2 = new AND();
    Gate notGate1 = new NOT();
    Gate notGate2 = new NOT();
    tree.connectA(andGate1);
    tree.connectB(andGate2);
    andGate1.connectB(notGate1);
    andGate2.connectA(notGate2);
    
    andGate1.connectA(yValue);
    notGate1.connectA(xValue);
    andGate2.connectB(xValue);
    notGate2.connectA(yValue);
    
    assertFalse(tree.output());
    
    xValue.setValue(false);
    assertTrue(tree.output());
    
    xValue.setValue(true);
    yValue.setValue(false);
    assertTrue(tree.output());
    
    xValue.setValue(false);
    assertFalse(tree.output());
  }
}
