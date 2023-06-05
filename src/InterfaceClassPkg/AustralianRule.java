package InterfaceClassPkg;

import rulesPkgInterface.ContinentalRules;
import rulesPkgInterface.Rules;

public class AustralianRule implements Rules, ContinentalRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rules ar= new AustralianRule();  //creating object of the class 
		ContinentalRules cr= new AustralianRule();
		/*
		 * by using this object we can access methods and variable of interface
		 */
		AustralianRule a= new AustralianRule();
		ar.greenGo();	
		ar.redStop();
		ar.yellowWait();
		System.out.println(a.val);
		
		cr.TrainSymbol();
		
		a.walkOnSymbol();

		}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Gooo");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Stopppp");
	}

	@Override
	public void yellowWait() {
		// TODO Auto-generated method stub
		System.out.println("Waittt");
	}
	
	public void walkOnSymbol() {
		System.out.println("Walk");
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train Symbol");

	}

}


