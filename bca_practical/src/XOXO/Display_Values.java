package XOXO;

import java.util.Scanner;

public class Display_Values {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char input = 0;
		String Player1,Player2;
		char User1,User2;
		Rows_Column obj = new Rows_Column();
		int Counter = 0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				obj.arr[i][j] = Character.forDigit(Counter++, 9);
				
			}
		}
		//obj.Display(obj.arr);
		obj.Display(obj.arr);
		
		System.out.println("Enter The Player1");
		Player1 = scan.next();
		
		System.out.println("Enter The Player2");
		Player2 = scan.next();
		
		System.out.println(Player1 +"Choose X or O");
		User1 = scan.next().charAt(0);
		
		while(User1 != 'X' && User1 != 'x' && User1 !='O' && User1 !='o') {
			System.out.println("Invalid You Must Give X or O");
			User1 = scan.next().charAt(0);
			
		}
		
		System.out.println(Player2 +"Choose X or O");
		User2 = scan.next().charAt(0);
		while(User2 != 'X' && User2 != 'x' && User2 !='O' && User2 !='o') {
			System.out.println("Invalid You Must Give X or O");
			User2 = scan.next().charAt(0);
			
		}
//		int Size = obj.arr.length;
		
		for(int i=0;i<4;i++) {
			System.out.println(Player1 +"Your turn");
			input = scan.next().charAt(0);
			obj.Replace(obj.arr, input, User1);
			obj.Display(obj.arr);
			
			System.out.println(Player2  +"Your Turn");
			input = scan.next().charAt(0);
			obj.Replace(obj.arr, input, User2);
			obj.Display(obj.arr);
		}
			System.out.println(Player1 +"Your turn");
			input = scan.next().charAt(0);
			obj.Replace(obj.arr, input, User1);
			obj.Display(obj.arr);
		
			
			if(obj.checkforWin()) {
				System.out.println("Winner");
			}
			else {
				System.out.println("Draw");
			}
		
			
			
			
			
		
		
		
		
		
		
		
		
	}
}
