package java;

import java.util.Hashtable;

public class Hashtableprogram {

	public static void main(String[] args) {
Hashtable<Integer,String> map = new Hashtable<>();
map.put(10, "10");
map.put(20, "A");
map.put(30, "Hello");
map.put(50, "good");
map.put(40, "Hi");
System.out.println(map);
map.remove(30);
System.out.println(map);

	}

}
