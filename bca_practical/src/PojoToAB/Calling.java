package PojoToAB;

public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		POJO obj = new POJO();
		obj.setname("Honda Brand");
		System.out.println(obj.getname());
		obj.setBike_Specs(new Giving_Values());
		obj.getBike_Specs();
		
//		Bike_Specs ref = new Giving_Values();
//		ref.specs();

	}

}
