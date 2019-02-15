
import java.util.ArrayList;
import java.util.List;
public class CarLot {

//attributes	
 public String nameOfTheLot;
  public List<Truck> trucks;
  public List<Car> cars;

 public CarLot() {
	 cars = new ArrayList<>();
	 trucks = new ArrayList<>();
 }

 //getters & Setters
 public void setNameOfTheLot(String nameOfTheLot) {
	 this.nameOfTheLot = nameOfTheLot;
 }
 
 public String getNameOfTheLot() {
	 return nameOfTheLot;
 }
 
  //Methods
 //method to add Truck to the Car Lot
 public void addTruck(Truck myTruck) {
	 trucks.add(myTruck) ;
 }
//method to add Car to the Car Lot
 public void addCar(Car mycar) {
	 cars.add(mycar) ;
 }

 public void printInventory() {
	 System.out.println("------------------------------------");
	 System.out.println("Inventory of CarLot :"+nameOfTheLot);
	 System.out.println("------------------------------------");
	 int numberOfVehicles = cars.size()+trucks.size();
	 System.out.println("Total number of vehicles in the Lot are :"+ numberOfVehicles);
	 System.out.println("************List of cars********************");
	 for (int i=0;i< cars.size();i++) {
		 System.out.println("Car Number# "+(i+1)+" |License: "+cars.get(i).getLicenseNUmber()
				 +"| Make: "+ cars.get(i).getMake()
				 +"| Model: "+ cars.get(i).getModel()
				 +"| Price: "+ cars.get(i).getPrice());
	 }
	 
	 System.out.println("************List of Trucks*******************");
	 for (int i=0;i< trucks.size();i++) {
		 System.out.println("Truck Number# "+(i+1)+"| License: "+trucks.get(i).getLicenseNUmber()
				 +"| Make: "+ trucks.get(i).getMake()
				 +"| Model: "+ trucks.get(i).getModel()
				 +"| Price: "+ trucks.get(i).getPrice());
	 }
	 System.out.println("~~~~~~~~~~~~End of Inventory~~~~~~~~~~~~~~~~~~~~");
 }
 
}
