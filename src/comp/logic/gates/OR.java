package comp.logic.gates;

public class OR {
	private boolean A;
	private boolean B;
	private boolean out;
	
	public OR(boolean A, boolean B) {
		this.A = A;
		this.B = B;
		this.out = this.A || this.B;
	}
	
	public boolean out(){
		return out;
	}

}
