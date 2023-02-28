package Animal_inheritence;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		cats cat = new cats();
		System.out.println("enter the Animal name");
		//animalName=scan.next();
		cat.setAnimalname(scan.next());
		boolean namelength=cat.checknamelength(cat.getAnimalname());
		if(namelength==true) {
		}
		
		else{
				System.out.println("character b/w 1 to 10");
				System.exit(0);
		
			}
		
			
		
		System.out.println("enter the foodhabit");
		//cat.checkfoodhabit(scan.next().charAt(0));
		cat.setfoodhabit(scan.next().charAt(0));
		boolean checkfoodhab=cat.checkfoodhabit(cat.getfoodhabit());
		if(checkfoodhab==true) {
			
		}
		else {
			System.out.println("should veg or non veg");
		    System.exit(0);
		}
		
		
		
			
			
		
		System.out.println("enter the food");
		cat.setEats(scan.next());
		System.out.println("enter the legs");
		cat.setNoOfLegs(scan.nextInt());
		
		boolean checkleg=cat.checklegs(cat.getnoofLegs());
		if(checkleg==true) {
		}
		else {
			System.out.println("should be 4 legs only for animal");
			System.exit(0);
		}
		System.out.println("enter the color");
		cat.setColor(scan.next());
		
		
		
		}
		

	}


