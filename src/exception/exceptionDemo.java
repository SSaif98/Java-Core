package exception;

public class exceptionDemo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int a = 90;
		int b = 0;

		try {
			//int c = a / b;
			int arr[]= {1,3,42};

		//	System.out.println(c);
			System.out.println(arr[3]);

		} 
		catch(ArithmeticException at){
			System.out.println("I catched error: "+at);

		}
		 
		catch(ArrayIndexOutOfBoundsException aio){
			System.out.println("I catched error: "+aio);

		}
		catch (Exception e) { //for any kind of exception
			System.out.println("I catched error: "+e);
		}
		finally{
			//this block will be executed irrespective of exception thrown or not
			System.out.println("Delete Cookies");

		}

	}

}
