package data;

import java.util.ArrayList;
import java.util.List;

public class RouteID {
	int route_id;
//	boolean is_active;
//	String long_name;
	public int getRouteID() {
		return route_id;
	}
	@Override
	public String toString() {
		return Integer.toString(route_id);

//		return "Route = " + route_id + "\nIs Active = " + is_active + "\nRoute Name = " + long_name;
	}
	
	@Override
	public int hashCode() {
		return Integer.toString(route_id).hashCode();
	}
}
