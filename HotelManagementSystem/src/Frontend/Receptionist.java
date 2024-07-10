package Frontend;
import java.util.*;

public class Receptionist {
	static int checkRoomAvailability() {
		System.out.println("_______*** Check the Room Availability ***_______");
		
		int roomSize=0,roomType=0,rechoose=0,roomAvailability=0;
		Scanner sc=new Scanner(System.in);
		
		do {
			rechoose=0;
			System.out.println("Select the room size:\n"
					+ "1. Single Room\n"
					+ "2. Double Room\n"
					+ "3. Triple Room\n"
					+ "4. Quad Room");
			roomSize=sc.nextInt();
			
			if(roomSize<1 || roomSize>4) {
				System.out.println("Wrong Choice, press 1 to rechoose or press any other key to exit");
				rechoose = sc.nextInt();
				
				if(rechoose !=1)
					return 0;
			}
		}while(rechoose == 1);
		
		do {
			rechoose=0;
			System.out.println("Select the room type:\n"
					+ "1. AC Room\n"
					+ "2. Non-AC Room");
			roomType=sc.nextInt();
			
			if(roomType<1 || roomType>2) {
				System.out.println("Wrong Choice, press 1 to rechoose or press any other key to exit");
				rechoose = sc.nextInt();
				
				if(rechoose != 1)
					return 0;
			}
		}while(rechoose == 1);

//		roomAvailability=checkAvailability(roomSize,roomType);
		
		if(roomAvailability==1)
			System.out.println("Room is Available");
		else
			System.out.println("Room is UnAvailable");
		
		System.out.println("You opted "+roomSize+" and room type is "+roomType);
		
		return 1;
	}
	static int checkout() {
		System.out.println("_______*** Checkout the Customer ***_______");
		
		int roomNo=0,rechoose=0;
		String customerData="";
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Enter the room number to be checked out:");
			roomNo=sc.nextInt();
			
//			customerData=fetchCustomerData(roomNo);
			
			System.out.println("Press 1 to checkout the customer, press 2 to re-enter the room number or press anyother key");
			rechoose=sc.nextInt();
			
			if(rechoose==1) {
//				deleteCustomerData(roomNo);
				return 1;
			}
		}while(rechoose==2);
		
			
		return 0;

		
	}
	public static void main() {
		Scanner sc = new Scanner(System.in);
		int choice=0,rechoose=0;
		
		System.out.println("_______*** Welcome To Receptionist Login ***_______");
		
		do {
			System.out.println("Opt the task you want to do:\n"
					+"1. Check Room Availability\n"
					+"2. Checkout the Customer");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: checkRoomAvailability();break;
			case 2: checkout();break;
			default: System.out.println("Wrong Choice");
			}
			
			System.out.println("#####\nEnter 1 to rechoose or press any other key");
			rechoose = sc.nextInt();
		}while(rechoose==1);
		
		
	}

}
