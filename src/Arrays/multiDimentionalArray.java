package Arrays;

public class multiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDemo ad= new ArrayDemo();
		
		ad.getData();

		int a[][] = new int[2][3];

		a[0][0] = 2;
		a[0][1] = 1;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.print("\n");

		int c[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		
		
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int min = b[2][2];

		for (int k = 0; k < 3; k++) {
			for (int l = 0; l < 3; l++) {
				if (b[k][l] < min) {
					min= b[k][l];
				}

			}
		}
		System.out.print("\n");

		System.out.print("Minimum Number:"+min);
		System.out.print("\n");

		
		int d[][] = { { 8, 2, 3 }, { 4, 1, 6 }, { 7, 8, 9 } };
		int min2 = d[0][0];
		int minCol=0;

		for (int n = 0; n < 3; n++) {
			for (int o = 0; o < 3; o++) {
				if (d[n][o] < min2) {
					min2= d[n][o];
					minCol=o;
				}

			}
		}
		
		int k=0;
		int max=d[0][0];
		while(k<3) {
			if(d[k][minCol]>max) {
				max=d[k][minCol];
			}
			k++;
		}
		
		System.out.print("\n");
		System.out.println("Max Number:"+max);
		System.out.print("Min Column:"+minCol);

	}

}
