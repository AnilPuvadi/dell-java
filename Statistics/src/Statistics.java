import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		System.out.println("Please enter comma separated numbers");
		Scanner reader = new Scanner(System.in);
		String strUserInput = reader.nextLine();
		String[] arraystrUserInput = strUserInput.split(",");
		int[] arrayintUserInput = new int[arraystrUserInput.length];
		//Parse String array elements to Integer Array elements
		for (int i = 0; i < arraystrUserInput.length; i++) {
			arrayintUserInput[i] = Integer.parseInt(arraystrUserInput[i]);
		}
		System.out.println("Number of elements entered by user is "+arrayintUserInput.length);
		printMinMaxNumber(arrayintUserInput);
		printSumAndAverage(arrayintUserInput);

		reader.close();
	}
	//Method to calculate and print both Minimum and Maximum Numbers
	public static void printMinMaxNumber(int[] intArray) {
		int intMaxNumber = intArray[0];
		int intMinNumber = intArray[0];
		for (int i = 1; i < intArray.length; i++) {
			if (intMaxNumber < intArray[i]) {
				intMaxNumber = intArray[i];
			} 
			else if (intMinNumber > intArray[i]) {
				intMinNumber = intArray[i];
			}
		}
		System.out.println("Maximum Number is :" + intMaxNumber);
		System.out.println("Minimum Number is :" + intMinNumber);
	}
	//Method to calculate and Print Sum and Average of the Numbers
	public static void printSumAndAverage(int[] intArray) {
		int intSum = 0; 
		for (int i = 0; i < intArray.length; i++) {
			intSum = intSum+intArray[i];
			}
		System.out.println("Sum of the elements is:"+ intSum);
		Double doubleAverage = (double)intSum/(double)intArray.length;
		System.out.println("Average of the elements is:"+ doubleAverage);
			
	}

}
