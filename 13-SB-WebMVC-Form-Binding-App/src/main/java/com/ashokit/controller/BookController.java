package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.domain.Book;

@Controller
public class BookController {

	@GetMapping("/loadform")
	public String loadBookForm(Model model) {
		
		Book bobj = new Book();
		bobj.setBookName("Spring");
		
		model.addAttribute("book", bobj);
		
		return "addBook";
	}

	@PostMapping("/saveBook")
	public String saveBookData(Book book, Model model) {
		System.out.println(book);
		return "success";
	}

}
