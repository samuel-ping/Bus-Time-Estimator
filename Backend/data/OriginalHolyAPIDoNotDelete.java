package data;

public class OriginalHolyAPIDoNotDelete {
	/*
	 * CAMPUS_COORDINATES = { "nb": "40.500820,-74.447398|3500.0", "nk":
	 * "40.741050,-74.173206|1000.0", "cm": "39.948508,-75.122122|1000.0", "li":
	 * "40.524199,-74.435495|800.0", "bu": "40.521196,-74.462281|800.0", "cd":
	 * "40.521196,-74.462281|1500.0", "ca": "40.500823,-74.447407|1000.0" }
	 */
	
	
//	final String RUTGERS_AGENCY_ID = "1323";
//	final String ROUTES = "routes";
//	final String STOPS = "stops";
//	final String ARRIVALS = "arrival-estimates";
//	URL url;
//	try {
//		url = new URL("https://transloc-api-1-2.p.rapidapi.com/routes.json?agencies=1323");
//		HttpURLConnection con = (HttpURLConnection) url.openConnection();
//		con.setRequestMethod("GET");
//		con.setRequestProperty("X-RapidAPI-Host", "transloc-api-1-2.p.rapidapi.com");
//		con.setRequestProperty("X-RapidAPI-Key", "9ea1213158msh1664b928d1a0d2cp1992d0jsna4d2e372eae4"); // add your key here, unique for everybody
//
//		int status = con.getResponseCode();
//		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//		String inputLine;
//		StringBuffer content = new StringBuffer();
//		while ((inputLine = in.readLine()) != null) {
//			content.append(inputLine);
//		}
//		in.close();
//		System.out.println(content);
//		Gson gson = new Gson();
//		String temp = content.substring(content.indexOf("data"));
//		temp = temp.substring(temp.indexOf('['), temp.lastIndexOf(']') + 1);
//		Route[] routes = gson.fromJson(temp, Route[].class);
//		System.out.println(Arrays.toString(routes));
//		System.out.println("gesrgresgesre" + (routes[0]));
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
}
