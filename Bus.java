package BusStop;
import java.util.ArrayList;
import java.util.LinkedList;

public class Bus {
	
	public LinkedList<Stop> ChooseABus(String start, String finish, ArrayList<LinkedList<Stop>> Buses)
	{
		for(int i = 0; i < Buses.size(); i++)
		{
			LinkedList<Stop> temp = Buses.get(i);
			boolean bool1 = false;
			boolean bool2 = false;
			for (int j = 0; j < temp.size(); j++)
			{
				if(temp.get(j).getName().equals(start))
					bool1 = true;
				if(temp.get(j).getName().equals(finish))
					bool2 = true;
				
				if (bool1 && bool2)
				{
					return temp;
				}
					
			}
		}
		return null;
		
	}
	
	public Stop ConnectingStop (String start, String finish, ArrayList<LinkedList<Stop>> Buses)
	{
		Stop[] AllofThem = new Stop[9];

		for(int i = 0; i < AllofThem.length; i++)
		{
			if(ChooseABus(start, AllofThem[i].getName(), Buses) != null && ChooseABus(AllofThem[i].getName(), finish, Buses) != null)
				return AllofThem[i];
		}
		return AllofThem[1];
	}
	
	public int TimeNeeded(String start, String finish, LinkedList<Stop> b)
	{
		LinkedList<Stop> temp = b;
		int t = 0;
		boolean s = false;
		for(int i = 0; i < temp.size(); i++)
		{
			if(temp.get(i).getName().equals(start))
			{
				s = true;
			}
				
			if(temp.get(i).getName().equals(finish) && s)
			{
				return t;
			}
			
			if(s)
			{
				t += temp.get(i).getMin();
			}
		}
		for(int i = 0; i < temp.size(); i++)
		{
			if(temp.get(i).getName().equals(start))
			{
				s = true;
			}
				
			if(temp.get(i).getName().equals(finish) && s)
			{
				return t;
			}
			
			if(s)
			{
				t += temp.get(i).getMin();
			}
		}
		return t;
	}
}
