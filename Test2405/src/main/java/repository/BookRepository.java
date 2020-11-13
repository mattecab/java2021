package repository;

import javax.persistence.EntityManager;

import model.Book;

import java.util.List;
import java.util.Optional;

public class BookRepository {
	private EntityManager entityManager;

	public BookRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<Book> findAll() {
		return entityManager.createQuery("from Book").getResultList();
	}
       public Optional<Book> save(Book book) {
		
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(book);
			entityManager.getTransaction().commit();
			return Optional.of(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}

	
}