package org.jay.samples.mustache.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Jay
 *
 */
public class Shop {
	
	private String name;
	
	private List<Book> books = new ArrayList<>();
	
	public Shop(String name, List<Book> books) {
		this.name = name;
		this.books.addAll(books);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	

}
