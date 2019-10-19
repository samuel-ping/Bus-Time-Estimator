
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.google.gson.Gson;

import data.Route;

public class BusTester {
	public static void main(String[] args) {
//		ArrayList<LinkedList<Stop>> Buses = new ArrayList<LinkedList<Stop>>();
//		LinkedList RouteRexB = new LinkedList<Stop>();
//		RouteRexB.add(new Stop("Red Oak Lane", 2));
//		RouteRexB.add(new Stop("Lipman Hall", 2));
//		RouteRexB.add(new Stop("College Hall", 2));
//		RouteRexB.add(new Stop("Hill Center", 2));
//		RouteRexB.add(new Stop("Allison Road Classroom Building", 2));
//		RouteRexB.add(new Stop("Hill Center", 2));
//		RouteRexB.add(new Stop("Public Safety Building", 2));
//		Buses.add(RouteRexB);
//		
//		LinkedList RouteA = new LinkedList<Stop>();
//		RouteA.add(new Stop("College Avenue Student Center", 2));
//		RouteA.add(new Stop("Scott Hall", 2));
//		RouteA.add(new Stop("Student Activities Center", 2));
//		RouteA.add(new Stop("Visitor Center", 2));
//		RouteA.add(new Stop("Stadium West Lot", 2));
//		RouteA.add(new Stop("Werblin Recreation Center (Rear)", 2));
//		RouteA.add(new Stop("Hill Center", 2));
//		RouteA.add(new Stop("Science Buildings", 2));
//		RouteA.add(new Stop("Library of Science and Medicine", 2));
//		RouteA.add(new Stop("Busch Suites", 2));
//		RouteA.add(new Stop("Busch Student Center", 2));
//		RouteA.add(new Stop("Buell Apartments", 2));
//		RouteA.add(new Stop("Werblin Recreation Center (Front)", 2));
//		Buses.add(RouteA);
//		
//		
//		
//		
//		String start = "Public Safety Building";
//		String finish = "Hill Center";
//		
//		
//		Bus user = new Bus();
//		LinkedList<Stop> ChosenBus;
//		ChosenBus = user.ChooseABus(start, finish, Buses);
//		int f = user.TimeNeeded(start, finish, ChosenBus);
//		System.out.println("Bus: " + ChosenBus + "Time : " + f);
		/*
		 * CAMPUS_COORDINATES = { "nb": "40.500820,-74.447398|3500.0", "nk":
		 * "40.741050,-74.173206|1000.0", "cm": "39.948508,-75.122122|1000.0", "li":
		 * "40.524199,-74.435495|800.0", "bu": "40.521196,-74.462281|800.0", "cd":
		 * "40.521196,-74.462281|1500.0", "ca": "40.500823,-74.447407|1000.0" }
		 */
		final String RUTGERS_AGENCY_ID = "1323";
		final String ROUTES = "routes";
		final String STOPS = "stops";
		final String ARRIVALS = "arrival-estimates";
		URL url;
		try {
			url = new URL("https://transloc-api-1-2.p.rapidapi.com/stops.json?agencies=1323");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-RapidAPI-Host", "transloc-api-1-2.p.rapidapi.com");
			con.setRequestProperty("X-RapidAPI-Key", ""); // add your key here, unique for everybody

			int status = con.getResponseCode();
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
			System.out.println(content);
			Gson gson = new Gson();
			String temp = content.substring(content.indexOf("data"));
			temp = temp.substring(temp.indexOf('['), temp.lastIndexOf(']') + 1);
			Route[] routes = gson.fromJson(temp, Route[].class);
			System.out.println(Arrays.toString(routes));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
