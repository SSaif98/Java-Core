package collectionFramework;

import java.util.*;

public class hashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> ht= new Hashtable<Integer, String>();
		
		try {
			ht.put(null, null);
		System.out.println(ht);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
