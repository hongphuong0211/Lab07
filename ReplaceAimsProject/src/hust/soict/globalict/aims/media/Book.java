package hust.soict.globalict.aims.media;

import java.util.List;

public class Book extends Media implements Comparable{
	private List<String> authors;
	
	public Book(int id) {
		super(id);
	}
	
	public Book(int id, String title){
		super(id, title);
	}

	public Book(int id, String title, String category){
		super(id, title, category);
	}
	
	public Book(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	public Book(int id, String title, String category, float cost, List<String> authors) {
		super(id, title, category, cost);
		this.authors = authors;
	}
	

	public List<String> getAuthors() {
		return authors;
	}

	public void addAuthor(String authorName) {
		if(!authors.contains(authorName)) {
			authors.add(authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.remove(authorName);
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
