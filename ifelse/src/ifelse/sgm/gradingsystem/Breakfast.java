package ifelse.sgm.gradingsystem;

import java.util.Scanner;

public class Breakfast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "sunday";
		
		if (day == "sunday")
		{
		System.out.println("pohe");
		}
		else if (day == "monday")
		{
			System.out.println("upama");
		}
		else if (day == "tuesday")
		{
			System.out.println("shira");
		}
		else if(day == "wednesday")
		{
			System.out.println("tea");
		}
		else if(day == "thursday")
		{
			System.out.println("milk");
		}
		else if(day == "friday")
		{
			System.out.println("toast");
		}
		else if (day == "saturday")
		{
			System.out.println("Biscuit");
		}
		else
		{
			System.out.println("Nothing to eat");
		}
	}

}
