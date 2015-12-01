package comp.logic.gates;

public class AND {
	private boolean A;
	private boolean B;
	private boolean out;
	
	public AND(boolean A, boolean B){
		this.A = A;
		this.B = B;
		this.out = this.A && this.B;
	}
	
	public boolean out(){
		return out;
	}
}
