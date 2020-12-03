package com.example.libraryVerdi.boot.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Table(name="books")

public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String author;
	@OneToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Reservations> reservations;

public Book(Long id, String name, String author) {
	this.id=id;
	this.name=name;
	this.author=author;
}


/**
 * @return the reservation
 */
public List<Reservations> getReservations() {
	return reservations;
}


/**
 * @param reservation the reservation to set
 */
public void setReservations(List<Reservations> reservations) {
	this.reservations = reservations;
}


public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getAuthor() {
	return author;
}



public void setAuthor(String author) {
	this.author = author;
}



@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
}
}