package comp.logic.gates;

/**
 * Object representation of NOT gate.
 * @author Ivan Trubic
 *
 */
public class NOT extends Gate {

  @Override
  public boolean output() {
    return !A.output();
  }

}
