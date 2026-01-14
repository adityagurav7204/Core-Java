package com.ABC.Encaps;

import java.util.Calendar;

public class Break {

	public static void main(String[] args) {
		for(int day = 1; day<=30;day++) //Assuming a 30-day month
		{
			Calendar calendar = Calendar.getInstance();
			calendar.set(2025,Calendar.MARCH, day); // Setting year and month
			
			int dayOfweek = calendar.get(Calendar.DAY_OF_WEEK);
			
			if (dayOfweek == Calendar.SATURDAY || dayOfweek == Calendar.SUNDAY)
			{
				continue;
			}
			System.out.println("Marking attendance for day "+day);
			
		}
	}

}
