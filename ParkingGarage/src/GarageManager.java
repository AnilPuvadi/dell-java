
public class GarageManager {

	public static void main(String[] args) {
		//instantiate Garage
		ParkingGarage garage1 = new ParkingGarage(5);
		ParkingGarage garage2 = new ParkingGarage(7);
		ParkingGarage garage3 = new ParkingGarage(10);
		
		//instantiate cars and attributes of cars
		Car car1 = new Car();
		car1.color = "Black";
		car1.license = "GNM0454";
		car1.make = "Honda";
		car1.model = "Accord";

		Car car2 = new Car();
		car2.color = "Brown";
		car2.license = "GNM0354";
		car2.make = "Nissan";
		car2.model = "Altima";

		Car car3 = new Car();
		car3.color = "RED";
		car3.license = "GNM0254";
		car3.make = "BMW";
		car3.model = "X5";

		Car car4 = new Car();
		car4.color = "Yellow";
		car4.license = "GNM0999";
		car4.make = "Audi";
		car4.model = "Q4";

		Car car5 = new Car();
		car5.color = "Green";
		car5.license = "GNM0001";
		car5.make = "Honda";
		car5.model = "CRV";

		//calling methods to park/vacate & print inventory
		garage1.park(car5, 1);
		System.out.println("****************************");
		System.out.println("Inventory for Garage 1");
		System.out.println("****************************");
		garage1.printInventory();
		garage1.park(car4, 2);
		garage1.park(car3, 9);
		System.out.println("****************************");
		System.out.println("Inventory for Garage 1");
		System.out.println("****************************");
		garage1.printInventory();
		garage2.park(car3, 3);
		System.out.println("****************************");
		System.out.println("Inventory for Garage 2");
		System.out.println("****************************");
		garage2.printInventory();
		garage2.park(car1, 4);
		garage3.park(car2, 5);
		System.out.println("****************************");
		System.out.println("Inventory for Garage 3");
		System.out.println("****************************");
		garage3.printInventory();
		garage2.vacate(6);
		System.out.println("****************************");
		System.out.println("Inventory for Garage 2");
		System.out.println("****************************");
		garage2.printInventory();

	}

}
