package com.unicornsrock.MovieHandler;

public class MovieLister {
	// I need the dataconnector here to be able to talk to the backend for requesting all of the data
	private DataConnector dataconnector = new DataConnector(); 
	
	public Movie getMovie(long uid){
		// TODO: retrieve the movie and translate it to a movie object , then return it. For now, simply returning an empty object
		return new Movie("Some movie title"); 
	}
	
	public Movie[] listAll(){
		// return all of the movies available. Might need a paging system somewhere once the data becomes too much. For now, simply returning an empty array.
		return new Movie[1];
	}

	public Movie[] ListFiltered(String query){
		// return all of the movies that match the provided query. Might need a paging system somewhere once the data becomes too much. For now, simply returning an empty array.
		return new Movie[1];
	}
	

}
