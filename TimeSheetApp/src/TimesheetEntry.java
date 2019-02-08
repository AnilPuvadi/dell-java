import java.time.LocalDateTime;

public class TimesheetEntry {

	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private static int NEXTID = 1;
	
	public TimesheetEntry(String myProject, String myTask) {
		projectName = myProject;
		task = myTask;
		startTime = LocalDateTime.now();
		id = NEXTID;
		NEXTID++;
	}
	
	//getters and setters
	
	public void setProjectName(String projectName) {
		this.projectName= projectName;
	
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public void setTask(String task) {
		this.task = task;
	}
	
	public String getTask() {
		return task;
	}
	
	public void setId( int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	
	public LocalDateTime getStartTime() {
		return startTime;
	}
	
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	
	public LocalDateTime getEndTime() {
		return endTime;
	}
	
	//methods
	public void updateEndTime() {
		if (endTime==null) {
			endTime = LocalDateTime.now();
		}
	}
}
