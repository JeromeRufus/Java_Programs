package oops;

public class Display_values  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
		Bike obj = new Bike();
		obj.setBikeBrand("Honda");
		System.out.println(obj.getBikeBrand());
		obj.getBike_specs();
		
//		//method overloading
		System.out.println("Engine CC"+obj.Bike_advantages(150));
		System.out.println("Fuel capactiy"+obj.Bike_advantages("3.15 capacity"));
	
		


		
		Bike_Price ref = new Bike_model();
		ref.Bike_price();
		
		//method overriding
		
		obj.Bike_model();

	}

}
