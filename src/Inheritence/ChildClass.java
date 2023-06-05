package Inheritence;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ChildClass cc=new ChildClass();
		cc.vehicleColor();
		
		cc.audioSystem();
		cc.breake();
		cc.engine();		

	}

	public void vehicleColor() {
		System.out.println(color);

	}
	public void engine() {
		System.out.println("New Engine code is implemented");
	}
}
