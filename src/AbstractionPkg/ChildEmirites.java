package AbstractionPkg;

public class ChildEmirites extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ParentAircraft pa=new ChildEmirites();
		pa.safetyGuideline();
		pa.engine(); */

		ChildEmirites ce=new ChildEmirites();
		ce.aircraftColor();
		ce.engine();
		ce.safetyGuideline();
		
		//because of inheritence we can access parent class method without creating object of that class.
	}

	@Override
	public void aircraftColor() {
		// TODO Auto-generated method stub
		System.out.println("Aircraft Color is : White");
	}

}
