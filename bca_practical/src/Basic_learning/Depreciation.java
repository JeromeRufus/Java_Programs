package Basic_learning;

import java.util.Scanner;

public class Depreciation {

	public static void main(String[] args) {
		
		int assetcost=0,residualvalue=0,lifeofyears=0;
		
				int Assetcost=0,Residual=0,life=0;
		int unitproduce=0;
		Double Straightlinedep=0.0;
		int BS =0,costofasset=0,Accumdep=0;
		int option=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("depreciation method");
		while(true) {
			
			System.out.println("choose the operation");
			System.out.println("1.straightline");
			System.out.println("2.unit of production");
			System.out.println("3.Double -deliceing balance method");
			 option = scan.nextInt();
			 
			 switch(option) {
			 case 1:
				 System.out.println("enter the asset cost");
				 assetcost=scan.nextInt();
				 System.out.println("enter the residual value");
				 residualvalue = scan.nextInt();
				 System.out.println("enter the life of years");
				 lifeofyears=scan.nextInt();
				 int exp = assetcost;
				 exp = (assetcost-residualvalue) /100;
				 System.out.println("expense="+exp);
				break;
			 case 2:
				 System.out.println("enter the Assetcost:");
				 Assetcost=scan.nextInt();
				 System.out.println("enter the Residual value:");
				 Residual=scan.nextInt();
				 System.out.println("enter the life:");
				 life=scan.nextInt();
				 
				  double perunit =  (life/(Assetcost-Residual));
				 System.out.println("perunit dep="+perunit); 
				 break;
			 case 3:
				 System.out.println("enter the straightline");
				 Straightlinedep=scan.nextDouble();
				 System.out.println("enter the book series"+BS);
				 int a[] =new int [BS];
				 
				 BS=scan.nextInt();
				 for(int i=0;i<=BS;i++);
				 
				 int dep = (int) (2*Straightlinedep*BS);
				 
				 System.out.println("depreciation"+dep);
				
				 
				 
				 
				
				 
				 
				 
			 }
			 
		}
		
	}

}
