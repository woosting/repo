package com.unicornsrock.MovieHandler;
// This class is currently nothing more than a stub for the UI layer that our application will need
// There hasn't been any thought in how we are going to create the user interfacing, so for now we'll 
// just use it as a way to test our MovieHandler. 
public class MainClass {

	public static void main(String[] args) {
		executeTC1();
	}

	public static void executeTC1(){
		// Create a MovieHandler
		MovieHandler testHandler = new MovieHandler();
		
		// Create a movie 
		Movie testMovie = testHandler.createMovie("Example movie title");
		
		// Add some stuff to it 
		testMovie.setUID(2);
		testMovie.setComment("HERKEDERK");
		testMovie.setYear(1337);
		testMovie.addGenre("Awesomeness");
		
		// Add the movie to the database
		testHandler.dataPersister.addMovie(testMovie);
		
		// Change something
		testMovie.setComment("What I meant to say was actually HERKEFLERKEDERK"); 
		
		// Update the database
		testHandler.dataPersister.updateMovie(testMovie);
		
		// Get the movie from the database
		Movie testMovie2 = testHandler.movieLister.getMovie(testMovie.getUID());
		
		// And delete it 
		testHandler.dataPersister.deleteMovie(testMovie2); 
				
	}
}
