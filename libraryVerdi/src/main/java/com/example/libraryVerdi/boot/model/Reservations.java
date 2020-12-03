package com.example.libraryVerdi.boot.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Reservations {
	
	 	  
	  @Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		private Date date;
		private String status;
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "BOOK_ID_FK", nullable = true)
		@JsonIgnore
		private Book book;
		
		public Reservations (Long id, String status, Date date, Book book) { 
			this.id=id;
			this.status= status;
			this.date=date;
			this.book=book;
			
			
		}

		@Override
		public String toString() {
			return "Reservations [id=" + id + ", date=" + date + ", status=" + status + ", book=" + book + "]";
		}

		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}

		/**
		 * @return the date
		 */
		public Date getDate() {
			return date;
		}

		/**
		 * @param date the date to set
		 */
		public void setDate(Date date) {
			this.date = date;
		}

		/**
		 * @return the status
		 */
		public String getStatus() {
			return status;
		}

		/**
		 * @param status the status to set
		 */
		public void setStatus(String status) {
			this.status = status;
		}

		/**
		 * @return the book
		 */
		public Book getBook() {
			return book;
		}

		/**
		 * @param book the book to set
		 */
		public void setBook(Book book) {
			this.book = book;
		}
		
}