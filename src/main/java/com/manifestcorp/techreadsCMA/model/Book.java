package com.manifestcorp.techreadsCMA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.time.LocalDateTime;
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String title;
	String author;
	String ratingOfBook;
	String statusOfBook;
	String coverOfBook;
	LocalDateTime dateAdded;
	
	public Book() {}
	
	public Book(String title, String author, String ratingOfBook, String statusOfBook, String coverOfBook, LocalDateTime dateAdded) {
		this.title = title;
		this.author = author;
		this.ratingOfBook = ratingOfBook;
		this.statusOfBook = statusOfBook;
		this.coverOfBook = coverOfBook;
		this.dateAdded = LocalDateTime.now();
	}
	
	public Long getId() { return id; }
	public void setId(Long id) {this.id = id;}
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public String getRatingOfBook() { return ratingOfBook; }
	public void setRatingOfBook(String ratingOfBook) { this.ratingOfBook = ratingOfBook; }
	
	public String getAuthor() { return author; }
	public void setAuthor(String author) { this.author = author; }
	
	public String getStatusOfBook() { return statusOfBook; }
	public void setStatusOfBook(String statusOfBook) { this.statusOfBook = statusOfBook; }
	
	public String getCoverOfBook() { return coverOfBook; }
	public void setCoverOfBook(String coverOfBook) { this.coverOfBook = coverOfBook; }
	
	public LocalDateTime getDateAdded() { return dateAdded; }
	public void setDateAdded(LocalDateTime dateAdded) {this.dateAdded = dateAdded; }
	
}