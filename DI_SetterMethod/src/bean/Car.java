package bean;

public class Car {

	
	private String carname;

	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	public void Details() {
		System.out.println("Car name is "+ carname);
	}
}
