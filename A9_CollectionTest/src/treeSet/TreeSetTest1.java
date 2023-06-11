package treeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//TreeSet t =new TreeSet();
Set <String>t =new TreeSet<String>();
t.add("Vcentryb");
t.add("Vcentryc");
t.add("Vcentryf");
t.add("Vcentrye");

t.add("Vcentryb");
t.add("Vcentryc");
t.add("Vcentryf");
t.add("Vcentrye");
Iterator <String>it = t.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

	}

}
