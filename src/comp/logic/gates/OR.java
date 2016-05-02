package comp.logic.gates;

/**
 * Object representation of OR gate.
 * @author Ivan Trubic
 *
 */
public class OR extends Gate {

  @Override
  public boolean output() {
    return A.output() || B.output();
  }

}
