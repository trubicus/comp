package comp.logic.gates;

/**
 * Object representation of AND gate with inputs A and B.
 * 
 * @author Ivan Trubic
 *
 */
public class AND extends Gate {

  @Override
  public boolean output() {
    return A.output() && B.output();
  }

}
