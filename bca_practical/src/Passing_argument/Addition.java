package Passing_argument;

public class Addition {
	Division dl = new Division();
	Multiple ml = new Multiple();
	Subtraction su = new Subtraction();
	public int  Add(int a,int b) {
		return dl.Div(a, b)+ml.Mul(a)+su.Sub(a,b);
	}
		
	
}
