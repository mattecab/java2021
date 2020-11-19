package com.example.Test2405spring.boot.model;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.OneToMany;




@Entity
//@Table(name = "BOOK")
//@NamedQueries({ @NamedQuery(name = "Book.findByTitle", query = "SELECT b FROM Book b WHERE b.title = :title"),
//@NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b") })

public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private ArrayList<Quote> quotes= new ArrayList<Quote>();

 Book() {}

public Book(Long id, String name) {
		this.id = id;
		this.title = name;
	}

public Book(String name) {
		this.title = name;
	}

public long getId() {
		return id;
	}

public void setId(Long id) {
		this.id = id;
	}


public String getTitle() {
		return title;
	}

public void setTitle(String name) {
		this.title = name;
	}
	
public ArrayList<Quote> getQuotes() {
		return quotes;
	}

	
public void addQuote (Quote quote) {
	quotes.add(quote);
	quote.setBook(this);}

@Override
public String toString() {
	return String.format("Book[id=%d,  title='%s']", id, title);
}





	}




