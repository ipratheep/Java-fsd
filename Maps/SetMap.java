package collectionDemo;
import java.util.HashMap;
import java.util.Map;
public class SetMap {
	public static void main(String[] args) {
		Map<String, Integer> weatherMap = new  HashMap<String, Integer> ();
		
		weatherMap.put("Chennai", 35);
		weatherMap.put("Gurugram",60);
		weatherMap.put("Mumbai", 22);
		weatherMap.put("Pune", 46);
		
		System.out.println(" Gurugram temperature today is : "
		+ weatherMap.get("Chennai"));

	}
}