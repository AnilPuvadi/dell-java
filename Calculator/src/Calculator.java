import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
	int num1 = 0, num2 =0;
	Scanner reader = new Scanner(System.in);
	num1 = reader.nextInt();
	num2 = reader.nextInt();
	reader.close();
	System.out.println(num1 +"+"+ num2 +" = " + addition(num1,num2));
	System.out.println(num1 +"-"+ num2 +" = " + substraction(num1,num2));
	System.out.println(num1 +"*"+ num2 +" = " + multiplication(num1,num2));
	System.out.println(num1 +"/"+ num2 +" = " + division(num1,num2));
	System.out.println(num1 +"%"+ num2 +" = " + modulas(num1,num2));
	}

	// Method - Addition
	public static int addition(int num1, int num2) {
		int result = num1 + num2;
		return result;
	
	}
	
	public static int substraction(int num1, int num2) {
		int result = num1 - num2;
		return result;
	
	}
	
	public static int multiplication(int num1, int num2) {
		int result = num1 * num2;
		return result;
	
	}
	
	public static double division(int num1, int num2) {
		double result = (double)num1 /(double)num2;
		return result;
	
	}
	
	public static int modulas(int num1, int num2) {
		int result = num1 % num2;
		return result;
	
	}

}
