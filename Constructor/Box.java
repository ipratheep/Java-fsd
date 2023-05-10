package basics;
import ClassDemo;

public class Box {
	public static void main (String [] args) {
		ClassDemo blackBox = new ClassDemo(100,244,56);
		
		System.out.println(blackBox.volume());
	}
}