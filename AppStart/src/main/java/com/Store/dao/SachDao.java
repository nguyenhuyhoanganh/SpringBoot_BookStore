package com.Store.dao;

import com.Store.entity.Sach;

import java.util.List;

public interface SachDao {
	public void addBook(Sach sach);

	public void updateBook(Sach sach);

	public void deleteBook(Sach sach);

	public Sach getBookById(int maSach);

	public List<Sach> getAllBook();

//	public List<Sach> getByCate(int cateId);
}
