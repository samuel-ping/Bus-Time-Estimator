package stopdata;

import java.util.Scanner;


public class BusRunner {
	public static void main(String[] yeet) {
		Scanner in = new Scanner(System.in);
		
		String start; String end;
		
		System.out.print("Enter your starting stop: ");
		start = in.nextLine();
		
		
		
		BusName temp = new BusName();
//		BusName bus = new BusName(start, end);
		
//		System.out.println(bus.DoThoseStopsExist(start, end));
		
		while(!temp.DoesThisStopExist(start))
		{
			System.out.println("I'm Sorry! The Starting stop was not found. Please Try again :D");
			System.out.print("Enter your starting stop again: ");
			start = in.nextLine();
		}
		
		System.out.print("Enter your destination stop: ");
		end = in.nextLine();
		while(!temp.DoesThisStopExist(end))
		{
			System.out.println("I'm Sorry! The Ending stop was not found. Please Try again :D");
			System.out.print("Enter your destination stop again: ");
			end = in.nextLine();
		}
		
	
		
		BusName bus2 = new BusName(start, end);
		System.out.println(bus2.findName());
	}
}
