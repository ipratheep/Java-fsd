package methodCalling;

public class MethordCall {

	static int BoxVolume(int l, int b, int h) { // define method
		int vol = l*b*h;
		return vol;
		
	}
	
	static void printLine() {
		System.out.println("------------------------------------------------"); // method calling without args
	}
	
	public static void main(String[] args) {
		int volume = BoxVolume(50,40,20);// method agrs
		printLine();
		System.out.println("The volume is : "+volume);
		printLine();
	}

}
