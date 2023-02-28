package RmiArithmetic;
import java.rmi.Naming;
import java.util.Scanner;

public class ari_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a;int b;
		System.out.println("enter the first num");
		a= scan.nextInt();
		System.out.println("enter the second num");
		b = scan.nextInt();
		try {
			String s1 = "rmi://localhost/ABC";
			one obj = (one)Naming.lookup(s1);
			int A = obj.add(a, b);
			System.out.println(A);
			
			String s2 = "rmi://localhost/ABC";
			one obj2 = (one)Naming.lookup(s2);
			int S = obj2.sub(a, b);
			System.out.println(S);
			
			String s3 = "rmi://localhost/ABC";
			one obj3 = (one)Naming.lookup(s3);
			int M = obj3.mul(a, b);
			System.out.println(M);
			
			String s4 = "rmi://localhost/ABC";
			one obj4 = (one)Naming.lookup(s4);
			int D = obj4.div(a, b);
			System.out.println(D);
			}
		catch(Exception e) {
			System.out.println("exception"+e);
		}

	}

}
