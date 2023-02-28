package Constructor2;

public class Rectangle {
	int Length;
	int breath;
	int width;
	
	Rectangle(){
		this.Length=10;
	}
	Rectangle(int b) {
		this.breath = b;
		
		
	}
	Rectangle(int w){
		this.width = w;
	}
	public void display() {
		System.out.println(Length*breath);
		System.out.println(2*(Length+width));
	}
	 
	

}
