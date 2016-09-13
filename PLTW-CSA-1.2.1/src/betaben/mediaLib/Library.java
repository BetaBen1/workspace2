package betaben.mediaLib;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<Movie> movies;
	private ArrayList<Song> songs;
	private ArrayList<Book> books;
	
	public Library(){
		movies = new ArrayList<Movie>();
		songs = new ArrayList<Song>();
		books = new ArrayList<Book>();
	}
	
	public void addMovie(Movie movie){
		movies.add(movie);
	}
	
	public void addSong(Song song){
		songs.add(song);
	}
	
	public void removeMovie(Movie movie){
		movies.remove(movie);
	}
	
	public void addBook(Book book){
		books.add(book);
	}
	
	public void removeBook(Book book){
		books.remove(book);
	}
	
	public void removeSong(Song song){
		songs.remove(song);
	}

	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

}
