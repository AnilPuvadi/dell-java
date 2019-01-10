import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		String myname = "Anil";
		System.out.println("Hello My name is " + myname + "; What is your name");
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		System.out.println("Hello "+ input +", How are you doing");
		reader.close();	
	}
}
