package AbstractionPkg;

public abstract class ParentAircraft {

	public void engine() {
		System.out.println("Follow engine guideline");
	};
	
	public void safetyGuideline() {
		System.out.println("Follow safety guideline");
	}
	public abstract void aircraftColor();
	
	
}
