
public class Tool implements Rentable {
	String description;
	double hourlyRate;
	
	public Tool(double hourlyRate, String description) {
		this.hourlyRate =hourlyRate;
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getDailyRate() {
		return hourlyRate*7;
	}
	
	public double getPrice(double days) {
		return days*this.getDailyRate();
	}
}
