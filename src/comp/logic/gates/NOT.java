package comp.logic.gates;

public class NOT extends Gate {
	
	public Gate A;
	
	public NOT(){
	}
	

  @Override
  public boolean output() {
    return !A.output();
  }


  @Override
  public void connectA(Gate output) {
   this.A = output; 
  }


  @Override
  public void connectB(Gate output) {
  }
	
}
