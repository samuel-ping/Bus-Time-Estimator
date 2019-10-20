package data;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Map;

import com.google.gson.Gson;

import data.RouteID;

public class DataArrays {
	Map<Integer, String> routeMap;
	int[] routeIDs;
	boolean[] activeBuses;
	String[] longNames;

	public int[] getRouteIDArray() {
		final String RUTGERS_AGENCY_ID = "1323";
		final String ROUTES = "routes";
		URL url;
		try {
			url = new URL("https://transloc-api-1-2.p.rapidapi.com/routes.json?agencies=1323");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-RapidAPI-Host", "transloc-api-1-2.p.rapidapi.com");
			con.setRequestProperty("X-RapidAPI-Key", "9ea1213158msh1664b928d1a0d2cp1992d0jsna4d2e372eae4"); // add your
																											// key here,
																											// unique
																											// for
																											// everybody

			int status = con.getResponseCode(); // if 200 is returned then its all good
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
//			System.out.println(content);
			Gson gson = new Gson();
			String temp = content.substring(content.indexOf("data"));
			temp = temp.substring(temp.indexOf('['), temp.lastIndexOf(']') + 1);
			RouteID[] routes = gson.fromJson(temp, RouteID[].class);
			routeIDs = new int[routes.length];
			for (int i = 0; i < routes.length; i++) {
				routeIDs[i] = routes[i].getRouteID();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return routeIDs;
	}

	public boolean[] getActiveBusesArray() {
		final String RUTGERS_AGENCY_ID = "1323";
//		final String ROUTES = "routes";
//		final String STOPS = "stops";
//		final String ARRIVALS = "arrival-estimates";
		URL url;
		try {
			url = new URL("https://transloc-api-1-2.p.rapidapi.com/routes.json?agencies=1323");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-RapidAPI-Host", "transloc-api-1-2.p.rapidapi.com");
			con.setRequestProperty("X-RapidAPI-Key", "9ea1213158msh1664b928d1a0d2cp1992d0jsna4d2e372eae4"); // add your
																											// key here,
																											// unique
																											// for
																											// everybody

			int status = con.getResponseCode(); // if 200 is returned then its all good
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
//			System.out.println(content);
			Gson gson = new Gson();
			String temp = content.substring(content.indexOf("data"));
			temp = temp.substring(temp.indexOf('['), temp.lastIndexOf(']') + 1);
			ActiveBuses[] activeBusArray = gson.fromJson(temp, ActiveBuses[].class);
			activeBuses = new boolean[activeBusArray.length];
			for (int i = 0; i < activeBusArray.length; i++) {
				activeBuses[i] = activeBusArray[i].getIsActive();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return activeBuses;
	}

	public boolean[] getLongNames() {
		final String RUTGERS_AGENCY_ID = "1323";
//		final String ROUTES = "routes";
		final String STOPS = "stops";
//		final String ARRIVALS = "arrival-estimates";
		URL url;
		try {
			url = new URL("https://transloc-api-1-2.p.rapidapi.com/routes.json?agencies=1323");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-RapidAPI-Host", "transloc-api-1-2.p.rapidapi.com");
			con.setRequestProperty("X-RapidAPI-Key", "9ea1213158msh1664b928d1a0d2cp1992d0jsna4d2e372eae4"); // add your
																											// key here,
																											// unique
																											// for
																											// everybody

			int status = con.getResponseCode(); // if 200 is returned then its all good
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
//			System.out.println(content);
			Gson gson = new Gson();
			String temp = content.substring(content.indexOf("data"));
			temp = temp.substring(temp.indexOf('['), temp.lastIndexOf(']') + 1);
			LongNames[] longNameArray = gson.fromJson(temp, LongNames[].class);
			longNames = new String[longNameArray.length];
			for (int i = 0; i < longNameArray.length; i++) {
				longNames[i] = longNameArray[i].getLongName();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return activeBuses;
	}

}
