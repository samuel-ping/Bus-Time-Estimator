package data;

import java.util.ArrayList;
import java.util.List;

public class RouteID {
	int route_id;

	public int getRouteID() {
		return route_id;
	}

	@Override
	public String toString() {
		return Integer.toString(route_id);

	}

	@Override
	public int hashCode() {
		return Integer.toString(route_id).hashCode();
	}
}
