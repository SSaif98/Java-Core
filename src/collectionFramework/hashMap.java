package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm1= new HashMap<Integer, String>();
		
		HashMap<Integer, String> hm2= new HashMap<Integer, String>();

		hm1.put(2, "Saif");
		hm1.put(0, "Haider");
		hm1.put(1, "Saif");

		System.out.print(hm1.get(0));//get value by key
		System.out.print(hm1); //get all values
		hm1.remove(2);

		System.out.println(hm1); //get all values
		
		hm1.replace(0, "Anwer");  //replacing a index value
		System.out.println(hm1); //get all values
		
		hm1.replace(0, "Anwer", "Talha");
		System.out.println(hm1); //get all values
		
		hm2.putAll(hm1);
		System.out.println(hm2); //get all values

		hm1.clear();//remove all key value from hashmap
		System.out.println(hm1); //get all values
		
		
		//HashTable -> Pass to table set then print key and value using iterator
		//we have converted hashmap into a set
		Set sm=	hm2.entrySet();
		Iterator smi=	sm.iterator();
		while(smi.hasNext())
		{
		//	System.out.println(smi.next());
			
			//To get Key and value separate.
			
			Map.Entry mp= (Map.Entry) smi.next();
			System.out.println(mp.getKey());
		//	System.out.println(mp.getValue());
			

		}
			
	}

}
