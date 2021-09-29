package com.ashokit.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.domain.Book;

@RestController
public class BookResource {

	@GetMapping(
			value = "/book", 
			produces = { "application/json", "application/json" }
	)
	public Book getBookDtls() {
		// logic

		Book b = new Book();
		b.setBookId(101);
		b.setBookName("Spring");
		b.setBookPrice(450.00);
		b.setAuthorName("Johnson");

		return b;
	}
}
