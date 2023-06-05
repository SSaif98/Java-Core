package overLoadingRiding;

public class overLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overLoading ol= new overLoading();
		
		ol.getData(2, 4);
		ol.getData("Saif");
	}

	public void getData(String a) {
		System.out.println(a);
	}

	public void getData(int a) {
		System.out.println(a);
	}
	public void getData(int a, int b) {
		System.out.println(a+b);
	}
}
