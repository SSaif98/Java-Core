package Arrays;

import java.lang.reflect.Array;

public class ArrayDemo {
	
	public void getData() {
		System.out.println("this is data");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(a); //array hatch
		System.out.println(a.length); //array length
		
		for(int i=0; i< a.length;i++) {
			System.out.println(a[i]); //array hatch

		}
		
		//array literal
		int b[]= {2,3,4,5,6};
		

	}

}


// Container store multiple values of same Datatype.