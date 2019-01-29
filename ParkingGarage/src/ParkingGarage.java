
public class ParkingGarage {

	// attributes
	public int capacity;
	public Car[] cars;

	public ParkingGarage() {

	}

	public ParkingGarage(int capacity) {
		this.capacity = capacity;
		cars = new Car[capacity];
	}

	// methods

	// Method to check parking lot and park a car if a spot is available
	public void park(Car car, int spot) {
		try {
			if (cars[spot] == null) {
				cars[spot] = car;
			} else {
				System.out.println("The spot is already filled in please choose another spot");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bound exception: Please select a spot with in range");
		}

	}

	// method to vacate a car from parking spot
	public void vacate(int spot) {

		try {
			if (cars[spot] == null) {
				System.out.println("There is no car available at the spot");
			} else {
				cars[spot] = null;
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bound exception: Please select a spot with in range");
		}

	}

	// method to Print inventory of cars in garage
	public void printInventory() {
		System.out.println("Parking Lot#:  Car");
		System.out.println("-------------------");
		for (int i = 0; i < capacity; i++) {
			if (cars[i] != null) {
				System.out.println("  " + i + "         :License# :" + cars[i].license + " Make:" + cars[i].make
						+ " Model:" + cars[i].model);
			} else {
				System.out.println("  " + i + "         :Empty Lot");
			}

		}

	}

}
