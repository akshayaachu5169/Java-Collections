package listTest;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                //generic
		ArrayList< String > a = new ArrayList<String>();
		a.add("Akshaya");//0
		a.add("Aswin");//1
		a.add("Aakash");//2
		System.out.println(a.get(1));
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(5);//0
		b.add(150);//1
		b.add(500);//2
		System.out.println(b.get(2));
	
	}

}
