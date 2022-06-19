package study.dates;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import study.basics.maths.Calculator;

public class DateExample {

	public static void main(String[] args) {

		Date today = new Date();
		System.out.println(today);  //this will give normal date
		
		GregorianCalendar today2 = new GregorianCalendar();
		//System.out.println(today2);  //this will give lot of info about day
		
		int day = today2.get(Calendar.DAY_OF_MONTH);
		int month = today2.get(Calendar.MONTH) + 1;
		int year= today2.get(Calendar.YEAR);
		
		System.out.println(day+"-"+month+"-"+year);
		
		//when we want to get difference btn two specific dates then
		GregorianCalendar otherday = new GregorianCalendar(2022,6-1,30);
		
		long todaymillis = today2.getTimeInMillis();
		long othermillis = otherday.getTimeInMillis();
		
		long difference = othermillis - todaymillis;
		long days = (((difference/1000)/3600)/24);
		
		System.out.println("days = "+days);
		System.out.println("Week day of 30 june= "+otherday.get(Calendar.DAY_OF_WEEK));
		System.out.println(otherday.get(Calendar.WEEK_OF_MONTH));
		
		//we meet after 17 days from today --- what is the seventeenth day
		
		today2.add(Calendar.DAY_OF_MONTH, +17);
		day = today2.get(Calendar.DAY_OF_MONTH);
		month = today2.get(Calendar.MONTH) +1;
		year = today2.get(Calendar.YEAR);
		
		System.out.println(day +"-" +month+"-"+year);
		
	}

}
