import java.util.ArrayList;
import java.util.List;
import java.util.List;
public class Timesheet {
	//attributes
	private List<TimesheetEntry> database;
	private List<TimesheetEntry> activeEntries;
	
	
	public Timesheet() {
		database = new ArrayList<>();
	}
	
public void	add(String project, String task) {
	TimesheetEntry timesheet = new TimesheetEntry(project, task);
	database.add(timesheet);

}

public List<TimesheetEntry> list(boolean activeOnly ){
	if (activeOnly) {
		activeEntries = new ArrayList<>();
		for(int i =0;i<database.size();i++) {
			if(database.get(i).getEndTime()!=null) {
				activeEntries.add(database.get(i));
			}
		}
		
		return activeEntries;
		
	} else {
		return database;	
	}
		
}

public TimesheetEntry get(int id) {
	for (int i=0;i<database.size();i++) {
		if (database.get(i).getId()==id) {
			return database.get(i);
		}
	}
	return null;
}
public void delete(TimesheetEntry entry) {
	database.remove(entry);
}

public void stop(TimesheetEntry entry) {
	entry.updateEndTime();
}

}
