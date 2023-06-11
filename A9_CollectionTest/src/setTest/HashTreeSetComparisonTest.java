package setTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//import java.util.TreeSet;

public class HashTreeSetComparisonTest {
	public static void main(String[] args) {
		
	
	Set  h=new HashSet();	
		//Set h =new TreeSet();//different datatype->ClassCastException
	
	h.add(null);//treeset-nullPointException
	h.add("Vcentryb");
	h.add("Vcentryc");
	h.add("Vcentryf");
	h.add("Vcentrye");

	h.add("Vcentryb");
	h.add("Vcentryc");
	h.add("Vcentryf");
	h.add("Vcentrye");
	Iterator it =h.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}
}
