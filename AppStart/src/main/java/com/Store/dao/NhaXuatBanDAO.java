package com.Store.dao;

import java.util.List;

import com.Store.entity.Nhaxuatban;

public interface NhaXuatBanDAO {
	public void add(Nhaxuatban nhaXuatBan);

	public void update(Nhaxuatban nhaXuatBan);

	public void delete(Nhaxuatban nhaXuatBan);

	public Nhaxuatban getByID(int maNhaXuatBan);

	public List<Nhaxuatban> getAll(int curentPage, int size);

	public List<Nhaxuatban> searchByName(String tenNhaXuatBan, int curentPage, int size);
}
