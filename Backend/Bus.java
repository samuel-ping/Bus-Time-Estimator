import java.util.LinkedList;
import java.util.ListIterator;

public class Bus {
	private String name;
	private LinkedList<Stop> busRoute = new LinkedList<Stop>();

	public Bus(String n, LinkedList<Stop> b) {
		name = n;
		busRoute = b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LinkedList<Stop> getBusRoute() {
		return busRoute;
	}

	public void setBus(LinkedList<Stop> bus) {
		this.busRoute = bus;
	}

	public int getIndexof(String nameOfStop) {
		ListIterator iter = busRoute.listIterator();
		Stop current;
		int index = 0;

		while (iter.hasNext()) {
			current = (Stop) iter.next();
			if (current.getNameOfstop().equals(nameOfStop)) {
				return index;
			}
			index++;

		}
		return -1;
	}

	public boolean contains(String nameOfstop) {
		ListIterator iter = busRoute.listIterator();
		Stop current;

		while (iter.hasNext()) {
			current = (Stop) iter.next();

			if (current.getNameOfstop().equals(nameOfstop)) {
				return true;
			}
		}

		return false;
	}

	public String toString() {
		String s = "";
		for (Stop x : busRoute) {
			s += x.getNameOfstop() + ": " + x.getTimeToNext();
		}
		return s;
	}
}
