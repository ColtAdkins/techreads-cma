package com.manifestcorp.techreadsCMA.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.manifestcorp.techreadsCMA.model.Book;
import com.manifestcorp.techreadsCMA.repository.BookRepository;
	@Controller
	@RequestMapping("/books")
	public class BookController {
		@Autowired
		BookRepository bookRepository;
		
		@RequestMapping({"", "/"})
		public ModelAndView books() {
			ModelAndView mav = new ModelAndView("books");
			List<Book> books = bookRepository.findAll();
			mav.addObject("books", books);
			return mav;
		}
		@RequestMapping("/add")
		public String add(Model model) {
			model.addAttribute("bookForm", new Book());
			return "add";
		}
		@RequestMapping(value = {"", "/"}, method=POST)
		public RedirectView addBook(Book book) {
			bookRepository.saveAndFlush(book);
			return new RedirectView("books");
		}
		@RequestMapping(value = {"/delete/{id}"}, method=GET)
		public String deleteBook(@PathVariable Long id) {
		bookRepository.deleteById(id);
		return "redirect:/books";
		}
		@RequestMapping(value = {"/update/{id}"})
		public String editBook(Model model, @PathVariable Long id)
		{
			Optional o = bookRepository.findById(id);
			Book book = (Book)o.get();
			model.addAttribute("editForm", book);
			return "update";
		}
		@RequestMapping(value = {"/update"}, method=POST)
		public RedirectView updateBook(Book book) {
			bookRepository.save(book);
			return new RedirectView("books");
		}
}