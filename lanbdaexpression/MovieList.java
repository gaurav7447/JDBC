
package com.lanbdaexpression;

import java.util.ArrayList;

import java.util.Collections;

public class MovieList {

	public static void main(String[] args) {
		
		
		 
		Movies mov1=new Movies("Animal",2018,9.1,"Lord Bobby ");
		Movies mov2=new Movies("Kabir Singh",2018,8.3,"Shahid Kapoor ");
		Movies mov3=new Movies("Avangers",2018,8.0," Robert. D. Jr");
		Movies mov4=new Movies("KGF",2018,9.1," Rocking star Yash");
		Movies mov5=new Movies("geetagoindam",2022,8.6,"Vijay Deverkonda ");
		
		
		ArrayList<Movies> movies =new ArrayList<Movies>();
		movies.add(mov1);
		movies.add(mov2);
		movies.add(mov3);
		movies.add(mov4);
		movies.add(mov5);
		
		
		//below is for each loop
//		for(String m:movies) {
//			System.out.println(m);
//		}
		
		//to sort the given data we use Collections.sort
		// below is for Class MovieList
		// Collections.sort(movies);
		
		
		//below is for class Movies
		Collections.sort(movies,(movie1,movie2)->{
			if(movie1.yor>movie2.yor) {
				return 1;
			}
			else if(movie1.yor<movie2.yor) {
				return -1;
			}
			else {
				return 0;
			}
			
		});
		
		
		//below is for each remaining method
	//	movies.forEach((m)->System.out.println(m));
		
		
	    movies.forEach((m)->{System.out.println(m.name+" "+m.yor+" "+m.imdb+" "+m.actor);});
		
		
		

	}

}
