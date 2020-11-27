package com.example.libraryVerdi.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.libraryVerdi.boot.model.Book;
//@Entity
public class BookRented {
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
		private Book book;
	
		public BookRented() {}
			
		public BookRented(Book book) {
			super();
			this.id=id;
			this.book = book;
			
		}

		public Book getBook() {
			return book;
		}

		public void setBook(Book book) {
			this.book = book;
		}
		@Override
		public String toString() {
			return "BookRented [book=" + book + "]";
		}
	}