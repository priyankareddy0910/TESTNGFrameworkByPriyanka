package Test;

public class PS2 extends PS3 {
	
	int a; //instance
	
	public PS2(int a) { // local variable
		
		super(6);//parent class contructor will invoke , parent class contructor will execute // super should first line in the constructor 
		this.a=a;
		
	}

	public int increment() {
		a=a+1;
		
		return a;
	}
	
	public int decrement() {
		a=a-1;
		
		return a;
	}


}
