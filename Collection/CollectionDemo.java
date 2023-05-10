package collectionDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList<Integer> lists = new ArrayList<Integer>();
//		lists.add(1);
//		lists.add(2);
//		lists.add(3);
//		lists.add(4);
//		lists.add(5);
		
		for(int i=1; i<=10; i++)
			lists.add(i);
		
		//System.out.println(lists);
		
		LinkedList<Integer> alists = new LinkedList<Integer>();
		for(int i=1;i<=10;i++)
			alists.add(i);
		//alists.remove(9);
		System.out.println(alists);

	}

}
