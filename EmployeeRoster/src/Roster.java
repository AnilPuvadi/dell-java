import java.util.ArrayList;
import java.util.List;

public class Roster {
	
	private List<Employee> roster;

	public Roster() {
		roster = new ArrayList<>();
	}
	
	//getters and setters
	public List<Employee> getRoster(){
		return roster;
	}
	
	public void setRoster(List<Employee> roster) {
		this.roster = roster;
	}
	
	//methods
	public void addEmployee(Employee toAdd) {
		roster.add(toAdd);
	}
	
}

	