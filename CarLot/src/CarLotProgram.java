
public class CarLotProgram {

	public static void main(String[] args) {
		
		//Instantiate Car Lots
		CarLot carlot1 = new CarLot();
		CarLot carlot2 = new CarLot();
		
		
		carlot1.setNameOfTheLot("VSGarage");
		carlot2.setNameOfTheLot("PublicParking");
		
		//Instantiate Car1
		Car accord = new Car();
		accord.carType = "Mid-Size-Sedan";
		accord.numberOfDoors = 4;
		accord.setLicenseNumber("GNM0201");
		accord.setMake("Honda");
		accord.setModel("Accord");
		accord.setPrice(25000);
		
		//Instantiate Car2
		Car civic = new Car();
		civic.carType = "Compact-Sedan";
		civic.numberOfDoors = 4;
		civic.setLicenseNumber("GNM0301");
		civic.setMake("Honda");
		civic.setModel("Civic");
		civic.setPrice(23000);
		
		//Instantiate Car3
		Car CRV = new Car();
		CRV.carType = "SUV";
		CRV.numberOfDoors = 4;
		CRV.setLicenseNumber("GNM0501");
		CRV.setMake("Honda");
		CRV.setModel("CRV");
		CRV.setPrice(28000);	
		
		//Instantiate Truck1
		Truck dodge = new Truck();
		dodge.bedSize = "10";
		dodge.setLicenseNumber("DDG0909");
		dodge.setMake("Dodge");
		dodge.setModel("RAM1500");
		dodge.setPrice(40000);
		
		//Instantiate Truck2
		Truck chevi = new Truck();
		chevi.bedSize = "15";
		chevi.setLicenseNumber("CHV0999");
		chevi.setMake("Chevrolet");
		chevi.setModel("Silverado");
		chevi.setPrice(40000);	
		
		//Instantiate Truck3
		Truck ford = new Truck();
		ford.bedSize = "20";
		ford.setLicenseNumber("FRD9999");
		ford.setMake("Ford");
		ford.setModel("Frontier");
		ford.setPrice(45000);
		
		//Add cars to carlot1
		carlot1.addCar(accord);
		carlot1.addCar(CRV);
		//Add trucks to carlot1
		carlot1.addTruck(dodge);
		
		//Print inventory of carlot1
		carlot1.printInventory();
		
		//Add cars to carlot2
		carlot2.addCar(civic);
		
		//add trucks to carlot2
		carlot2.addTruck(chevi);
		carlot2.addTruck(ford);
				
		//Print inventory of carlot1
		carlot2.printInventory();
		
		
	}

}
