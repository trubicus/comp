package comp.logic.gates;

public class NOT {
	
	private boolean in;
	private boolean out;
	
	public NOT(boolean in){
		this.in = in;
		this.out = !(this.in);
	}
	
	public boolean out(){
		return out;
	}
	
}
