package listTest;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a = new ArrayList();//non generic
a.add("Vcentry");
a.add(400);
a.add(true);
a.add('a');
a.add(10.5);
System.out.println("length:" +  a.size());
for(int i=0;i<a.size();i++) {
	System.out.println(a.get(i));
}

	}

}
