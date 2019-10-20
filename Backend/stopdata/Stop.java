package stopdata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stop {
//	int stop_id;
//	boolean is_active;
	String[] routes;
	String name;
	
	public String[] getRoutes() {
		// TODO Auto-generated method stub
		return routes;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return " ROUTES" + Arrays.toString(routes) + " NAME" + name + " ";

//		return "Route = " + route_id + "\nIs Active = " + is_active + "\nRoute Name = " + long_name;
	}
	
	    
//	@Override
//	public int hashCode() {
//		return Integer.toString(stop_id).hashCode();
//	}
}
