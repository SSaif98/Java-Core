package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class taskCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashTable -> Pass to table set then print key and value using iterator

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(0, "Saif");
		hm.put(1, "Haider");
		hm.put(2, "Anwer");
		hm.put(null, null); 
		
		//Convertinh HashMap into Set
		Set s = hm.entrySet();
		//Iterating Set
		Iterator si = s.iterator();

		while (si.hasNext()) {

			Map.Entry mp = (Map.Entry) si.next();

			System.out.println("Key# " + mp.getKey() + " Value: " + mp.getValue());

		}

	}

}
