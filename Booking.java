package rrs;

import java.util.Scanner;

public class Booking 

{
static ConferenceRoom cf = new ConferenceRoom();

public static void main(String[] args) { 

	
	//int userinput=0;
	
	cf.setName("Room1");
	cf.setRoomId(1);

	System.out.println("Welcome to Room Reservation System \n");
	System.out.println("Enter Your User id: \n");
	
	///check if the user is valid user if
	/// if user is Admin show him Add Conf option else just show option 1 & 2...
	
	String isExit ="No";
	
	System.out.println("Choose from the Options given below \n");
	System.out.println("1:List Avaliable Rooms \n");
	System.out.println("2:Book Avaliable Rooms \n");
	System.out.println("3:Add New Conf Room \n");
	System.out.println("4:Exit \n");
	System.out.println("Option : ");
	
	while (isExit=="No") {
	
		Scanner userinput = new Scanner(System.in);
		int i=userinput.nextInt();
			
		switch (i) {
			
	    case 1:  i = 1;
	    System.out.println("Option :1 List Avaliable Rooms selected \n");
	             break;
	    case 2:  i = 2;
	    System.out.println("Option :2 Book Avaliable Rooms selected\n");
	    			 break;
	    case 3:  i = 3;
	    System.out.println("Option :3 Add New Conference Room selected\n");
				 break;
	    case 4:  i = 4;
	    
	    System.out.println("Option :4 Exit ");
	    isExit="Yes";
		break;
				 
		
		} }
	

}}