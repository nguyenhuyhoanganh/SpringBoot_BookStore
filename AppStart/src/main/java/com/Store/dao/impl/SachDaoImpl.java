package com.Store.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Store.dao.SachDao;
import com.Store.entity.Sach;

@Transactional
@Repository
public class SachDaoImpl implements SachDao{

	@PersistenceContext
	EntityManager entityManager;

	
	@Override
	public void addBook(Sach sach) {
		entityManager.persist(sach);
	}

	@Override
	public void updateBook(Sach sach) {
		entityManager.merge(sach);
	}

	@Override
	public void deleteBook(Sach sach) {	
		entityManager.remove(sach);
	}

	@Override
	public Sach getBookById(int maSach) {
		return entityManager.find(Sach.class, maSach);
	}

	@Override
	public List<Sach> getAllBook() {
		String jpql="SELECT s FROM Sach s";
		return entityManager.createQuery(jpql, Sach.class).getResultList();
	}

}
