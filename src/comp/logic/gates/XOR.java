package comp.logic.gates;

public class XOR {
	
	private boolean A;
	private boolean B;
	private boolean out;
	
	public XOR(boolean A, boolean B) {
		this.A = A;
		this.B = B;
		this.out = this.A ^ this.B;
	}
	
	public boolean out(){
		return out;
	}
}
