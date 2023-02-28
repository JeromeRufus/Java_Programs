package Bank_inheritence;

public class asc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Bank obj = new Indian();
//		obj.Ind();
//		Bank obj1 = new KVB();
//		obj1.KVB();
		Bank obj = new Bank();
		System.out.println(obj.BankDetails("SBI"));
		System.out.println(obj.BankDetails(12345));
		
		
		
	}

}
