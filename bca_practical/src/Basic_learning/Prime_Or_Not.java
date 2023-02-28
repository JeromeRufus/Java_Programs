package Basic_learning;

public class Prime_Or_Not {
	public void prime(int start,int end) {
		int answer = 0,n = 0,sum = 0;
		for(int i = start;i<=end;i++) {
				if(i%2 == 0) {

				}
				else {
					sum = sum + i;	
					System.out.println(sum);
				}
		}
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime_Or_Not obj = new Prime_Or_Not();
		obj.prime(12, 18);
	}

}
