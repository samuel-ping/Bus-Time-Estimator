package BusStop;

public class Stop {
	int min;
	String name;
	
	public Stop(String s, int m)
	{
		min = m;
		name = s;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
