package innerClass;
import OuterClass;

public class Maini {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.Inner InnerClass = outer.new Inner();
		
		System.out.println(outer.a + InnerClass.b);

	}

}
