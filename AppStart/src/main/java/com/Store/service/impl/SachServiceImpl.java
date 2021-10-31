package com.Store.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Store.dao.SachDao;
import com.Store.entity.Sach;
import com.Store.model.NhaXuatBanDTO;
import com.Store.model.NhomMuaDTO;
import com.Store.model.SachDTO;
import com.Store.model.TheLoaiDTO;
import com.Store.service.SachService;

@Transactional
@Service
public class SachServiceImpl implements SachService {
	
	@Autowired 
	SachDao sachDao;

	@Override
	public void addBook(SachDTO sachDTO) {
		

	}

	@Override
	public void updateBook(SachDTO sachDTO) {
		

	}

	@Override
	public void deleteBook(SachDTO sachDTO) {
		

	}

	@Override
	public SachDTO getBookById(int maSach) {
		
		return null;
	}

	@Override
	public List<SachDTO> getAllBook() {
		List<SachDTO> bookList = new ArrayList<SachDTO>();
		List<Sach> books = sachDao.getAllBook();
		
		for (Sach book : books) {
			SachDTO bookDTO = new  SachDTO();
			
			bookDTO.setMaSach(book.getMaSach());
			bookDTO.setTenSach(book.getTenSach());
			bookDTO.setDonGia(book.getDonGia());
			bookDTO.setHinhAnh(book.getHinhAnh());
			bookDTO.setHinhAnh2(book.getHinhAnh2());
			bookDTO.setHinhAnh3(book.getHinhAnh3());
			bookDTO.setNgayCapNhat(book.getNgayCapNhat());
			bookDTO.setMoTa(book.getMoTa());
			bookDTO.setSoLuongTon(book.getSoLuongTon());
			bookDTO.setSoLuongMua(book.getSoLuongMua());
			
			TheLoaiDTO genreDTO = new TheLoaiDTO();
			genreDTO.setMaTheLoai(book.getTheloai().getMaTheLoai());
			genreDTO.setTenTheLoai(book.getTheloai().getTenTheLoai());
			bookDTO.setTheLoai(genreDTO);
			
			NhomMuaDTO groupDTO = new NhomMuaDTO();
			groupDTO.setMaNhom(book.getNhommua().getMaNhom());
			groupDTO.setTenNhom(book.getNhommua().getTenNhom());
			bookDTO.setNhomMua(groupDTO);
			
			NhaXuatBanDTO publishDTO = new NhaXuatBanDTO();
			publishDTO.setMaNhaXuatBan(book.getNhaxuatban().getMaNhaXuatBan());
			publishDTO.setTenNhaXuatBan(book.getNhaxuatban().getTenNhaXuatBan());
			bookDTO.setNhaXuatBan(publishDTO);
			
			bookList.add(bookDTO);
		}
		
		return bookList;
	}

}
