package INHERITANCE2;

class parent{
	int i=10;
}
class child extends parent{
	int j;
	public int result() {
		return j+i;
	}
}

public class mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child ch= new child();
		System.out.println(ch.i);
		ch.j=10;
		System.out.println(ch.result());
	}

}
