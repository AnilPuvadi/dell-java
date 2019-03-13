import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Roster empRoster = new Roster();
		Scanner reader = new Scanner(System.in);
		boolean quit = false;
		
		while (!quit) {
			System.out.println("Command Options: add, list, quit");
			String userInput = reader.nextLine();
			if (userInput.equals("add")) {
				System.out.println(" Please enter name of the employee");
				String name = reader.nextLine();
				System.out.println(" Please enter Job Title of the employee");
				String jobTitle = reader.nextLine();
				Employee emp1 = new Employee(name,jobTitle);
				empRoster.addEmployee(emp1);
			} else if (userInput.equals("list")) {
				listEmployees(empRoster);
			} else if (userInput.equals("quit")) {
				quit = true;				
			} else {
				System.out.println("Invalid input, please select a valid comand");
			}
		}
		
	
		
		reader.close();
		
		

	}

	public static void listEmployees(Roster empRoster) {
		System.out.println("------------------------");
		System.out.println("Emplid : Employee Name : Job Title");
		System.out.println("------------------------");
		for(int i=0;i<empRoster.getRoster().size();i++) {
			System.out.println(empRoster.getRoster().get(i).getEmployeeID()+" : "+empRoster.getRoster().get(i).getName()+" : "+empRoster.getRoster().get(i).getJobTitle());
		}
		System.out.println("------------------------");
	}
}
