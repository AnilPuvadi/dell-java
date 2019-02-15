
public class Condo implements Rentable {
	String description;
	double weeklyRate;
	public Condo(double weeklyRate, String description) {
		this.weeklyRate = weeklyRate;
		this.description =description; 
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getDailyRate() {
		return weeklyRate/7;
	}
	
	public double getPrice(double days) {
		return days*this.getDailyRate();
	}
}
