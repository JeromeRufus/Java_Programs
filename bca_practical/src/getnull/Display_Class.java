package getnull;

public class Display_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA ref = new ClassA();
		ref.getClassB();
	
		
		if(ref.getClassB()!=null) {
			ref.getClassB();
			
		}
		
			
		else {
			ref.setObject(new ClassB());
			ClassB obj = ref.getClassB();
			obj.setname("Jerome");
			System.out.println(obj.getname());
		}
		
		
		
		
		

	}

}
