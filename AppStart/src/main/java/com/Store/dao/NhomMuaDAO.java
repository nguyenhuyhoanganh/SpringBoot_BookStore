package com.Store.dao;

import java.util.List;

import com.Store.entity.Nhommua;

public interface NhomMuaDAO {
	public void add(Nhommua nhomMua);

	public void update(Nhommua nhomMua);

	public void delete(Nhommua nhomMua);

	public Nhommua getByID(int maNhomMua);

	public List<Nhommua> getAll(int curentPage, int size);

	public List<Nhommua> searchByName(String tenNhomMua, int curentPage, int size);
}
