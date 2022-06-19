package study.hasa;

import java.util.Collection;

public class MyDate implements Comparable<MyDate>{

	private int day;
	private int month;
	private int year;
	
	public MyDate()
	{
		
	}
	
	public MyDate(int dd, int mm, int yy)
	{
		this.day = dd;
		this.month = mm;
		this.year = yy;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if( obj instanceof MyDate)
		{
			MyDate tmp = (MyDate)obj;
			if(this.day == tmp.day && this.month == tmp.month && this.year == tmp.year)
			return true;
			else
				return false;
		}
		else
		return false;
		
	}
	
	@Override
	public String toString() {
		String s = day+"/"+month+"/"+year;
		return s;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(MyDate o) {
		
		if(this.getYear() > o.year) return 1;
		if(this.getYear() < o.year) return -1;
		else
		{
			if(this.getMonth() > o.year) return 1;
			if(this.getMonth() < o.year) return -1;
			else
			{
				if(this.getDay() > o.year) return 1;
				if(this.getDay() < o.year) return -1;
				else
					return 0;
			}
		}
	}

}
