package stopdata;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import com.google.gson.Gson;

import data.RouteID;

public class DataArrays {
	ArrayList<String[]> routeIDs;
	String[] names;

	public ArrayList<String[]> getRouteIDArray() {
		routeIDs = new ArrayList<String[]>();
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
			con.setRequestProperty("X-RapidAPI-Key", "9ea1213158msh1664b928d1a0d2cp1992d0jsna4d2e372eae4"); // add your
																											// key here,
																											// unique
																											// for
																											// everybody

			int status = con.getResponseCode();
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
//				System.out.println(content);
			Gson gson = new Gson();
			String temp = content.substring(content.indexOf("data"));
			temp = temp.substring(temp.indexOf('['), temp.lastIndexOf(']') + 1);
			Stop[] routes = gson.fromJson(temp, Stop[].class);
//			routeIDs = new String[routes.length][routes.length];
			for (int i = 0; i < routes.length; i++) {
				routeIDs.add(routes[i].getRoutes());
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return routeIDs;
	}

	public String[] getNameArray() {
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
			con.setRequestProperty("X-RapidAPI-Key", "9ea1213158msh1664b928d1a0d2cp1992d0jsna4d2e372eae4"); // add your
																											// key here,
																											// unique
																											// for
																											// everybody

			int status = con.getResponseCode();
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
//				System.out.println(content);
			Gson gson = new Gson();
			String temp = content.substring(content.indexOf("data"));
			temp = temp.substring(temp.indexOf('['), temp.lastIndexOf(']') + 1);
			Stop[] routes = gson.fromJson(temp, Stop[].class);
			names = new String[routes.length];
			for (int i = 0; i < routes.length; i++) {
				names[i] = routes[i].getName();
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return names;

	}

	public static void main(String[] args) {
		DataArrays one = new DataArrays();
		ArrayList<String[]> x = one.getRouteIDArray();
		for (String[] arr : x) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(one.getRouteIDArray().size());

		System.out.println(Arrays.toString(one.getNameArray()));
		System.out.println(one.getNameArray().length);
	}
}
