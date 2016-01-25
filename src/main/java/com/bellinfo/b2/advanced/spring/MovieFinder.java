package com.bellinfo.b2.advanced.spring;

import java.util.ArrayList;

public class MovieFinder {
	
	private static ArrayList<String> comdeyMovies = new ArrayList<>();
	private static ArrayList<String> actionMovies = new ArrayList<>();
	private static ArrayList<String> thrillerMovies = new ArrayList<>();
	
	MovieFinder(){
		loadMovies();
	}
	
	
	
	public ArrayList<String> moviesByGenre(String userPreference){
		if(userPreference.equalsIgnoreCase("thriller")){
			return thrillerMovies;
		} else if(userPreference.equalsIgnoreCase("action")){
			return actionMovies;
		} else if(userPreference.equalsIgnoreCase("thriller")){
			return comdeyMovies;
		}
		return null;
		
		
	}
	
	private void loadMovies(){
		comdeyMovies.add("American Pie");
		comdeyMovies.add("Fly Paper");
		
		actionMovies.add("gladiator");
		actionMovies.add("taken");
		
		thrillerMovies.add("prision break");
		thrillerMovies.add("breaking bad");
		
	}
	
}
