package Constructor2;

import java.util.Scanner;

public class Rectangle_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Breath = 0,Width = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Breath of Rectangle");
		Breath = scan.nextInt();
		Rectangle rect = new Rectangle(Breath);
		System.out.println("Enter the Width of Rectangle");
		Width = scan.nextInt();
		Rectangle rect1 = new Rectangle(Width,0);
		rect.display();
			
	
		
	
		

	}

}
