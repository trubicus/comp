package comp.logic.gates;

public class AND extends Gate {
  public Gate A;
  public Gate B;
	
	public AND(){
	}
	

  @Override
  public boolean output() {
    return A.output() && B.output();
  }


  @Override
  public void connectA(Gate output) {
   this.A = output; 
  }


  @Override
  public void connectB(Gate output) {
    this.B = output;
  }
}
