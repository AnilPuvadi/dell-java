public class ToDoItem {

//member variables
	private int id;
	private String description;
	private boolean isCompleted;
	private static int NEXTID = 1;
	
	public ToDoItem(String myDescription) {
		description = myDescription;
		isCompleted = false;
		id = NEXTID;
		NEXTID++;
	}
	
	//getters and setters
	
	public void setDescription(String description) {
		this.description= description;
	
	}
	
	public String getDescription() {
		return description;
	}
		
	public void setId( int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setIsCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	public boolean getIsCompleted() {
		return isCompleted;
	}
	

}
	
