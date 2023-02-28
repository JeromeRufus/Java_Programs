package Looping;

public class String_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("");
		sb.append("rufus");
		System.out.println(sb);
		sb.insert(0, "jose");
		System.out.println(sb);
		sb.replace(0, 1, "jjflkd");
		System.out.println(sb);
		sb.delete(0, 5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.capacity();
		System.out.println(sb);
		sb.ensureCapacity(10);
		System.out.println(sb);

	}

}
