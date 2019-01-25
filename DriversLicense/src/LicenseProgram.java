public class LicenseProgram {

	public static void main(String[] args) {
		DriversLicense License1 = new DriversLicense();
		License1.driversFirstName =  "Anil";
		License1.driversLastName =  "Puvvadi";
		License1.driversDOB = "02-26-1986";
		License1.driversHeight = "5 ft 6 inches";
		License1.driversGender = "Male";
		
		DriversLicense License2 = new DriversLicense();
		License2.driversFirstName =  "Padmaja";
		License2.driversLastName =  "Lagamsani";
		License2.driversDOB = "09-29-1989";
		License2.driversHeight = "5 ft 2 inches";
		License2.driversGender = "Female";
		
		DriversLicense License3 = new DriversLicense();
		License3.driversFirstName =  "Sagar";
		License3.driversLastName =  "AJ";
		License3.driversDOB = "05-28-1985";
		License3.driversHeight = "5 ft 11 inches";
		License3.driversGender = "Male";
		
		//Printing details of Driver1
		System.out.println("Driver1:");
		System.out.println("------------------------------");
		System.out.println("Name: "+License1.getFullname());
		System.out.println("Age: "+License1.getAge());
		System.out.println("Height: "+License1.getDriversHeight());
		System.out.println("Gender: "+License1.getDriversGender());
		System.out.println("------------------------------");
		System.out.println();
		//Printing details of Driver2
		System.out.println("Driver2:");
		System.out.println("------------------------------");
		System.out.println("Name: "+License2.getFullname());
		System.out.println("Age: "+License2.getAge());
		System.out.println("Height: "+License2.getDriversHeight());
		System.out.println("Gender: "+License2.getDriversGender());
		System.out.println("------------------------------");
		System.out.println();
		//Printing details of Driver3
		System.out.println("Driver3:");
		System.out.println("------------------------------");
		System.out.println("Name: "+License3.getFullname());
		System.out.println("Age: "+License3.getAge());
		System.out.println("Height: "+License3.getDriversHeight());
		System.out.println("Gender: "+License3.getDriversGender());
		System.out.println("------------------------------");
		
	}

}
