public class Car extends Vehicle implements IVehicleCar{
	
	 private int seats;

	public Car(String color, String year, double engine, int seats) {
		super(color, year, engine);
		this.seats = seats;
		configureVehicle( color,  year,  engine,  seats);
	}

	@Override
	public void configureVehicle(String color, String year, double engine, int seats) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startVehicle() {
		// TODO Auto-generated method stub
		
	}

}
