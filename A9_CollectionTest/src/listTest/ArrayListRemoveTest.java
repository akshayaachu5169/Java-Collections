package listTest;

import java.util.ArrayList;

public class ArrayListRemoveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("vcentry1");//0
		a.add("vcentry2");//1
		a.add("vcentry3");//2
		a.add("vcentry4");//3 
		for(int i=0;i<a.size();i++) {
			System.out.println("Before removing:" + a.get(i));
		}
		
		System.out.println("-------------------------------");
		a.remove(2);
		for(int i=0;i<a.size();i++) {
			System.out.println("After removing:"+ a.get(i));
		}
	}

}
