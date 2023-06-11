package listTest;

import java.util.ArrayList;

public class ArrayListCloningTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("vcentry1");
		a.add("vcentry2");
		a.add("vcentry3");
		a.add("vcentry4");
		ArrayList <String>b =  (ArrayList<String>) a.clone();
		
		a.remove(1);
		for (int i = 0; i < a.size(); i++) {
			System.out.println("Before Cloning: " + a.get(i));
		}
		System.out.println("---------------------------");

		for (int i = 0; i < b.size(); i++) {
			System.out.println("After Cloning: " + b.get(i));
		}
	}

}
