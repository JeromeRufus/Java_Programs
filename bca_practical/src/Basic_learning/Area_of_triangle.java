package Basic_learning;
import java.util.Scanner;
public class Area_of_triangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		double area, H,B;
		System.out.println("Enter the height of triangle:");
		H = scan.nextDouble();
		System.out.println("Enter the base of triangle:");
		B = scan.nextDouble();
		
		Double Area=0.0,Height=0.0,Base=0.0;
		area = ((H*B)/2);
		System.out.println("area of the triangle"+area);
		
		
}

	
	

}
