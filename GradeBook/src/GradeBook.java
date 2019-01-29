import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class GradeBook {

	public static void main(String[] args) {

		HashMap<String, String> myStudentGrades = readStudentNameAndGrades();
		HashMap<String, Double> myStudentGradeBook = calculateGradeAverage(myStudentGrades);
		printGradeBook(myStudentGradeBook);

	}

	// method to promt the user for number of students and names/grades of the
	// students and then store the values in a Hash map
	public static HashMap<String, String> readStudentNameAndGrades() {
		System.out.println(" Please enter number of students");
		Scanner reader = new Scanner(System.in);
		String noOfStudents = reader.nextLine();
		int intNoOfStudents = Integer.parseInt(noOfStudents);
		HashMap<String, String> studentGrade = new HashMap<String, String>();

		for (int i = 0; i < intNoOfStudents; i++) {
			System.out.println(" Please enter name of student");
			String name = reader.nextLine();
			System.out.println(" Please enter comma sepearated grades of student");
			String grades = reader.nextLine();
			studentGrade.put(name, grades);
		}
		reader.close();
		return studentGrade;

	}

	// method to loop through the studentGrade HashMap and calculate the grade
	// average for each student
	// and store the details to new Hash Map named gradeBook
	public static HashMap<String, Double> calculateGradeAverage(HashMap<String, String> studentGrade) {
		HashMap<String, Double> gradeBook = new HashMap<String, Double>();
		ArrayList<String> names = new ArrayList<String>(studentGrade.keySet());
		for (int i = 0; i < names.size(); i++) {
			String currentName = names.get(i);
			String currentGrades = studentGrade.get(currentName);
			String strGradeArray[] = currentGrades.split(",");// Splitting comma separated grades into array of Strings
			int intGradeArray[] = new int[strGradeArray.length];
			int sumofgrades = 0;
			for (int j = 0; j < strGradeArray.length; j++) {
				intGradeArray[i] = Integer.parseInt(strGradeArray[j]);// converting value of grade from String to
																		// integer
				sumofgrades = sumofgrades + intGradeArray[i];
			}

			double gradeAverage = (double) sumofgrades / (double) intGradeArray.length;
			gradeBook.put(currentName, gradeAverage);

		}

		return gradeBook;

	}

	// method to lookout for each student from hashmap and print their name & grade
	public static void printGradeBook(HashMap<String, Double> MygradeBook) {
		ArrayList<String> names = new ArrayList<String>(MygradeBook.keySet());
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("**********GradeBook*************");
		System.out.println("--------------------------------");
		System.out.println("Student Name:  Grade Average");
		System.out.println("--------------------------------");
		for (int i = 0; i < names.size(); i++) {
			String currentName = names.get(i);
			Double Average = MygradeBook.get(currentName);
			System.out.println(currentName + "    :  " + Average);

		}

	}
}
