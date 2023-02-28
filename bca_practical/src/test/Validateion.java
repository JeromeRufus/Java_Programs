package test;

public class Validateion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=18;
		try {
			if(i>=18) {
				System.out.println("Is valid");
			}
			else {
				System.out.println("Is not valid ");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
