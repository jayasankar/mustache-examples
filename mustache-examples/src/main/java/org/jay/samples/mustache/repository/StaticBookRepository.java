package org.jay.samples.mustache.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jay.samples.mustache.domain.Author;
import org.jay.samples.mustache.domain.Book;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Jay
 *
 */
@Repository
public class StaticBookRepository {
	
	public static Map<String, Author> authorRepo = new HashMap<>();
	
	static {
		authorRepo.put("1", new Author("Ayan Rand"));
		authorRepo.put("2", new Author("Martin Fowler"));
	}
	
	
	public List<Book> getBooks() {
		return Arrays.asList(createBook("Atlas Shrugged", getAuthors(Arrays.asList("1"))), createBook("Enterprise Integration Patterns", getAuthors(Arrays.asList("1"))));
	}
	
	private Book createBook(String bookName, List<Author> authors) {
		return new Book(bookName, authors);
	}
	
	private List<Author> getAuthors(List<String> authorKeys) {
		List<Author> authors = new ArrayList<>();
		for (String key : authorKeys) {
			authors.add(authorRepo.get(key));
		}
		return authors;
	}

}
