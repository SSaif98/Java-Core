package Variables_;

public class InstanceVar {

		//Instance Variables.
		String name;
		String address;
		String city;
		
		InstanceVar(String name, String address, String city){  //local variables
			this.name= name;
			this.address= address;
			this.city=city;
		}
		
		public void getAddress() {
			System.out.println(address);
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVar obj1= new InstanceVar("Bob", "Saddar","Karachi");
		InstanceVar obj2= new InstanceVar("Johnson", "Landhi","Karachi");

		obj1.getAddress();
		obj2.getAddress();

	}

}
