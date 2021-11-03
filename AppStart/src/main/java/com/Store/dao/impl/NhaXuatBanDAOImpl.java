package com.Store.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Store.dao.NhaXuatBanDAO;
import com.Store.entity.Nhaxuatban;

@Transactional
@Repository
public class NhaXuatBanDAOImpl implements NhaXuatBanDAO{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void add(Nhaxuatban nhaXuatBan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Nhaxuatban nhaXuatBan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Nhaxuatban nhaXuatBan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Nhaxuatban getByID(int maNhaXuatBan) {
		return entityManager.find(Nhaxuatban.class, maNhaXuatBan);
	}

	@Override
	public List<Nhaxuatban> getAll(int curentPage, int size) {
		String jpql ="SELECT nxb FROM Nhaxuatban nxb";
		return entityManager.createQuery(jpql, Nhaxuatban.class).getResultList();
	}

	@Override
	public List<Nhaxuatban> searchByName(String tenNhaXuatBan, int curentPage, int size) {
		// TODO Auto-generated method stub
		return null;
	}


}
