package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Quote;
import model.Book;
import repository.BookRepository;
import repository.QuoteRepository;
import java.util.List;
import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		QuoteRepository quoterepository = new QuoteRepository(entityManager);
		BookRepository bookrepository = new BookRepository(entityManager);
		
		// Create book Karenina y Orlando
		Book karenina = new Book(1, "Anna Karenina");
		Book orlando = new Book(2, "Orlando");
		

		
		//create quotes for the Book karenina and orlando
		karenina.addQuote(new Quote(1,"“All happy families are alike; each unhappy family is unhappy in its own way.”",500,karenina));
		karenina.addQuote(new Quote(2,"“If you look for perfection, you'll never be content.”",500,karenina));
		karenina.addQuote(new Quote(3,"“I think... if it is true that there are as many minds as there are heads, then there are as many kinds of love as there are hearts.”",500,karenina));
		karenina.addQuote(new Quote(4,"“He stepped down, trying not to look long at her, as if she were the sun, yet he saw her, like the sun, even without looking.”",500,karenina));
		karenina.addQuote(new Quote(5,"“Respect was invented to cover the empty place where love should be.”",500,karenina));
		
	    orlando.addQuote(new Quote(1,"As long as she thinks of a man, nobody objects to a woman thinking.",400,orlando));
		orlando.addQuote(new Quote(2,"Nothing thicker than a knife's blade separates happiness from melancholy.",400, orlando));
		
		
		Optional<Book> savedBook1 = bookrepository.save(karenina);
		Optional<Book> savedBook2 = bookrepository.save(orlando);
		

		System.out.println("Saved Book: " + savedBook1.get());
		
		// Find all quotes
		List<Quote> quotes = quoterepository.findAll();
		System.out.println("Quotes:");
		for (Quote quoteToPrint : quotes) {
			System.out.println(quoteToPrint);
		}
		//quotes.forEach(System.out::println);

		// List all books
		List<Book> books = bookrepository.findAll();
		System.out.println("Books in database:");
		books.forEach(System.out::println);

		

		// Close the entity manager and associated factory
		entityManager.close();
		entityManagerFactory.close();
	}
}