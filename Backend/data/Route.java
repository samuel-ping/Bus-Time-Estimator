package data;

public class Route {
	int route_id;
	boolean is_active;
	String long_name;
	
	@Override
	public String toString() {
		return "Route = " + route_id + "\nIs Active = " + is_active + "\nRoute Name = " + long_name;
	}
	
	@Override
	public int hashCode() {
		return Integer.toString(route_id).hashCode();
	}
}
