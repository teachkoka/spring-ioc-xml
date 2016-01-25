package com.bellinfo.b2.advanced.spring;

import java.util.ArrayList;
import com.bellinfo.b2.advanced.spring.MovieFinder;

public class SimpleMovieFinder {
	
	private MovieFinder movieFinder;
	
	public void setMovieFinder(MovieFinder movieFinder){
		this.movieFinder= movieFinder;
	}
	
	public ArrayList<String> movieList(String userPreference){
		//MovieFinder movieFinder = new MovieFinder();
		return movieFinder.moviesByGenre(userPreference);
		
		
		
	}

}
