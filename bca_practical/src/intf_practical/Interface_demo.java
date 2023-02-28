package intf_practical;

import java.util.Scanner;

public class Interface_demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle crad = new Circle();
		Rectangle rect = new Rectangle();
		System.out.print(" Enter radius of the circle:");
		  crad.radius = scan.nextDouble();
		  System.out.print("Area of the circle:"+crad.area());
		  System.out.print("\n enter the length n breath:");
		  rect.length= scan.nextDouble();
		  rect.breath= scan.nextDouble();
		System.out.print("area of the Rectangle"+rect.area());
		

	}

}
