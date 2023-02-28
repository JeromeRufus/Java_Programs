package Selftest;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For loop, While loop, Do While loop, for each 
		
		int i = 2;
//		--i;
//		System.out.println(i);
//		i--;
//		System.out.println(i);
//		
//		//i++, i--, ++i, --i
//		
//		//for(initialisation; condition; increment/dec){}
//		int j;
//		for(j = 0; j < 10; ++j) {
//			System.out.println(j++);
//		}
//		
//		//while(condition){i++}
//		int k = 0;
//		while(k<10) {
//			System.out.println(k);
//			k++;
//		}
//		
//		int ij = 0;
//		//do{
//		    //business logics , 
//		    //increment//dec,
//		//}while(condition);
//		do {
//			System.out.println(ij);
//			ij++;
//		}while(ij < 10);
		
		int[] arri = {1,2,3,4,5,6};
//		//for(declaration : pack){}
//		for(int val : arri) {
//			System.out.println(val);
//		}
		
		for(int kl = 0; kl <arri.length; kl++) {
			System.out.println(arri[kl]);
			for(int ko = 0; kl <arri.length; kl++) {
				System.out.println(arri[kl]);
				
			}
		}
		
		
		
		

	}

}
