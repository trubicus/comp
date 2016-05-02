package comp.logic.gates;

/**
 * Object representation of XOR gate.
 * @author Ivan Trubic
 *
 */
public class XOR extends Gate {
	
  @Override
  public boolean output() {
    return A.output() ^ B.output();
  }
	
}
