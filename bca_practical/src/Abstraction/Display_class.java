package Abstraction;

public class Display_class {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Display_class(new Honda());
//		Display_class(new KTM());
		Honda ref = new Honda();
		Bike  obj = ref.Display_bike();
		System.out.println(obj.getBike());
		
		
		
		
		
		
		
	}
	
//	static public void Display_class(Bike_model b) {
//		b.BikeModel();
//		b.modelSpecs();
//		b.
//		
//	
//	}
	

}
