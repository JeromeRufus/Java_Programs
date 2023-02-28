package RmiArithmetic;
import java.rmi.Naming;

public class ari_server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			two a = new two();
			Naming.bind("rmi://localhost/ABC", a);
			System.out.println("server is ready");
			two s = new two();
			Naming.bind("rmi://localhost/ABC", s);
			System.out.println("server is ready");
			two m = new two();
			Naming.bind("rmi://localhost/ABC", m);
			System.out.println("server is ready");
			two d = new two();
			Naming.bind("rmi://localhost/ABC", d);
			System.out.println("server is ready");
		}
		catch(Exception e) {
			System.out.println("Exception"+e);
		}
	}

}
