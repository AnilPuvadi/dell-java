import java.util.ArrayList;
import java.util.List;
public class Dao {

	//attributes
		private List<ToDoItem> database;
		private List<ToDoItem> pendingItems;
		private List<ToDoItem> completedItems;
		public Dao() {
			database = new ArrayList<>();
		}
		
	
	//Method to add new To-Do item to array list
	public void	add(String description) {
		ToDoItem item = new ToDoItem(description);
		database.add(item);
	}
	
	//Method to locate the To Do item in the Array List based on ID and return the item
	public ToDoItem get(int id) {
		for (int i=0;i<database.size();i++) {
			if (database.get(i).getId()==id) {
				return database.get(i);
			}
		}
		return null;
	}
	
	//Method to delete a To-do Item from Array List
	public void delete(ToDoItem entry) {
		database.remove(entry);
	}
	//Method to update a To-do item as complete
	public void update(ToDoItem entry) {
		entry.setIsCompleted(true);
	}
	
	//Metohod to return the list of all/completed/pending To-Do items based on user's input
	public List<ToDoItem> list(String input) {
		pendingItems =  new ArrayList<>();
		completedItems = new ArrayList<>();
		if (input.equals("all")) {
			return database;
		}
		else {
			for(int i =0;i<database.size();i++) {
				if(database.get(i).getIsCompleted()==false) {
					pendingItems.add(database.get(i));
				} else {
					completedItems.add(database.get(i));
				}
			}
		
			if (input.equals("complete")) {
				return completedItems;
				
			}
			
			else {
				return pendingItems;
			}
		}
		
		
	
		
	}
	

}
	

