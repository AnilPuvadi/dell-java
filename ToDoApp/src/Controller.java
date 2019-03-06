public class Controller {

	/* Member variables */
	
    Dao toDoList;
    ConsoleUtils consoleUtils;
    
    /* Constructor */
    
    public Controller(){
        this.toDoList = new Dao();
        this.consoleUtils = new ConsoleUtils();
    }
    
    /* Methods */

	/*
	 * Runs the program
	 */
    public void start() {

        consoleUtils.printHelp(); // Print the action menu

        boolean quit = false;
        while(!quit) {

			// Prompt the user for input, collect input, parse into parts
            String input = consoleUtils.promptString("> ");
            String[] actionParts = input.split(" ");
            String action = actionParts[0].trim(); // Primary action

			// Figure out what to do depending on the user's primary action
            if (action.equals("add")) {

                processAddAction();

            } else if (action.equals("delete")) {

                processDeleteAction(actionParts);

            } else if (action.equals("update")) {

                processUpdateAction(actionParts);

            } else if (action.equals("list")) {

                processListAction(actionParts);

            } else if (action.equals("quit")) {

            	quit =true;

            } else if (action.equals("help")) {
            	consoleUtils.printHelp(); // Print the action menu
            	

            } else if(action.length() ==0 ){
            
                // do nothing.
                
            } else {
            
                // Your code here
                
            }
        }

    }

	/*
	 * The user requested that a given toDoListEntry be updated (marked as complete)
	 * This method conveys that request to the ToDo List
	 */
    public void processUpdateAction(String[] actionParts){

        if(actionParts.length > 2){
            consoleUtils.error("Too many inputs to stop command");
            return;
        }

        int id = Integer.parseInt(actionParts[1]);
        
        //Check if the ID exists in the database and stop if exists else throw 
        //an error message to user.
        if (toDoList.get(id)!=null) {
			toDoList.update(toDoList.get(id));
        	} else {
        		consoleUtils.error("No Item exits with the specified ID");
        	}
    }

	/*
	 * The user requested that a given To-do Item be deleted
	 * This method conveys that request to the To-Do Item list
	 */
    public void processDeleteAction(String[] actionParts){

        if(actionParts.length > 2){
            consoleUtils.error("Too many inputs to delete command");
            return;
        }

        int id = Integer.parseInt(actionParts[1]);
		
		if (toDoList.get(id)!=null) {
				toDoList.delete(toDoList.get(id));
		} else {
			consoleUtils.error("No project exists with the specified ID");
		}
    }

	/*
	 * The user wants to view a list of To Do Items 
	 * This method conveys that request to the Dao
	 */
    public void processListAction(String[] actionParts){
        if(actionParts.length > 3){
            consoleUtils.error("Too many inputs to list command");
            return;
        }
        
        else if (actionParts.length < 2){
        	consoleUtils.error("Not enough inputs to list command");
            return;
        }
        else if  (actionParts[1].equals("all") ||actionParts[1].equals("complete")||actionParts[1].equals("pending") ) {
        	consoleUtils.printList(toDoList.list(actionParts[1]));
        }
        else {
        	consoleUtils.error("Incorrect list commnad, please select valid command");
            return;
        }
        
        
	
    }

	/*
	 * The user wants to add a new entry to the ToDo List
	 * This method conveys that request to the Todo List, along with
	 * the specified ToDo item description 
	 */
    public void processAddAction(){
        String description = consoleUtils.promptString("To Do Item:");
        toDoList.add( description);
		
    }
}
