package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
@NamedQueries({@NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b") })

public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String title;
	@ManyToOne
	@JoinColumn(name = "QUOTE_ID")
    private ArrayList<Quote> quotes=new ArrayList<>();

	
	Book() {}

public Book(Integer id, String name) {
		this.id = id;
		this.title = name;
	}

public Book(String name) {
		this.title = name;
	}

public Integer getId() {
		return id;
	}

public void setId(Integer id) {
		this.id = id;
	}

public String getTitle() {
		return title;
	}

public void setTitle(String name) {
		this.title = name;
	}
	
public Quotes getQuotes() {
		return quotes;
	}

public void setQuote (Quotes quotes) {
		this.quote = quotes;
	}

@Override
public String toString() {

		return "Book{" + "id=" + id + ", name='" + title + '\'' + ", author=" + quotes.getTag() + '}';

public void addQuote(Quote quote) {
 quotes.add(quote);
			

	}


}
