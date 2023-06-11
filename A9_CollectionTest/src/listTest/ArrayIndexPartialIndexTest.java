package listTest;

import java.util.ArrayList;

public class ArrayIndexPartialIndexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("vcentry1");//0
		a.add("vcentry2");//1
		a.add(0,"vcentry3");//2
		a.add(1,"vcentry4");//3 last insertion first preference
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}

}
