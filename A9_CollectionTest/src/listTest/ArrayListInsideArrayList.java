package listTest;

import java.util.ArrayList;

public class ArrayListInsideArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<ArrayList> insidelist=  new ArrayList<ArrayList>();

ArrayList a = new ArrayList();//0
a.add("vcentry1");
a.add("vcentry2");
a.add("vcentry3");
a.add("vcentry4");


ArrayList b = new ArrayList();//1
b.add("vcentry5");
b.add("vcentry6");
b.add("vcentry7");
b.add("vcentry8");
insidelist.add(a);
insidelist.add(b);
//System.out.println(insidelist.get(1));
//System.out.println(insidelist.get(0));
System.out.println(insidelist);

	}

}
