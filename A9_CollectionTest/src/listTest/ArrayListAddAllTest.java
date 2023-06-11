package listTest;

import java.util.ArrayList;

public class ArrayListAddAllTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("vcentry1");//0
		a.add("vcentry2");//1
		a.add("vcentry3");//2
		a.add("vcentry4");//3 
		
		
		ArrayList b = new ArrayList();
		b.add("vcentry5");//0//4
		b.add("vcentry6");//1//5
		b.add("vcentry7");//2//6
		b.add("vcentry8");//3//7
		
	//System.out.println(a.add(b.get(0)));
		a.addAll(b);
		for(int i=0;i<a.size();i++) {
			System.out.println( a.get(i));
		}
	}

}
