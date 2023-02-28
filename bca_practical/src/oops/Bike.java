package oops;

public class Bike {	
	
	
	//POJO
	private String BikeBrand;
	private Bike_specs ref;
	
	public String getBikeBrand() {
		return BikeBrand;
		
	}
	
	public String setBikeBrand(String name) {
		return this.BikeBrand=name;
		
	}
	
	public Bike_specs getBike_specs() {
		return this.ref;
		
	}
	
	public Bike_specs setBike_specs(Bike_specs obj) {
		return this.ref=obj;
		
	}
	//method overriding
	public void Bike_model() {
		
		System.out.println("r15");
		
	}
	
	//method overloading
	public String  Bike_advantages(String Fuelcapacity) {
		return Fuelcapacity ;
	}
	
	public int Bike_advantages(int Enginecc) {
		return Enginecc;
	}

		
		
	
	
	
	
	
	
	

}
