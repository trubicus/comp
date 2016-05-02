package comp.logic.gates;

public abstract class Gate {
  
  public abstract boolean output();

  public abstract void connectA(Gate output);
  public abstract void connectB(Gate output);

}
