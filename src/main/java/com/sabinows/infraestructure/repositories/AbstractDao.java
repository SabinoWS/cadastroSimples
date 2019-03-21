package com.sabinows.infraestructure.repositories;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDao<T, PK extends Serializable> {

	@SuppressWarnings("unchecked")
	private final Class<T> entityClass = 
			(Class<T>) ( (ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	
	@PersistenceContext
	private EntityManager entityManager;

	public void save(T entity) { 
		entityManager.persist(entity);
	}
	
	public List<T> findAll() {
		return entityManager
			.createQuery("from " + entityClass.getSimpleName(), entityClass)
			.getResultList();
	}
}
