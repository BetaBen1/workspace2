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
	
	public void loadFromFile(String file){
		String text[] = NebulousIO.getFileAsString(file).split(",");
		for(int i = 0; i < text.length; i += 4){
			if(text[i].equals("S")){
				songs.add(new Song(text[i + 1], Double.parseDouble(text[i + 2]), Double.parseDouble(text[i + 3])));
				System.out.println("Added Song: " + text[i + 1] + ", " + text[i + 2] + ", " + text[i + 3]);
			} else if(text[i].equals("B")){
				books.add(new Book(text[i + 1], Double.parseDouble(text[i + 2]), Double.parseDouble(text[i + 3])));
				System.out.println("Added Book: " + text[i + 1] + ", " + text[i + 2] + ", " + text[i + 3]);
			} else if(text[i].equals("M")){
				movies.add(new Movie(text[i + 1], Double.parseDouble(text[i + 2]), Double.parseDouble(text[i + 3])));
				System.out.println("Added Movie: " + text[i + 1] + ", " + text[i + 2] + ", " + text[i + 3]);
			} else { System.out.println("ERROR: Could not read line from file"); }
		} System.out.println("\n");
 	}
	
	public void saveToFile(String file){
		String totalString = "";
		for(Song song : songs) totalString += "S" + "," + song.getName() + "," + song.getRating() + "," + song.getPrice() + "," + "\n";
		for(Book book : books) totalString += "B" + "," + book.getName() + "," + book.getRating() + "," + book.getPrice() + "," + "\n";
		for(Movie movie : movies) totalString += "M" + "," + movie.getName() + "," + movie.getRating() + "," + movie.getPrice() + "," + "\n";
		NebulousIO.saveStringToFile(totalString, file);
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
