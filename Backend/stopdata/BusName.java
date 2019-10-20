package stopdata;

import java.util.ArrayList;

import data.HashMapRoute;

public class BusName {
	String start;
	String end;
	HashMapRoute busName = new HashMapRoute();
	HashMapStopRoute compare = new HashMapStopRoute();
	
	public BusName(String s, String e) {
		start = s;
		end = e;
	}
	
	public String findName() {
		ArrayList<Integer> routeID = compare.compare(start, end);
		
		for(int i = 0; i< routeID.size(); i++) {
			if(busName.getMap().containsKey(routeID))
				return busName.getMap().get(routeID.get(i));
		}
		
		return busName.getMap().get(routeID);
	}
	
	public static void main(String[] args) {
		BusName one = new BusName("Red Oak Lane", "Lipman Hall");
		System.out.println(one.findName());
	}
}
