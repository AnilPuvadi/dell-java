import java.util.Scanner;
//import java.util.ArrayList;
import java.util.HashMap;

public class GradeBook {

	public static void main(String[] args) {
		System.out.println(" Please enter number of students");
		Scanner reader = new Scanner(System.in);
		String noOfStudents = reader.nextLine();
		int intNoOfStudents = Integer.parseInt(noOfStudents);
		
	for (int i= 0; i<intNoOfStudents; i++) {
			HashMap<String, String> studentGrade = new HashMap<String, String>();
			System.out.println(" Please enter name of student");
			String name = reader.nextLine();
			System.out.println(" Please enter comma sepearated grades of student");
			String grades = reader.nextLine();
		studentGrade.put(name,grades);
	}
	
	reader.close();

	}

}
