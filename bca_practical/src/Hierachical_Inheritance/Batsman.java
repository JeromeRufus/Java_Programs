package Hierachical_Inheritance;

public class Batsman extends Person{
	int total_runs,strinking_rate,min;
	public Batsman() {
		
	}
	
	 public Batsman(String nm,int id,int count,int runs) {
		 super.Name=nm;
		 super.player_id=id;
		 super.matchCount=count;
		 this.total_runs=runs;
		 strinking_rate = total_runs/matchCount;
		 
		 
	 }
	 
	 public void display() {
		 System.out.println("Id is "+player_id+"name is "+Name+"Match count is "+matchCount+"Totalruns is "+total_runs+"Striking_rate "+strinking_rate);
	 }
	 
	 public void topBatsman() {
		 min = 0;
		 if(strinking_rate>min) {
			 min =  strinking_rate;
			 System.out.println("Top Batsman are ");
			 System.out.println("Id is "+player_id+"name is "+Name+"Match count is "+matchCount+"Totalruns is "+total_runs+"Striking_rate "+strinking_rate);
		 }
		 

		 
	 }
	
}
