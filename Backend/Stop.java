public class Stop {
	private String nameOfstop;
	private int timeToNext;

	public Stop(String name, int time) {
		nameOfstop = name;
		timeToNext = time;
	}

	public String getNameOfstop() {
		return nameOfstop;
	}

	public void setNameOfstop(String nameOfstop) {
		this.nameOfstop = nameOfstop;
	}

	public int getTimeToNext() {
		return timeToNext;
	}

	public void setTimeTonext(int timeToNext) {
		this.timeToNext = timeToNext;
	}

}