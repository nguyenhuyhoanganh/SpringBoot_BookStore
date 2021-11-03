package com.Store.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Store.dao.TheLoaiDAO;
import com.Store.entity.Theloai;

@Transactional
@Repository
public class TheLoaiDAOImpl implements TheLoaiDAO{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void add(Theloai theLoai) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Theloai theLoai) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Theloai theLoai) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Theloai getByID(int maTheLoai) {
		return entityManager.find(Theloai.class, maTheLoai);
	}

	@Override
	public List<Theloai> getAll(int curentPage, int size) {
		String jpql ="SELECT tl FROM Theloai tl";
		return entityManager.createQuery(jpql, Theloai.class).getResultList();
	}

	@Override
	public List<Theloai> searchByName(String tenTheLoai, int curentPage, int size) {
		// TODO Auto-generated method stub
		return null;
	}

}
