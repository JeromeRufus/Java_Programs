package autoboxing;

public class classA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		double d=1.2;
		float f=1234.23f;
		long l =123456789l;
		Integer obj = new Integer(i);
		Double objd = new Double(d);
		Float objf = new Float(f);
		Long objl = new Long(l);

		
		System.out.println(obj);
		System.out.println(objd);
		System.out.println(objf);
		System.out.println(objl);
		
		
		int a=obj;
		double b=objd;
		Float c=objf;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		

	}

}
