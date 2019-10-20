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
			con.setRequestProperty("X-RapidAPI-Key", ""); // add your
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
			con.setRequestProperty("X-RapidAPI-Key", ""); // add your
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

	public String[] getLongNames() {
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
			con.setRequestProperty("X-RapidAPI-Key", ""); // add your
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
		return longNames;
	}
	
	public static void main(String[] args) {
		DataArrays one = new DataArrays();
		System.out.println(Arrays.toString(one.getRouteIDArray()));
		System.out.println(one.getRouteIDArray().length);
		
		System.out.println(Arrays.toString(one.getLongNames()));
		System.out.println(one.getLongNames().length);
		
		System.out.println(Arrays.toString(one.getActiveBusesArray()));
		System.out.println(one.getActiveBusesArray().length);
	}

}
