package BusStop;

import java.util.ArrayList;
import java.util.LinkedList;

public class BusTester {
	public static void main(String[] args)
	{
		ArrayList<LinkedList<Stop>> Buses = new ArrayList<LinkedList<Stop>>();
		LinkedList RouteRexB = new LinkedList<Stop>();
		RouteRexB.add(new Stop("Red Oak Lane", 2));
		RouteRexB.add(new Stop("Lipman Hall", 2));
		RouteRexB.add(new Stop("College Hall", 2));
		RouteRexB.add(new Stop("Hill Center", 2));
		RouteRexB.add(new Stop("Allison Road Classroom Building", 2));
		RouteRexB.add(new Stop("Hill Center", 2));
		RouteRexB.add(new Stop("Public Safety Building", 2));
		Buses.add(RouteRexB);
		
		LinkedList RouteA = new LinkedList<Stop>();
		RouteA.add(new Stop("College Avenue Student Center", 2));
		RouteA.add(new Stop("Scott Hall", 2));
		RouteA.add(new Stop("Student Activities Center", 2));
		RouteA.add(new Stop("Visitor Center", 2));
		RouteA.add(new Stop("Stadium West Lot", 2));
		RouteA.add(new Stop("Werblin Recreation Center (Rear)", 2));
		RouteA.add(new Stop("Hill Center", 2));
		RouteA.add(new Stop("Science Buildings", 2));
		RouteA.add(new Stop("Library of Science and Medicine", 2));
		RouteA.add(new Stop("Busch Suites", 2));
		RouteA.add(new Stop("Busch Student Center", 2));
		RouteA.add(new Stop("Buell Apartments", 2));
		RouteA.add(new Stop("Werblin Recreation Center (Front)", 2));
		Buses.add(RouteA);
		
		
		
		
		String start = "Public Safety Building";
		String finish = "Hill Center";
		
		
		Bus user = new Bus();
		LinkedList<Stop> ChosenBus;
		ChosenBus = user.ChooseABus(start, finish, Buses);
		int f = user.TimeNeeded(start, finish, ChosenBus);
		System.out.println("Bus: " + ChosenBus + "Time : " + f);
	}
}
