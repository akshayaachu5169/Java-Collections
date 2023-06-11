package listTest;

import java.util.ArrayList;

public class ArrayListClearTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("vcentry1");//0
		a.add("vcentry2");//1
		a.add("vcentry3");//2
		a.add("vcentry4");//3 
		
			System.out.println("Before clearing:" + a.size());
		a.clear();
		System.err.println("After clearing:" + a.size());
	}

}
