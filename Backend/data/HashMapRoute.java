package data;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapRoute {
	Map<Integer, String> routeIDMap;
	DataArrays array;
	int tempNum;
	String tempName;

	public HashMapRoute() {
		routeIDMap = new HashMap<Integer, String>();
		array = new DataArrays();
		for (int i = 0; i < array.getRouteIDArray().length; i++) {
			if (array.getActiveBusesArray()[i] == true) {
				routeIDMap.put(array.getRouteIDArray()[i], array.getLongNames()[i]);
			}
		}
	}
	
//	public boolean getisActive(int routeID) {
//		array = new DataArrays();
//		boolean[] x = array.getActiveBusesArray();
//		for(int i = 0; i<x.length; i++) {
//			if(x[i] == routeID)
//				
//		}
//	}
	
	public HashMap<Integer, String> getMap(){
//		System.out.println(routeIDMap.toString());
		return (HashMap<Integer, String>) routeIDMap;
	}

	public String toString() {
		String output = "";
		Set<Integer> keyTable = routeIDMap.keySet();
		for (int k : keyTable) {
			output += "Bus ID/Route: " + k + "/" + routeIDMap.get(k) + "\n";
		}
		return output;
	}
	
	public boolean contains(int in) {
		Set<Integer> keySet = routeIDMap.keySet();
		for(int j:keySet) {
			if(j == in) {
				return true;
			}
		}
		
		return false;
		
	}

	public static void main(String[] benice) {
		HashMapRoute test = new HashMapRoute();
		System.out.println(test.toString());
	}
}
