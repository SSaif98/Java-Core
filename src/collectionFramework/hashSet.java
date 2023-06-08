package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> str= new HashSet<String>();//<String> is type argument
		str.add("Saif");
		str.add("Saif");
		str.add("Saif");
		System.out.println(str);  //output: Saif
		System.out.println(str.contains("Saif"));
		
		HashSet<String> str2= new HashSet<String>();
		
		str2.add("Saif");
		str2.add("Haider");
		str2.add("Osama");
		System.out.println(str2);
		
		System.out.println(str2.remove("Haider"));
		System.out.println(str2);
		System.out.println(str2.isEmpty());
		
		HashSet<String> str3= new HashSet<String>();
		str3.add("Ali");
		str3.add("Haris");
		
		str2.addAll(str3); //Add one hashset values in other hashset
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str2.size());
		System.out.println(str3.removeAll(str3));
		System.out.println(str3);
		str3.add("Ali");
		str3.add("Haris");
		str3.add("Sami");
		str3.add("Dua");
		str3.add("Eman");

		System.out.println(str3);

		Iterator<String> strI=	str3.iterator();
	/*	System.out.println(strI.next());
		System.out.println(strI.hasNext());
		System.out.println(strI.next());
		System.out.println(strI.hasNext()); */

		
		while(strI.hasNext()) {
			System.out.println(strI.next());
		}




	}

}
