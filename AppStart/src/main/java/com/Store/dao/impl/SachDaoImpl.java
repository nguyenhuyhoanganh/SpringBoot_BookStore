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
public class SachDaoImpl implements SachDao {

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
	public List<Sach> getAllBook(int currentPage, int size) {
		int totalData, totalPage, start;
		
		String jpql="SELECT s FROM Sach s";
		
		totalData = entityManager.createQuery(jpql, Sach.class).getResultList().size();
		
		totalPage = totalData / size * size < totalData ? totalData / size + 1 : totalData / size;
		
		currentPage = currentPage < 1 ? 1 : currentPage > totalPage ? totalPage : currentPage;
		
		size = size < 0 ? 0 : currentPage * size > totalData ? totalData - (currentPage - 1) * size : size;
		
		start = (currentPage - 1) * size;
		
		return entityManager.createQuery(jpql, Sach.class).setFirstResult(start).setMaxResults(size).getResultList();
	}

	@Override
	public List<Sach> search(String tenSach, String tenTheLoai, String tenNhaXuatBan, String tenNhomMua,
			long donGiaBatDau, long donGiaKetThuc) {
		try {
			String hql = "SELECT s FROM Sach s  JOIN s.theloai tl"
					+ " JOIN s.nhaxuatban nxb"
					+ " JOIN s.nhommua nm"
					+ " WHERE (s.tenSach like:tensach AND tl.tenTheLoai like:tentheloai and nxb.tenNhaXuatBan like:tennxb"
					+ " AND nm.tenNhom like:tennhom"
					+ " AND (s.donGia between :donGiaBatDau AND :donGiaKetThuc ))";

			return entityManager.createQuery(hql, Sach.class).setParameter("tensach", "%" + tenSach + "%")
					.setParameter("tentheloai", "%" + tenTheLoai + "%").setParameter("tennxb", "%" + tenNhaXuatBan + "%")
					.setParameter("tennhom", "%" + tenNhomMua + "%").setParameter("donGiaBatDau", donGiaBatDau)
					.setParameter("donGiaKetThuc", donGiaKetThuc).getResultList();

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
