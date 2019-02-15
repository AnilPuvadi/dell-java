import java.util.Scanner;
public class RentableProgram {

	public static void main(String[] args) {
	//Instantiate rentable objects
		Room queen = new Room(200, "Queen size Room  ");
		Room King = new Room(250, "King size Room   ");
		Room Suite = new Room(300, "Deluxe Suite Room");
		Condo singleBed = new Condo(500,"Single Bed Condo ");
		Condo twoBed = new Condo(1000,"Double Bed Condo ");
		Tool hammer = new Tool(5,"Hammer Tool      ");
		Tool drilMachine = new Tool(10,"Drilling Machine ");
		Tool chainSaw = new Tool(12,"Chaisaw          ");
		Tool toolkit = new Tool(8,"Tool Kit         ");
		Tool trolly = new Tool(2,"Platform Trolly  ");
	
		//Add the rentable items to an array
		Rentable[] items = new Rentable[10];
		items[0] = queen;
		items[1] = King;
		items[2] = Suite;
		items[3] = singleBed;
		items[4] = twoBed;
		items[5] = hammer;
		items[6] = drilMachine;
		items[7] = chainSaw;
		items[8] = toolkit;
		items[9] = trolly;
		
		//Print all the items and daily rate
		System.out.println("Please find the list of items below availale for rent");
		System.out.println("-----------------------------------------------------");
		System.out.println("Item Description | Daily Rate");
		System.out.println("-----------------|------------");
		for (int i=0;i<items.length;i++) {
			System.out.println(items[i].getDescription() +"|"+ items[i].getDailyRate());
		}
		System.out.println("-----------------------------------------------------");
		
		// Ask the user to enter number of days and read the input
		System.out.println("Please enter the number of days to get the price of each item");
		Scanner reader = new Scanner(System.in);
		int noOfDays = reader.nextInt();
		reader.close();
		System.out.println("Item Description  |Daily Rate|Final Price for "+noOfDays + " Days");
		System.out.println("------------------|----------|--------------------------------");
		for (int i=0;i<items.length;i++) {
			System.out.println(items[i].getDescription() +" |  "+ items[i].getDailyRate()+" |  "+items[i].getPrice(noOfDays));
		}
		System.out.println("-----------------------------------------------------");
	}

}
