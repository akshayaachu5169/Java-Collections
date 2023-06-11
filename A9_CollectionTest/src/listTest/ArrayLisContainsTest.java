package listTest;

import java.util.ArrayList;

public class ArrayLisContainsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("java");//0
		a.add("python");//1
		a.add("Ruby");//2
		a.add("c language");//3
		System.out.println(a.contains("java"));
		System.out.println(a.contains("Achu"));
	}

}
