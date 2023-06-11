package listTest;

import java.util.ArrayList;

public class ArrayListIndexOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> a = new ArrayList<String>();
		a.add("java");//0
		a.add("python");//1
		a.add("Ruby");//2
		a.add("c language");//3
		
		System.out.println(a.indexOf("Ruby"));
		System.out.println(a.indexOf("React"));
	}

}
