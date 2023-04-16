package Hierachical_Inheritance;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,id,count,runs;
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		size = scan.nextInt();
		
		Batsman obj[] = new Batsman[size];
		for(i=0;i<size;i++) {
			obj[i]=new Batsman();
		}
		
		for(i=0;i<size;i++) {
			System.out.println("Enter the player id ");
			id = scan.nextInt();
			System.out.println("Enter the Player name");
			name = scan.next();
			System.out.println("Entet the match count");
			count = scan.nextInt();
			System.out.println("Enter the runs ");
			runs = scan.nextInt();
			obj[i]=new Batsman(name, id, count, runs);
		}
		for(i=0;i<size;i++) {
			obj[i].display();
		}
		for(i=0;i<size;i++) {
			obj[i].topBatsman();
		}
		
		
		
		

	}

}
