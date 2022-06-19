package study.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class BirthdayList {

	private ArrayList<String> guests;
	

	public BirthdayList(ArrayList<String> guests)
	{
		this.guests = guests;
	}
	
	public int howManyPeople(ArrayList<String> peoples)
	{
		return peoples.size();
	}

	public void addNames(String name)
	{
		guests.add(name);
	}

	public void addMultipleNames(String name)
	{
		guests.add(name);
	}
	
	public void removeName(String name)
	{
		if(guests.size() == 0)
		{
			try {
				throw new NoGuestException();
			} catch (NoGuestException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
		guests.remove(name);
		}
	}

	public void showGuestList() throws NoGuestException
	{
		if(guests.size() == 0)
		{
			throw new NoGuestException();
		}
		else
		{
		Iterator<String> iter = guests.iterator();

		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		}
	}

	public void clearList()
	{
		guests.clear();
	}

	public boolean isTheNameInTheList(String name)
	{
		return guests.contains(name);
	}

	public int totalGuests()
	{
		return guests.size();
	}


}
