package coreJava;

public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int o=1;
		for (int i = 0; i < 4; i++) {

			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(o + "\t");
				o++;
			}
			System.out.print("\n");
		}

		 
		System.out.print("\n");
		System.out.print("\n");

		int r=10;
		for (int k = 0; k < 4; k++) {
			for (int l = 4; l >= 4 - k; l--) {
				System.out.print(r+"\t");
				r--;
			}
			System.out.print("\n");

		}
		System.out.print("\n");

		int c=1;
		for(int a=0 ; a<4 ; a++) {
			
			for(int b = 1; b <= 1+a ;b++) {
				System.out.print(c+"\t");
				c++;
			}
			System.out.print("\n");
		}
		
	
		
		System.out.print("\n");

		for(int d= 0 ; d<4 ;d++) {	
			for(int e=1; e <= 1+d ; e++) {
				System.out.print(e+"\t");	
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		int h=3;
		for(int f= 0 ; f<3 ;f++) {	
			for(int g=3; g <= 3+f ; g++) {
				System.out.print(h+"\t");	
				h=h+3;
			}
			System.out.print("\n");
		}
		
			System.out.print("\n");
		
		
		for(int i=1;i<=5;i++)
		  {
		    for(int j=1;j<=i;j++)
		    {
		    	System.out.print(j%2);
		    }
		    System.out.print("\n");
		  }
	}

}


/*
1
1 0
1 0 1
1 0 1 0
         *
        ***
       *****
      *******
     *********

3
6 9
12 15 18

1
12
123
1234

1
23
456
78910

*/