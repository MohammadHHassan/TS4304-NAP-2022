package day3_am;

import java.time.LocalDate;		// Import local date API/library

public class LearningLocalDate
{
	public static void main(String[] args)
	{
		LocalDate now = LocalDate.now();		// Declaration of local date now
		
		System.out.println(now);
		System.out.println("Year = " + now.getYear());
		System.out.println("Month = " + now.getMonth());
		System.out.println("Month Value = " + now.getMonthValue());
		System.out.println("Day of the month = " + now.getDayOfMonth());
		System.out.println("Day of the year = " + now.getDayOfYear());
		System.out.println("Day of the week = " + now.getDayOfWeek());
	}
}
