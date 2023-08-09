package bean;

public class Car {
	
	private Engine e;
	public Car(Engine e) {
		super();
		
		this.e = e;
	}
	public void getCarDetails() {
		
		System.out.println("car engine is "+e.getCc());
		
	}
	
}
