package Animal_inheritence;

public class Animal {
	private String Animalname;
	private char foodhabit;
	private String food;
	private int nooflegs;
	public Animal() {}
		
	
	public Animal(String name,char habit,String feed,int legs){
		this.Animalname=name;
		this.foodhabit=habit;
		this.food=feed;
		this.nooflegs=legs;
	}
	
	public String getAnimalname() {
		return Animalname;
	}
	
	public void setAnimalname(String name) {
		this.Animalname=name;
	}
	
	public char getfoodhabit() {
		return foodhabit;
	}
	
	public void setfoodhabit(char  habit) {
		this.foodhabit = habit;
	} 
	public String getfood() {
		return food;
	}

	public void setEats(String feed) {
		this.food = feed;
	}

	public int getnoofLegs() {
		return nooflegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.nooflegs = noOfLegs;
	}
	

}
