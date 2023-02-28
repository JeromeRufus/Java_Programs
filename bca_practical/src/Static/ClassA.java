package Static;

public class ClassA {
	//static variable
	static double area;
	static  double radius;
	
	//static block
	static {
		radius=10;
		System.out.println("1st static block");
	     area=3.14*(radius*radius);
		}
	
	//static method
	static void Area() {
		System.out.println(area);
		
	}

}
