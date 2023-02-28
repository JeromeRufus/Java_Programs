package arithmetic;

public class addition extends Subtraction {
	static int addcount;
	
	
	public  int add() {
//		Divison ref=new Divison(); 
//		Multiple obj = new Multiple();
//		Subtraction job = new Subtraction();
		int y= super.div()+super.mul()+super.sub();
		addcount++;
		 return y;
		
	}
	public static void main(String[] args) {
		addition add = new addition();
		int AddResult=add.add();
		System.out.println("add Result "+AddResult);
		
		int DivCount = add.divcount;
		System.out.println("Div Count "+ DivCount);
		
		int MulCount = add.mulcount;
		System.out.println("Mul count "+MulCount);
		
		int SubCount = add.subcount;
		System.out.println("Sub Count "+SubCount);
		
		int AddCount = add.addcount;
		System.out.println("Add Count "+AddCount);
		
		
		

		
	}

}
