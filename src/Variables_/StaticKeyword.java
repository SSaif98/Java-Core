package Variables_;

public class StaticKeyword {

	//Instance Variables.
	String name;
	String address;
	static String city ="Karachi";  //Class Variables.
	static int i=0;
	int j=0; //it means when we call it will be access as new instance always.

	static String country;
	
	static { //static block used to initialize static variables.
		country= "Pakistan";
	}
	
	StaticKeyword(String name, String address){  //local variables
		this.name= name;
		this.address= address;
		i++;
		j++;
		System.out.println("i: "+i + "\nj: "+j);
	}
	
	public void getAddress() {
		System.out.println(address + "\nCity: "+city);
	}
	public static void getCity() {
		System.out.println("Static City: "+city);
	}
	


public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	StaticKeyword obj1= new StaticKeyword("Bob", "Saddar");
	StaticKeyword obj2= new StaticKeyword("Johnson", "Landhi");

	obj1.getAddress();
	obj2.getAddress();
	getCity();
	StaticKeyword.getCity();

}

}
