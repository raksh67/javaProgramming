package java;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
HashMap<Integer,String>map=new HashMap<>();
map.put(10, "A");
map.put(30, "Hi");
map.put(null, "Hello");
map.put(null, "20");
map.put(20, null);
map.put(25, null);
map.put(40, null);
map.put(40, "Bye");
for(Entry<Integer, String> m:map.entrySet())
{
	System.out.println(m.getKey()+" "+m.getValue());
		
}

	}

}
