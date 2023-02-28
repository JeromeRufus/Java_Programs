package test;

public class Find_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<=1000;i+=30) {
			if(i%2==0) {
				if(i%3==0) {
					if(i%4==0) {
						if(i%5==0) {
							if(i%6==0) {
								if(i%7==1) {
									System.out.println(i);
								}
							}
						}
					}
				}
			}
//			if (i%4==0&& i%5==0 && i%10==0 && i%7==1) {
//				System.out.println(i);
//			}
		}
		

	}

}
