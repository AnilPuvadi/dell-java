
public class Room implements Rentable{
	String description;
	double dailyRate;
	
	public Room(double dailyRate, String queen) {
		this.dailyRate = dailyRate;
		this.description = queen;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getDailyRate() {
		return dailyRate;
	}
	
	public double getPrice(double days) {
		return days*dailyRate;
	}
	
}
