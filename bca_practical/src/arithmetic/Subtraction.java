package arithmetic;

public class Subtraction extends Multiple {
	static int subcount;

	
	public  int sub(){
//		Divison ref=new Divison();
//		Multiple obj = new Multiple();
		
		 int subResult=super.mul()-super.div();
		 subcount++;
		  return subResult;
		
	}


}
