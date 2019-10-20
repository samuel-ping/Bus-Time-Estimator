import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

import com.google.gson.Gson;

import data.RouteID;

public class BusCalculator {
	private ArrayList<Bus> busList;
	private String start;
	private String end;
	private int busIndex;
	private Bus LX;

	public BusCalculator(String s, String e) {
		start = s;
		end = e;
	}

	public String whichBus() {
		Bus temp;

		for (int i = 0; i < busList.size(); i++) {
			temp = busList.get(i);
			if (temp.contains(start) && temp.contains(end)) {
				busIndex = i;
				return busList.get(i).getName();
			}
		}

		return "";
	}

	public int timeTraveled() {
		int startIndex = busList.get(busIndex).getIndexof(start);
		int endIndex = busList.get(busIndex).getIndexof(end);
		int totalTime = 0;
		LinkedList<Stop> temp = busList.get(busIndex).getBusRoute();

		if (startIndex < endIndex) {
			for (int i = startIndex; i < endIndex; i++) {
				totalTime += temp.get(i).getTimeToNext();
			}

		} else {
			for (int i = startIndex; i < temp.size(); i++) {
				totalTime += temp.get(i).getTimeToNext();
			}

			for (int j = 0; j < endIndex; j++) {
				totalTime += temp.get(j).getTimeToNext();
			}
		}
		return totalTime;
	}

	public int numberOfStops() {
		int startIndex = busList.get(busIndex).getIndexof(start);
		int endIndex = busList.get(busIndex).getIndexof(end);
		int numStops = 0;
		LinkedList<Stop> temp = busList.get(busIndex).getBusRoute();

		if (startIndex < endIndex) {
			for (int i = 0; i < temp.size(); i++) {
				numStops++;
			}

		} else {
			for (int i = startIndex; i < temp.size(); i++) {
				numStops++;
			}

			for (int j = 0; j < endIndex; j++) {
				numStops++;
			}
		}
		return numStops;
	}
	
	public static void main(String[] gerg) {
		BusCalculator calc = new BusCalculator("this", "that");
	}
}