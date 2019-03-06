import java.util.List;
import java.util.Scanner;

public class ConsoleUtils {

	/* Member variables */
	
    private Scanner scanner;
        
    /* Constructor */
    
    public ConsoleUtils(){
        scanner = new Scanner(System.in);
        
    }

	/* Methods */
	
	/*
	 * Prints the menu of actions to the console
	 */
    public void printHelp(){
        System.out.println("Valid commands: ");
        System.out.println("  list all 		list all to do Items");
        System.out.println("  list pending 		list pending to do Items");
        System.out.println("  list complete 	list completed to do Items");
        System.out.println("  add                   add an entry");
        System.out.println("  update ID             mark the entry as completed");
        System.out.println("  delete ID             delete entry with the ID");
        System.out.println("  help                  print help");
        System.out.println("  quit                  quit the app");
        System.out.println();

    }

	/*
	 * Prints an informational message to the console
	 */
    public void info(String msg){
        System.out.println("["+msg+"]");
        System.out.println();
    }

	/*
	 * Prints an error message to the console
	 */
    public void error(String msg){
        System.out.println("[ERROR: "+msg+"]");
        System.out.println();
        }

	/*
	 * Prompts the user to enter input
	 * Returns the text entered by the user
	 */
    public String promptString(String label){
        System.out.print(label+" ");
        return scanner.nextLine();
    }

	/*
	 * Prints a list of ToDoItem objects in a pretty table
	 */
    public void printList(List<ToDoItem> entries){
        int longestItem =  7;

        for(ToDoItem entry : entries){
            if(entry.getDescription().length() > longestItem){
            	longestItem = entry.getDescription().length();
            }
            
        }

        String projectHeader = String.format("%"+longestItem+"s", "Project");
        String projectUnderline = "";
        for(int i=0;i<longestItem;i++){
            projectUnderline+="-";
        }
        

        System.out.println(" ID | "+projectHeader   +" |  Is Completed            ");
        System.out.println("----+-"+projectUnderline+"+|--------------------------");

        for(ToDoItem entry : entries){
            String item = String.format("%-"+longestItem+"s", entry.getDescription());
            boolean isComplete = entry.getIsCompleted();
            String line = String.format(" %2s | %s | %s ", entry.getId(), item, isComplete);
            System.out.println(line);
        }

        if(entries.size() == 1){
            System.out.println("[1 entry]");
        } else {
            System.out.println("["+entries.size()+" entries]");
        }

        System.out.println();
    }
}