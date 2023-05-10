package basics;

public class Strings {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Hello ");
		str1.append("World !!");
		System.out.println("--------String Buffer--------");
		System.out.println(str1);
		
		StringBuilder st2 = new StringBuilder("Hello ");
		System.out.println("--------String Builder-------");
		st2.append("World!!");
		System.out.println(st2);		
	}

}
