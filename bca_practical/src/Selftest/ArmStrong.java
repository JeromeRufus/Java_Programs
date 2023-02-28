package Selftest;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int num = n;
		int temp = 0;
		
		int Result = 0,AddResult = 0;
		
		while(num != 0) {
			Result = num%10;
			temp = temp +  Result * Result * Result;
			num /= 10;
			
			
		}
		
		if(temp == n) {
			System.out.println("Is ArmStrong Number");
			
		}
		else {
			System.out.println("Is Not ArmStrong Number");
		}
		
		

	}

}
