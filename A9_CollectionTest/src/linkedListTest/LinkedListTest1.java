package linkedListTest;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> a  = new LinkedList<String>();
a.add("vcentrya");
a.add("vcentryb");
a.add("vcentryc");
a.add("vcentryd");
a.add("vcentrye");
Iterator<String> it =a.iterator();
		/*
		 * System.out.println(it.hasNext()); 
		 * System.out.println(it.next());
		 * System.out.println(it.hasNext()); 
		 * System.out.println(it.next());
		 * System.out.println(it.hasNext()); 
		 * System.out.println(it.next());
		 * System.out.println(it.hasNext()); 
		 * System.out.println(it.next());
		 * System.out.println(it.hasNext()); 
		 * System.out.println(it.next());
		 */
//System.out.println(it.hasNext());//no suchElementException
//System.out.println(it.next());



while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}
