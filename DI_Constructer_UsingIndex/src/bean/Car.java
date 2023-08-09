package bean;

public class Car {

	
	private String carname;
	private int price;


	
	public Car(String carname, int price) {
		super();
		this.carname = carname;
		this.price = price;
	}



	public void Details() {
		System.out.println("car name is "+carname);
		System.out.println("car cost is "+price);
	}
}
