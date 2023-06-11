package listTest;


import java.util.ArrayList;
import java.util.List;

public class ArraySubListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>a = new ArrayList<String>();
		a.add("vcentry1");//0
		a.add("vcentry2");//1
		a.add("vcentry3");//2         
		a.add("vcentry4");//3          
		a.add("vcentry5");//4          
		a.add("vcentry6");//5          
		a.add("vcentry7");//6          
		a.add("vcentry8");//7          
		//System.out.println(a.subList(1, 7));
		List<String> b = a.subList(1, 7);
		System.out.println("size of the list:" + b.size());
		for(int i=0;i<b.size();i++) {
			System.out.println(b.get(i));
		}
	}

}
