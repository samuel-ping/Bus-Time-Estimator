public class Stop {
	private String stopName;
	private int timeToNextStop;

	public Stop(String sN, int tTNS) {
		stopName = sN;
		timeToNextStop = tTNS;
	}
	
	public String getStopName() {
		return stopName;
	}
	
	public int getTimeToNextStop() {
		return timeToNextStop;
	}

}