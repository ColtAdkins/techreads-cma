package com.manifestcorp.techreadsCMA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import com.manifestcorp.techreadsCMA.model.Book;
import com.manifestcorp.techreadsCMA.repository.BookRepository;

@Component
public class BootStrap implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	protected BookRepository bookRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if(bookRepository.count() < 3) {
			bookRepository.save(new Book("Beginning Groovy and Grails", "Christopher M. Judd, Joseph Faisal Nusairat, James Shingler, Graeme Rocher", "5", "Completed", "img", LocalDateTime.now()));
			bookRepository.save(new Book("Pro Eclipse JST", "Christopher M. Judd, Hakeem Shittu", "5", "Completed", "img", LocalDateTime.now()));
			bookRepository.save(new Book("Enterprise Java Development on a Budget", "Christopher M. Judd, Brian Sam-Bodden", "5", "Completed", "img", LocalDateTime.now()));
		}
	}
	public String getBookRepoStatus(String Status) {
		return Status;
	}
}
