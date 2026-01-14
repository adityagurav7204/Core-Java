package com.collectionn;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
	Set<String> movies = new HashSet<>(); 
	
	  movies.add("Sholey");
	  movies.add("Phool Aur Angare");
	  movies.add("Jeene nahi duunga");
	  movies.add("kasam bharat maa ki");
	  movies.add("kasam bharat maa ki"); //duplicates elements are not allowed
	 
	  System.out.println("Movies are: "+movies);
	  
	  System.out.println("Dhamal is there or not:  "+movies.contains("Mass"));
	  
	  for (String movie:movies)
	  {
		  System.out.println(movie);
	  }
	  movies.remove("Phool Aur Angare");
	  
	  System.out.println("Movies are: "+movies);
	}

}
