package listTest;

import java.util.ArrayList;

public class ArrayListLastIndexOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> a = new ArrayList<String>();
		a.add("java");//0
		a.add("python");//1
		a.add("Ruby");//2
		a.add("c language");//3
		a.add("java");//4
		
		System.out.println(a.lastIndexOf("java"));
	}

}
