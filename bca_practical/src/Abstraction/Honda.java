package Abstraction;

public class Honda extends Bike{
	
	public Bike Display_bike() {
		Bike obj = new Honda() ;
	
		obj.setBike("Honda");
		obj.setHonda(new Honda());
		
		return obj;
		
	}
	
	
	
	


	

//	@Override
//	public void modelSpecs() {
//		// TODO Auto-generated method stub
//		System.out.println("150cc  "+"petrol  "+"Blue "+"scooty  "+"Without Gear  ");
//		System.out.println("160cc  "+"petrol  "+"brown "+"With Gear");
//		
//	}
//
//	@Override
//	public void BikeModel() {
//		// TODO Auto-generated method stub
//		System.out.println("Activa");
//		System.out.println("Shine");
		
		
//	}

}
