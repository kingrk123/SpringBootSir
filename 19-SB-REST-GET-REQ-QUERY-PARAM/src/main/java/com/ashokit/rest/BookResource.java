package com.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.bindings.Book;

@RestController
public class BookResource {

	@GetMapping(
			value = "/book", 
			produces = { "application/json", "application/xml" }
	)
	public Book getBook(@RequestParam("bid") Integer bookId) {
		Book b = null;
		if (bookId == 101) {
			b = new Book(bookId, "Spring", 400.00, "Rod Johnson");
		} else if (bookId == 102) {
			b = new Book(bookId, "Hibernate", 300.00, "Gaven King");
		}else if(bookId == 103) {
			b = new Book(bookId, "Webservices", 350.00, "Richhard");
		}
		return b;
	}
	
	
	@GetMapping(value="/book-price")
	public String bookPrice(@RequestParam("book") String bookName, 
			@RequestParam("author") String authorName) {
		String msg = null;
		
		if("spring".equals(bookName) && "johnson".equals(authorName)) {
			msg = "Book Price Is :: 450.00 $";
		}else if("springboot".equals(bookName) && "johnson".equals(authorName)) {
			msg = "Book Price Is :: 550.00 $";
		}
		return msg;
	}
	
	
}
