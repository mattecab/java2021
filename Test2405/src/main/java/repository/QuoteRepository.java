package repository;

import javax.persistence.EntityManager;

import model.Quote;

import java.util.List;
import java.util.Optional;

public class QuoteRepository {

	private EntityManager entityManager;

	public QuoteRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	
	public List<Quote> findAll() {
		return entityManager.createQuery("from Quote").getResultList();
	}

	
	}
	
	

		
		
	
	
	

