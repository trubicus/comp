package comp.logic.gates;

public class Value extends Gate {
  
  private boolean value;

  public Value(boolean value){
    this.value = value;
  }

  @Override
  public boolean output() {
    return this.value;
  }

  @Override
  public void connectA(Gate output) {
  }

  @Override
  public void connectB(Gate output) {
  }
  
  public void setValue(boolean value){
    this.value = value;
  }

}
