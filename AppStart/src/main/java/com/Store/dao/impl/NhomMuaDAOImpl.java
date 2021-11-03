package com.Store.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Store.dao.NhomMuaDAO;
import com.Store.entity.Nhommua;

@Transactional
@Repository
public class NhomMuaDAOImpl implements NhomMuaDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void add(Nhommua nhomMua) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Nhommua nhomMua) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Nhommua nhomMua) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Nhommua getByID(int maNhomMua) {
		return entityManager.find(Nhommua.class, maNhomMua);
	}

	@Override
	public List<Nhommua> getAll(int curentPage, int size) {
		String jpql ="SELECT nm FROM Nhommua nm";
		return entityManager.createQuery(jpql, Nhommua.class).getResultList();
	}

	@Override
	public List<Nhommua> searchByName(String tenNhomMua, int curentPage, int size) {
		// TODO Auto-generated method stub
		return null;
	}

}
