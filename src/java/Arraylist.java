package java;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
ArrayList<Integer> list=new ArrayList<>();
list.add(5);
list.add(20);
list.add(10);
list.add(1);
Collections.sort(list);
for (Integer obj : list) {
	System.out.println(obj);
	
}
	}

}

