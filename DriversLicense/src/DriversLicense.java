
public class DriversLicense {

	//attributes
	public String driversFirstName;
	public String driversLastName;
	public String driversDOB;
	public String driversHeight;
	public String driversGender;
	
	public DriversLicense() {
		
	}
	//Methods
	
	//getter and setter methods
	
	public String getDriversFirstName() {
		return driversFirstName;
	}
	
	public void setDriversFirstName(String myDriversFirstName) {
		driversFirstName = myDriversFirstName;
	}


	public String getDriversLastName() {
		return driversLastName;
	}


	public void setDriversLastName(String driversLastName) {
		this.driversLastName = driversLastName;
	}


	public String getDriversDOB() {
		return driversDOB;
	}


	public void setDriversDOB(String driversDOB) {
		this.driversDOB = driversDOB;
	}


	public String getDriversHeight() {
		return driversHeight;
	}


	public void setDriversHeight(String driversHeight) {
		this.driversHeight = driversHeight;
	}


	public String getDriversGender() {
		return driversGender;
	}


	public void setDriversGender(String driversGender) {
		this.driversGender = driversGender;
	}


	//method to derive the full name of the Driver
	public String getFullname() {
		return getDriversFirstName()+" "+getDriversLastName();
	}
	
	//method to calculated Age based on Date of Birth of Driver
	public int getAge() {
		 String sBirthYear = driversDOB.substring(6);
		 int iBirthYear = Integer.parseInt(sBirthYear);
		 return 2019-iBirthYear;
	}
	
	
}
