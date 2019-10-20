package data;

public class ActiveBuses {
	boolean is_active;

	public boolean getIsActive() {
		return is_active;
	}

	@Override
	public String toString() {
		return Boolean.toString(is_active);
	}
}
