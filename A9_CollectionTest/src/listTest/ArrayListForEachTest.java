package listTest;

import java.util.ArrayList;


public class ArrayListForEachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> a = new ArrayList<String>();
		a.add("java");
		a.add("python");
		a.add("Ruby");
		a.add("c language");
		a.add("java");
		//can use iterator also
		
		for (String newref : a) {
			System.out.println(newref);
		}
	}

}
