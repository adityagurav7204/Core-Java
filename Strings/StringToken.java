package com.Strings;
import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTokenizer st = new StringTokenizer("i am java aspirant");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}
	}

}
