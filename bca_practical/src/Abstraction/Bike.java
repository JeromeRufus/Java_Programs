package Abstraction;

public abstract class Bike {
	
	private String Bike ;
	private Honda obj;
	
	
	public String getBike() {
		return Bike;
	}
	public String setBike(String name) {
		return this.Bike=name;
	}
	
	public Honda getHonda() {
		return obj;
		
	}
	
	public Honda setHonda(Honda ref) {
		return this.obj=ref;
	}
	
//	public  abstract void BikeModel();

}
