
public class Employee {
//attributes
private String name;
private String jobTitle;
private int Emplid;

private static int NextEmplid = 100;

public Employee(String name, String jobTitle) {
	this.name= name;
	this.jobTitle = jobTitle;
	Emplid= NextEmplid;
	NextEmplid++;
}
	
//getters and setters

public void setName(String name) {
	this.name = name;
	
}

public String getName() {
	return name;
}

public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}

public String getJobTitle() {
	return jobTitle;
}

public int getEmployeeID() {
	return Emplid;
}

public void setEmployeeID(int Emplid) {
	this.Emplid =Emplid;
}
}
