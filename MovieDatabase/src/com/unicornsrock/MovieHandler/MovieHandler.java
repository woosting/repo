package com.unicornsrock.MovieHandler;
// This is the top level class which should contain all of the methods / interfaces and whatnot needed
// to manage all of the movies. It actually contains very little, because we split up all of the features
// Into classes which each handle their own part of the code


// Coding conventions: http://www.oracle.com/technetwork/java/javase/documentation/codeconvtoc-136057.html

public class MovieHandler {
	
	// The classes are all public because there is little point in making getters/setters for them in my view
	// and it does prevent "ugly" code like myMovieHandler.MovieLister().ListAll() and replaces it with 
	// myMovieHandler.MovieLister.ListAll()
	
	public MovieLister movieLister = new MovieLister(); 
	public DataPersister dataPersister = new DataPersister(); 
	public Exporter exporter = new Exporter();   
			
	public MovieHandler(){
		//Constructor
	}
	
	public Movie createMovie(String name){
		// Simply create and return the movie object, it should be capable of handling 
		// itself outside of this scope.
		return new Movie(name); 
	}
	
}
