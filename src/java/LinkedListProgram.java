package java;

import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
LinkedList<Object> list=new LinkedList();
list.add(10);
list.add("hi");
list.add('B');
list.addFirst("Hello");
list.addLast("Bye");
System.out.println(list);
System.out.println(list.getFirst());
System.out.println(list.getLast());
System.out.println(list.get(2));
	}

}
