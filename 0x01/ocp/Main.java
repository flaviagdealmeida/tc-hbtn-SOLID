public class Main {

	private static TypeVehicle typeVehicle;

	public static void main(String[] args) {
		typeVehicle = TypeVehicle.CAR;

		if (typeVehicle == TypeVehicle.CAR) {
			Car car = new Car("Azul", "2022", 2.6, 4);
			car.startVehicle();
		} else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
			Motorcycle motocycle = new Motorcycle("white", "2010", 250);
			motocycle.startVehicle();
		}
	}
}
