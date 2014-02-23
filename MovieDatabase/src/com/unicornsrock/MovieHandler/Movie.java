package com.unicornsrock.MovieHandler;
import java.util.Date;

// This is the Movie data structure, it actually holds little to no logic except for the setters and 
// getters which are part of the data structure here
public class Movie {
	
	// This is the movie data that is also available externally
	public enum			ValidStatusses {BORROWED_FROM, BORROWED_TO, AVAILABLE, BROKEN}
	
	private long 		UID = -1; 
	private String		dataStorageType;
	private String 		location;
	private String 		title;
	private int 		year;
	private String[] 	genre;
	private int 		rating;
	private String		coverFront;
	private String		coverBack;
	private ValidStatusses status;
	private String 		comment; 

	
	// These are the validation lists which can by dynamically altered if needed, but are used 
	// When trying to set any of the related variables in this object. 
	private String[]	validStorageTypes;
	private String[]	validLocations;
	private String[]	validGenres;

	
	
	// ********************************************************
	// ****************** CONSTRUCTORS ************************
	// ********************************************************
	
	public Movie(String title, String[] validStorageTypes,String[] validLocations, String[] validGenres){
		// Constructor. Adviced to be used where possible. 
		// Should set all of the valid arrays to the arrays entered
		this.title = title;
		this.validStorageTypes = validStorageTypes;
		this.validLocations = validLocations;
		this.validGenres = validGenres;
	}
	
	public Movie(String movieName){
		// Constructor. Only use when you have nothing better
		// Fill the valid arrays with some useful defaults 
		
		//TODO: Write code
	}	
	
	// ********************************************************
	// *************** ALL OF THE SETTERS *********************
	// ********************************************************
	public void setValidStorageTypes(String[] validStorageTypes){
		// Set the valid storage types, this enables us to dynamically alter valid entries
		this.validStorageTypes = validStorageTypes; 
	}

	public void setValidLocations(String[] validLocations){
		// Set the valid locations, this enables us to dynamically alter valid entries
		this.validLocations = validLocations; 
	}

	public void setValidGenres(String[] validGenres){
		// Set the valid locations, this enables us to dynamically alter valid entries
		this.validGenres = validGenres; 
	}
	
	
	public void setUID(long UID){
		this.UID = UID; 
	}
		
	public void setDataStorageType(String dataStorageType){
		// TODO: validate entry to valid storage types. Ignore and fix casing differences. 
		this.dataStorageType = dataStorageType; 
	}	
	
	public void setLocation(String location){
		// TODO: validate entry to valid locations. Ignore and fix casing differences. 
		this.location = location; 
	}		
	
	public void setTitle(String title){
		this.title = title; 
	}			
	
	public void setYear(int year){
		this.year = year; 
	}			
		
	public void addGenre(String genre){
		// TODO: validate entry to valid genres. Ignore and fix casing differences. 
		// TODO: implement support of multiple genres
		this.genre = new String[] {genre};
	}			

	public void deleteGenre(String genre){
		// TODO: validate entry to valid genres. Ignore and fix casing differences. 
		// TODO: implement support of multiple genres
		this.genre = new String[0]; 
	}	
	
	public void setRating(int rating){
		this.rating = rating;
	}		
	
	public void setCoverFront(String coverFront){
		this.coverFront = coverFront;
	}		

	public void setCoverBack(String coverBack){
		this.coverBack = coverBack;
	}	
	
	public void setStatus(ValidStatusses status){
		this.status = status;
	}	

	public void setComment(String comment){
		this.comment = comment;
	}	

	
	// ********************************************************
	// *************** ALL OF THE GETTERS *********************
	// ********************************************************
	public long getUID(){
		return this.UID; 
	}
		
	public String getDataStorageType(){
		// TODO: validate entry to valid storage types. Ignore and fix casing differences. 
		return this.dataStorageType; 
	}	
	
	public String getLocation(String location){
		// TODO: validate entry to valid locations. Ignore and fix casing differences. 
		return this.location = location; 
	}		
	
	public String getTitle(String title){
		return this.title = title; 
	}			
	
	public int getYear(int year){
		return this.year = year; 
	}			
		
	public String[] getGenre(){
		// TODO: validate entry to valid genres. Ignore and fix casing differences. 
		// TODO: implement support of multiple genres
		return this.genre;
	}			

	
	public int getRating(){
		return this.rating;
	}		
	
	public String getCoverFront(){
		return this.coverFront;
	}		

	public String getCoverBack(){
		return this.coverBack;
	}	
	
	public ValidStatusses getStatus(){
		return this.status;
	}	

	public String getComment(){
		return this.comment;
	}	
	
}



















