package Animal_inheritence;

public class cats extends Animal {
	private  String color;
	
	
	
	
	public cats() {
		
	}
	
	public cats(String name,char habit,String feed,int legs) {
	}


	public cats(String name,char habit,String feed,int legs, String color){
		super();
	}
	
	
	public boolean checknamelength(String name) {
		if(name.length()>=1&&name.length()<=10) {
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean checkfoodhabit(char hab) {
		if(hab=='v'||hab=='n')
			
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public boolean checklegs(int leg) {
		if(leg==4) {
			return true;
		}
		else
		{
			return false;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

	

	
	

}
