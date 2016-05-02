package comp.logic.gates;

/**
 * Abstract logic gate object representation.
 * @author Ivan Trubic
 *
 */
public abstract class Gate {
  protected Gate A;
  protected Gate B;
  
  /**
   * Evaluate logic gate output
   * @return Logic output of the gate
   */
  public abstract boolean output();

  /**
   * Connect output to input A of the logic gate
   * @param output Output of some other logic gate
   */
  public void connectA(Gate output){
    this.A = output;
  }
  
  /**
   * Connect output to input B of the logic gate
   * @param output Output of some other logic gate
   */
  public void connectB(Gate output){
    this.B = output;
  }

}
