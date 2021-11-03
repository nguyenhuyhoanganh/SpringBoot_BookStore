package com.Store.dao;

import java.util.List;

import com.Store.entity.Sach;

public interface SachDAO{
	public void addBook(Sach sach);

	public void updateBook(Sach sach);

	public void deleteBook(Sach sach);

	public Sach getBookById(int maSach);

	public List<Sach> getAllBook(int curentPage, int size);

	public List<Sach> search(String tenSach, String tenTheLoai, String tenNhaXuatBan, String tenNhomMua,
			long donGiaBatDau, long donGiaKetThuc);
}
