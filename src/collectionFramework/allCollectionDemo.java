package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class allCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 6, 7, 8, 2, 2, 2, 8, 8, 9 };

		// print unique number
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
				if(k==1) {
					System.out.println(a[i]+" is unique number");
				}
			}

		}
	}

}
