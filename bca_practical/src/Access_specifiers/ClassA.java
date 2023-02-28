package Access_specifiers;

public class ClassA {
	public int add() {
		return 1+2;
		
	}
	private int sub() {
		return 2-1;
		
	}
	protected int mul() {
		return 3*1;
	}
	int div() {
		return 4/2;
	}
	public static void main(String[] args) {
		ClassA lg = new ClassA();
		System.out.println(lg.add());
		System.out.println(lg.mul());
		System.out.println(lg.div());
		System.out.println(lg.sub());
	}

}
