package org.jay.samples.mustache.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Jay
 *
 */
public class Book {
	
	private String name;
	
	private List<Author> authors = new ArrayList<>();
	
	public Book(String name, List<Author> authors) {
		this.name = name;
		this.authors.addAll(authors);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
	

}
