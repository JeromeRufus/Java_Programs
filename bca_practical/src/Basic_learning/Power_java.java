package Basic_learning;

import java.util.Scanner;

public class Power_java {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1,num2,result=1;
		System.out.println("enter the number:");
		num1 = scan.nextInt();
		System.out.println("enter the power");
		num2 = scan.nextInt();
		if (num1==0&&num2>=0)
		result=1;
	
		else if(num1==0&&num2>=1)
		result=0;
		
		else {
			for(int i=1;i<=num2;i++)
				
		
		{
		result = result*num1;
		
	}
		System.out.println(num1+"^"+num2+"="+result);

}
}
}
