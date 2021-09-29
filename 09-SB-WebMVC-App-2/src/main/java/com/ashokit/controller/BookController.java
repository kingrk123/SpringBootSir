package com.ashokit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ashokit.model.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public String getBookData(Model model) {
		System.out.println(model.getClass().getName());
		Book b = new Book();
		b.setBookId(101);
		b.setBookName("Spring Boot");
		b.setBookPrice(450.00);
		model.addAttribute("book", b);
		return "bookDetails";
	}

	@GetMapping("/address")
	public ModelAndView getBookStoreAddres() {
		ModelAndView mav = new ModelAndView();
		String address = "H-No : 7-142, Beside Sonabhai Template, Ameerpet";
		mav.addObject("addr", address);
		mav.setViewName("address");
		return mav;
	}

	@GetMapping("/address-data")
	public String getBookStoreAddres(Map<String, String> map) {
		System.out.println(map.getClass().getName());
		map.put("addr", "Ameerpet");
		return "addressData";
	}

}
