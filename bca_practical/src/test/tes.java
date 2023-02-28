package test;

public class tes {
////	reverse string
//	public String reverse(String name) {
//		char[] c = name.toCharArray();
//		int j = c.length;
//		String rev = "";
//		for (int i = j - 1; i >= 0; i--) {
//			rev += c[i];
//		}
//		return rev;
//	}
//	// swap number
//
//	public static void result(int a, int b) {
//		a = a - b;
//		b = a + b;
//		a = b - a;
//		System.out.println(a);
//		System.out.println(b);
////		
////		
//	}
//
//	public String vowel(String str) {
//		int count = 0;
//		for (int i = 0; i < str.length() - 1; i++) {
//			char ch = str.charAt(i);
//			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//			System.out.println(ch);
//			}
//		}
//		return str;
//	}
//
//	// fibonnaci
	public int result(int n) {

		int a, b;
		int c = 0;
		a = 0;
		b = 1;
		for (int i = 0; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;

	}
//
//	// palindrone
//	public boolean result(String st) {
//		char[] c = st.toCharArray();
//		int j = st.length();
//		String tem = "";
//		for (int i = j - 1; i >= 0; i--) {
//			tem = tem + c[i];
//
//		}
//		if (st.equals(tem)) {
//			return true;
//		} else {
//			return false;
//
//		}
//	}
//
//	public void sor(int[] sor) {
//		int i, temp = 0;
//		int f = sor.length;
//		for (i = 0; i < f; i++) {
//			for (int j = i + 1; j < f; j++) {
//				if (sor[i] > sor[j]) {
//					temp = sor[i];
//					sor[i] = sor[j];
//					sor[j] = temp;
//				}
//			}
//			System.out.println(sor[i]);
//		}
//	}
//
//	public void concat() {
//		String tr = "Welcome to ";
//		String tr1 = "Java World";
//		String res = tr + tr1;
//		String[] splits = res.split("\\s");
//		System.out.println("conact=" + res);
//		for (String ans : splits) {
//			System.out.println("split of String=" + ans);
//		}
//	}
//
//	public void star() {
//		int n = 5;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//
//		}
//	}
//
//	public void star2() {
//		int n = 5;
//		for (int i = 0; i < n; i++) {
//			for (int j = n - i; j > 1; j--) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
//
//	public void star3() {
//		int n = 5;
//		for (int i = n; i > 0; i--) {
//			for (int k = i; k < n; k++) {
//				System.out.print(" ");
//			}
//			for (int j = 1 * i; j > 1; j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//
//	}
//
//	public void duplicate() {
//		int[] arr = { 23, 567, 343, 66, 23, 12, 12, 45, 34, 345, 567, 10, 9, 4, 0, 23, 12 };
//		int a = arr.length;
//		for (int i = 0; i < a; i++) {
//			for (int j = i + 1; j < a; j++) {
//				if (arr[i] == arr[j]) {
//					System.out.println(arr[i]);
//
//				}
//			}
//
//		}
//	}
	//jerome
	public void duplicatestring(String dup) {
		int n = dup.length() - 1;
		for (int i = 0; i < n; i++) {
			char cha = dup.charAt(i); //j  //e
			int firstind = dup.indexOf(cha); //0  //1
			int secondind = dup.lastIndexOf(cha); //0  //5
			if (firstind != secondind) {
				System.out.println("character repeated =" + cha);
				break;
			}
		}

	}

//    public void charsequence() {
//    	String str = "uhqiouwhjflkasndffherfhbfyy";
//    	
//    	if(str.contains(str)) {
//    		System.out.println();
//    	}
//    	
//    	
//    }
    
    	


//	public void convert() {
//		String str = "345";
//		char c = 'd';
//		int i = Integer.parseInt(str);
//		System.out.println(i);
//		String f = String.valueOf(c);
//		System.out.println(f);
//		String g = String.valueOf(i);
//		System.out.println(g);
//		String k = String.valueOf(c);
//		System.out.println(k);
//	}
//
//	public void dateandtime() {
//		LocalDate obj = LocalDate.now();
//		LocalTime obj1 = LocalTime.now();
//		System.out.println("date is" + obj);
//		System.out.println("Time is" + obj1);
//
//	}

}
