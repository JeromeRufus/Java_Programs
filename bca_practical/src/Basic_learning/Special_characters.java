package Basic_learning;

public class Special_characters {
	int lowercount = 0, uppercount = 0,splcount = 0,numcount = 0;
	
	public void calulateCount(String st) {
		int n = st.length();
		
		for(int i = 0;i < n ;i++) {
			char ch = st.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				lowercount++;	
			}
			else if(ch >= 'A' && ch <='Z'){
				uppercount++;	
			}
			else if(ch >='0' && ch <= '9'){
				numcount++;
			}
			else {
				splcount++;
			}
		}
		System.out.println(lowercount);
		System.out.println(uppercount);
		System.out.println(numcount);
		System.out.println(splcount);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Special_characters obj = new Special_characters();
		String str = "abcde!fghijl@lmnop#qrst$uvw%xyz^";
		obj.calulateCount(str);
	
	

	}

}
