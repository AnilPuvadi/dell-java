
public abstract class Vehicle {
 private String licenseNumber;
 private String make;
 private String model;
 private int price;
 
 public Vehicle() {
	 
 }
	
 //Setters and getters
 public void setLicenseNumber(String licenseNumber) {
	 this.licenseNumber = licenseNumber;
 }
 
 public String getLicenseNUmber() {
	 return licenseNumber;
 }
 
 public String getMake() {
	 return make;
 }
 
 public void setMake(String make) {
	 this.make = make;
 }
 
 public void setModel(String model) {
	 this.model = model;
 }
 
 public String getModel() {
	 return model;
 }
 
 public void setPrice(int price) {
	 this.price = price;
 }
 
 public int getPrice() {
	 return price;
 }
 //methods
 //method to print details of the car
 public void printDescription() {
	 System.out.println("License: "+licenseNumber
			 +"Make: "+ make
			 +"Model: "+ model
			 +"Price: "+ price);
 }
 
 
}
