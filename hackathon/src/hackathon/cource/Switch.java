package hackathon.cource;

import java.util.Scanner;

public class Switch {
	
	
	
	public static int OperationChoices(int c,int a, int b,int n)
	{
	   
	    if(c==1)
	    {
	    	return a+b;
	    }
	    if(c==2)
	    {
	    	return a-b;
	    }
	    if(c==3)
	    {
	    	return a*b;
	    }
	    if(c==4)
	    {
	    	return a/b;
	    }
		return n;
	}  
	
	  public static void main(String[] args) {
		System.out.println(Switch.OperationChoices(3,12,16,3));

				
	  }
			   
}