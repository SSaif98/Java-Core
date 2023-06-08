package collectionFramework;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> str= new ArrayList<String>();
		 
		 ArrayList<Integer> num= new ArrayList<Integer>();
		 
		 num.add(1);
		 num.add(1, 6);
		 
		 
		str.add("Saif");
		str.add("Haider"); 
		str.add(0, "Talha");//add on specific index
		str.add(3, "Ali");//add on specific index

		str.remove(2);
		str.remove("Saif");
		System.out.println(str);

		System.out.println(str.get(1)); //print value of particular index
		
		//If "Ali" is present or not
		System.out.println(str.contains("Ali"));
		
		System.out.println(str.indexOf("Ali"));//Find index of particular element
		
		System.out.println(str.size());//Find size of array list
		

		System.out.println(str.isEmpty());//Returns boolen if it is empty.

	
		
		System.out.println(num);
		
		str.removeAll(str); //remove all elements from str collection
		System.out.println(str);
		
		 ArrayList<String> str2= new ArrayList<String>();
		 str2.add("Root");
		str2.add("Butler"); 
		 
		str.addAll(str2);
		System.out.println(str);

	}

}
