package stopdata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import data.HashMapRoute;

public class HashMapStopRoute {
	
	Map<String, String[]> stopIDMap;
	DataArrays one;
	
	public HashMapStopRoute() {
		stopIDMap = new HashMap<String, String[]>();
		one = new DataArrays();
		for (int i = 0; i < one.getNameArray().length; i++) {
			stopIDMap.put(one.getNameArray()[i], one.getRouteIDArray().get(i));
		}
	}
	
	public ArrayList<Integer> compare(String s, String e) {
		String[] start = stopIDMap.get(s);
		String[] end = stopIDMap.get(e);
//		System.out.println("start: " + Arrays.toString(start));
//		System.out.println("\nEnd: " + Arrays.toString(end));
		ArrayList<Integer> possibleRoutes = new ArrayList<Integer>();
		
		for(int i = 0; i< start.length; i++) {
			for(int j = 0; j < end.length; j++) {
				if(start[i].equals(end[j]))
					possibleRoutes.add(Integer.parseInt(start[i]));
			}
		}
		return possibleRoutes;
	}

	public String toString() {
		String output = "";
		Set<String> keyTable = stopIDMap.keySet();
		for (String k : keyTable) {
			output += "Name: " + k + "Route: " + Arrays.toString(stopIDMap.get(k)) + "\n";
		}
		return output;
	}

	public static void main(String[] benice) {
		HashMapStopRoute test = new HashMapStopRoute();
		System.out.println(test.toString());
		
		ArrayList<Integer> one = test.compare("Livingston Plaza", "Food Sciences Building");
		
		for (int arr : one) {
			System.out.println(arr);
		}
		
	}
	
	
}
