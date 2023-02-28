package arithmetic;

import java.util.Scanner;

public class math {
	int a,b,d,divcount = 0,mulcount,subcount,addcount;
	
	public int Div() {
		Scanner scan = new Scanner(System.in);
		int c;
		System.out.println("enter the a value for div");
		a=scan.nextInt();
		System.out.println("enter the b value for div");
		b=scan.nextInt();
		c = a / b;
		divcount++;
		 return c;

	}
	public int Multiple() {
		Scanner scan = new Scanner(System.in);
		int i;
		System.out.println("enter the d value for mul");
		d=scan.nextInt();
		//add div = new add();
		i =this.Div()*d;
		mulcount++;
		 return i;
	}
	public int Subtraction() {
		//add div = new add();
		//add mul = new add();
		int j = this.Div()-this.Multiple();
		subcount++;
		 return j;
		
	}
	public int addition() {
		//add div = new add();
//		add mul = new add();
//		add sub = new add();
		int k = this.Div()+this.Multiple()+this.Subtraction();
		addcount++;
		 return k;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		math obj = new math();
		int l = obj.addition();
		
		//add div = new add();
		int k =obj.divcount;
		System.out.println("div count is "+k);
	
		//add mul = new add();
		int m = obj.mulcount;
		System.out.println("mul count"+m);
		
		//add sub = new add();
		int n = obj.subcount;
		System.out.println("sub count"+n);
		
		int o = obj.addcount;
		System.out.println("add count"+o);
		
		
		System.out.println("add result"+l);
		
		
		
		
		
		
		

	}

}
