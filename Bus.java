
public class Bus {
	protected Stop[] route;
	
	public Bus(Stop[] r) {
		route = r;
	}
	
	public Stop[] getRoute() {
		return route;
	}
	
	public int getTime(int index) {
		return route[index].getTimeToNextStop();
	}
	
	public boolean contains(String start, String end) {
		for(int i = 0; i < route.length; i++) {
			if(start.equals(route[i].getStopName()) || end.equals(route[i].getStopName())) {
				return true;
			}
		}
		
		return false;
	}
	
	public int getStartingIndex(String name) {
		int index = 0;
		for(int i = 0; i < route.length; i++) {
			if(name.equals(route[i].getStopName())) {
				return index;
			}
		}
		return index;
	}
}
