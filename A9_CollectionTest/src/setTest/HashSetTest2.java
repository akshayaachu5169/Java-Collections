package setTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet  <Integer> h =new HashSet<Integer>();
h.add(30);
h.add(10);
h.add(50);
h.add(80);

h.add(30);
h.add(10);
h.add(50);
h.add(80);

Iterator<Integer> it =h.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}
