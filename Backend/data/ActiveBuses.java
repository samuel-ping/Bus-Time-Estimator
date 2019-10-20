package data;

public class ActiveBuses {
//		int route_id;
		boolean is_active;
//		String long_name;
		public boolean getIsActive() {
			return is_active;
		}
		@Override
		public String toString() {
			return Boolean.toString(is_active);

//			return "Route = " + route_id + "\nIs Active = " + is_active + "\nRoute Name = " + long_name;
		}
//		
//		@Override
//		public int hashCode() {
//			return Integer.toString(route_id).hashCode();
//		}
	}

}
