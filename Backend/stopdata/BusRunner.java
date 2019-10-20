package stopdata;

import java.util.Scanner;

public class BusRunner {
	public static void main(String[] yeet) {
		Scanner in = new Scanner(System.in);
		
		String start; String end;
		
		System.out.print("Enter your starting stop: ");
		start = in.nextLine();
		
		System.out.print("Enter your destination stop: ");
		end = in.nextLine();
		
		BusName bus = new BusName(start, end);
		System.out.println(bus.findName());
	}
}
