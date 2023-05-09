package basics;

public class AccessMod {
	public static String car = "BMW";
	private static String bike = "Ducati";
	protected static String van = "Benz";
	String key = "key";
	public static void main(String[] args) {
		System.out.println(car);
		System.out.println(bike);// it can print in same class.
		System.out.println(van);
	
	}

}
