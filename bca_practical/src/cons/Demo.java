package cons;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassBank bk = new ClassBank();
		System.out.println("chatram"+" "+4000);
		ClassHDFC hd = new ClassHDFC();
		ClassSBI sb = new ClassSBI();
		System.out.println(bk.ministatement);
		System.out.println(hd.interest);
		System.out.println(hd.bankname);
		System.out.println(sb.bankname);
		System.out.println(sb.interest);
		bk.display();
		
	

	}

}
