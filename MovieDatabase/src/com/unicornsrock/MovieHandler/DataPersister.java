package com.unicornsrock.MovieHandler;

public class DataPersister {
	// I need the data connector here to be able to talk to the back-end for requesting all of the data
	private DataConnector dataconnector = new DataConnector(); 
	
	
	public boolean addMovie(Movie movieToAdd){
		// TODO persist the movie to the underlying database system. For now, simply returning true (successfully executed)
		return true;
	}

	public boolean updateMovie(Movie movieToUpdate){
		// TODO persist the movie to the underlying database system. For now, simply returning true (successfully executed)
		return true;
	}

	public boolean deleteMovie(Movie movieToDelete){
		// TODO persist the movie to the underlying database system. For now, simply returning true (successfully executed)
		return true;
	}
	
}
