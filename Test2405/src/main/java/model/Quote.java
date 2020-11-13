package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "QUOTE")
@NamedQueries({	@NamedQuery(name = "Quote.findAll", query = "SELECT b FROM Quote b") })
public class Quote {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int id;
	private String tag;
	private String sentence;
	private int numberWords;
	@OneToMany(mappedBy = "quote", cascade = CascadeType.ALL)
	private Book book;
		
	public Quote() {
		super();
	}
	public Quote(int id, String sentence, int numberWords, Book book) {
		super();
		this.id = id;
		this.sentence = sentence;
		this.numberWords = numberWords;
		this.book = book;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSentence() {
		return sentence;
	}
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
public String getTag() {
		return tag;
	}
	public void setSentence(String tag) {
		this.tag = tag;
	}
	public int getNumberWords() {
		return numberWords;
	}
	public void setNumberWords(int numberWords) {
		this.numberWords = numberWords;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Quote [id=" + id + ", sentence=" + sentence + ", numberWords=" + numberWords + ", book=" + book + "]";
	
		
	}
}
