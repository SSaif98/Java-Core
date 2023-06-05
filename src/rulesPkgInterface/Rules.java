package rulesPkgInterface;

public interface Rules {

	public void greenGo();
	public void redStop();
	public void yellowWait();
	public int val=4;
}


//Interface has methods without body
//classes should defines and implements method in interface
//Class that is implementing the interface should implement on all methods of interface
//We can define varibales in interface but they should be public
// A class can implements more then one interface by coma separated.