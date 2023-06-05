package Constructors;

public class java_contructor_2 extends java_constructor {
	
	String hobby;
	
	java_contructor_2(String name, int age, String hobby){
		super(name, age);
		this.hobby=hobby;
	}
	java_contructor_2(){
		System.out.println("This is class 2 constructor");
	}

	public void getDate() {
		super.getData();
		System.out.println("I'm in child class ");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java_contructor_2 jc2= new java_contructor_2("Saif", 2, "Gym");
		java_contructor_2 jc3=new java_contructor_2 ();
		
		jc2.personalInfo();
		System.out.println("\nHobby: "+jc2.hobby);
		
		jc2.getDate();
		jc2.getDate();

		jc2.getDate();


	}

}
