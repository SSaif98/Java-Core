package Constructors;

public class java_constructor {
	
	protected String name="Saif";
	protected int age=25;

	public java_constructor(String name, int age){
		this.name=name;
		this.age=age;
		System.out.println("Constructor Initiated 1. ");
	}
	public java_constructor(){
		
		System.out.println("Constructor Initiated 2. ");
	}
	
	public void getData() {
		System.out.println("I'm Parent Class");

	}
	public void personalInfo() {
		System.out.print("Name: " + this.name + "\nAge: "+this.age);
	}
	
	//constructor will note return any value
	//name of constructor should be class name
	//block of code when ever an object of class is created
	// If contructor is not defined and we run the file then compiler will call default constructor
	// Constructor with no parameters called default constructor

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java_constructor jc= new java_constructor("haider",30);
		java_constructor jc3= new java_constructor();

		jc.personalInfo();
		
		
		
	}

	

}
