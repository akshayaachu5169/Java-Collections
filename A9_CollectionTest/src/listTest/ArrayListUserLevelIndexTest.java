package listTest;

import java.util.ArrayList;

public class ArrayListUserLevelIndexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a = new ArrayList<String>();
a.add(0,"vcentry1");//if here 1, error because the block for 0 is not yet created
a.add(0,"vcentry2");
a.add(0,"vcentry3");//1
a.add(3,"vcentry4");

for(int i=0;i<a.size();i++) {
	System.out.println(a.get(i));
}
	}

}
