package Looping;

public class String_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String str1="world       ";
		char result=str.charAt(4);
		System.out.println(result);
		int Result=str.codePointAt(0);
		System.out.println(Result);
		int res=str.codePointBefore(3);
		System.out.println(res);
		int r=str.codePointCount(0, 5);
		System.out.println(r);
		System.out.println(str.compareTo(str1));
		System.out.println(str.compareToIgnoreCase(str1));
		System.out.println(str.concat(str1));
		System.out.println(str.contains("hi"));
		System.out.println(str.contentEquals("hello"));
		char[] arr = {'j','e','r','o','m'};
		String mystr="";
		mystr=str.copyValueOf(arr,0,5);
		System.out.println(mystr);
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.format(null, mystr, args));
		System.out.println(str.hashCode());
		System.out.println(str.indexOf(0));
		System.out.println(str.intern());
		System.out.println(str.isEmpty());
		System.out.println(str.lastIndexOf(result));
		System.out.println(str1.length());
		System.out.println(str.matches(str1));
		System.out.println(str.replace(str, str1));
		System.out.println(str.replaceFirst(str1, mystr));
		System.out.println(str.split(mystr));
		System.out.println(str.subSequence(0, 3));
		System.out.println(mystr.toCharArray());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str1.toString());
		System.out.println(str1.trim());
		System.out.println(str1.valueOf(result));
		
	

	}

}
