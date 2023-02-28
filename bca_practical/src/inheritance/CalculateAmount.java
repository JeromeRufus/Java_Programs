package inheritance;
import java.util.Scanner;
public class CalculateAmount extends Electricity_bill {

	public static void main(String[] args) {
		Double units;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the unit consumed: ");
		units = scan.nextDouble();
		
		CalculateAmount ca = new CalculateAmount();
		ca.billpay(units);
		
		System.out.println("Total Amount: " + ca.bill);
				
	}

}
