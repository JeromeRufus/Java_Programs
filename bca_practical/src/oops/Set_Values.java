package oops;

public  class Set_Values  extends Bike_specs{
	
			
	
	@Override
	public void Bike_Specs() {
		// TODO Auto-generated method stub
		System.out.println("Petrol "+"Without Gear "+"Digital Speedometer");
		
		
		Bike obj = new Bike();
		obj.setBikeBrand("Honda Brand");
		
		//method overloading
		System.out.println("enginee CC"+obj.Bike_advantages(150));
        System.out.println(obj.Bike_advantages("Fuel Capacity"+"5.15 literes"));
		 
	}
	
	
	
	

}
