package com.Store.dao;

import java.util.List;

import com.Store.entity.Theloai;

public interface TheLoaiDAO {
	public void add(Theloai theLoai);

	public void update(Theloai theLoai);

	public void delete(Theloai theLoai);

	public Theloai getByID(int maTheLoai);

	public List<Theloai> getAll(int curentPage, int size);

	public List<Theloai> searchByName(String tenTheLoai, int curentPage, int size);
}
