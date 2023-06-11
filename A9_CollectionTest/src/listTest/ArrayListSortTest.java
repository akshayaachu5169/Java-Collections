package listTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortTest {
//different data types cannot be sorted
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> a =new ArrayList<String>();
a.add("java");
a.add("python");
a.add("Ruby");
a.add("c language");

for(int i=0;i<a.size();i++) {
	System.out.println("Before sorting:" + a.get(i));
}
Collections.sort(a);
for(int i=0;i<a.size();i++) {
	System.err.println("After sorting:" + a.get(i));
}
	}

}
