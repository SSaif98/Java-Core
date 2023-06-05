package Constructors;

public class childConstructor extends parentConstructor {

	String name="QA Click Academy";
	public void getData() {
		System.out.println("Child Name: "+name);
		System.out.println("Parent Name: "+super.name);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childConstructor cc= new childConstructor();
		
		cc.getData();
		
		
	}

}
