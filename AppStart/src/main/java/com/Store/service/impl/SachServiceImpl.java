package com.Store.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Store.dao.SachDAO;
import com.Store.entity.Nhaxuatban;
import com.Store.entity.Nhommua;
import com.Store.entity.Sach;
import com.Store.entity.Theloai;
import com.Store.model.NhaxuatbanDTO;
import com.Store.model.NhommuaDTO;
import com.Store.model.SachDTO;
import com.Store.model.TheloaiDTO;
import com.Store.service.SachService;

@Transactional
@Service
public class SachServiceImpl implements SachService {
	
	@Autowired 
	private SachDAO sachDao;

	@Override
	public void addBook(SachDTO sachDTO) {
		Sach sach = new Sach();
		sach.setMaSach(sachDTO.getMaSach());
		sach.setTenSach(sachDTO.getTenSach());
		sach.setDonGia(sachDTO.getDonGia());
		sach.setHinhAnh(sachDTO.getHinhAnh());
		sach.setHinhAnh2(sachDTO.getHinhAnh2());
		sach.setHinhAnh3(sachDTO.getHinhAnh3());
		sach.setNgayCapNhat(sachDTO.getNgayCapNhat());
		sach.setMoTa(sachDTO.getMoTa());
		sach.setSoLuongTon(sachDTO.getSoLuongTon());
		sach.setSoLuongMua(sachDTO.getSoLuongMua());
		
		Theloai theLoai = new Theloai();
		theLoai.setMaTheLoai(sachDTO.getTheLoai().getMaTheLoai());
		sach.setTheloai(theLoai);
		
		Nhaxuatban nhaXuatBan = new Nhaxuatban();
		nhaXuatBan.setMaNhaXuatBan(sachDTO.getNhaXuatBan().getMaNhaXuatBan());
		sach.setNhaxuatban(nhaXuatBan);
		
		Nhommua nhomMua = new Nhommua();
		nhomMua.setMaNhom(sachDTO.getNhomMua().getMaNhom());
		sach.setNhommua(nhomMua);
		
		sachDao.addBook(sach);
	}

	@Override
	public void updateBook(SachDTO sachDTO) {
		Sach sach = sachDao.getBookById(sachDTO.getMaSach());
		
		sach.setMaSach(sachDTO.getMaSach());
		sach.setTenSach(sachDTO.getTenSach());
		sach.setDonGia(sachDTO.getDonGia());
		sach.setHinhAnh(sachDTO.getHinhAnh());
		sach.setHinhAnh2(sachDTO.getHinhAnh2());
		sach.setHinhAnh3(sachDTO.getHinhAnh3());
		sach.setNgayCapNhat(sachDTO.getNgayCapNhat());
		sach.setMoTa(sachDTO.getMoTa());
		sach.setSoLuongTon(sachDTO.getSoLuongTon());
		sach.setSoLuongMua(sachDTO.getSoLuongMua());
		
		Theloai theLoai = new Theloai();
		theLoai.setMaTheLoai(sachDTO.getTheLoai().getMaTheLoai());
		sach.setTheloai(theLoai);
		
		Nhaxuatban nhaXuatBan = new Nhaxuatban();
		nhaXuatBan.setMaNhaXuatBan(sachDTO.getNhaXuatBan().getMaNhaXuatBan());
		sach.setNhaxuatban(nhaXuatBan);
		
		Nhommua nhomMua = new Nhommua();
		nhomMua.setMaNhom(sachDTO.getNhomMua().getMaNhom());
		sach.setNhommua(nhomMua);
		
		sachDao.updateBook(sach);
	}

	@Override
	public void deleteBook(SachDTO sachDTO) {
		Sach sach = sachDao.getBookById(sachDTO.getMaSach());
		sachDao.deleteBook(sach);
	}

	@Override
	public SachDTO getBookById(int maSach) {
		Sach book = sachDao.getBookById(maSach);
		
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
		
		TheloaiDTO genreDTO = new TheloaiDTO();
		genreDTO.setMaTheLoai(book.getTheloai().getMaTheLoai());
		genreDTO.setTenTheLoai(book.getTheloai().getTenTheLoai());
		bookDTO.setTheLoai(genreDTO);
		
		NhommuaDTO groupDTO = new NhommuaDTO();
		groupDTO.setMaNhom(book.getNhommua().getMaNhom());
		groupDTO.setTenNhom(book.getNhommua().getTenNhom());
		bookDTO.setNhomMua(groupDTO);
		
		NhaxuatbanDTO publishDTO = new NhaxuatbanDTO();
		publishDTO.setMaNhaXuatBan(book.getNhaxuatban().getMaNhaXuatBan());
		publishDTO.setTenNhaXuatBan(book.getNhaxuatban().getTenNhaXuatBan());
		bookDTO.setNhaXuatBan(publishDTO);
		
		return bookDTO;
	}

	@Override
	public List<SachDTO> getAllBook(int currentPage, int size) {
		List<SachDTO> bookList = new ArrayList<SachDTO>();
		List<Sach> books = sachDao.getAllBook(currentPage, size);
		
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
			
			TheloaiDTO genreDTO = new TheloaiDTO();
			genreDTO.setMaTheLoai(book.getTheloai().getMaTheLoai());
			genreDTO.setTenTheLoai(book.getTheloai().getTenTheLoai());
			bookDTO.setTheLoai(genreDTO);
			
			NhommuaDTO groupDTO = new NhommuaDTO();
			groupDTO.setMaNhom(book.getNhommua().getMaNhom());
			groupDTO.setTenNhom(book.getNhommua().getTenNhom());
			bookDTO.setNhomMua(groupDTO);
			
			NhaxuatbanDTO publishDTO = new NhaxuatbanDTO();
			publishDTO.setMaNhaXuatBan(book.getNhaxuatban().getMaNhaXuatBan());
			publishDTO.setTenNhaXuatBan(book.getNhaxuatban().getTenNhaXuatBan());
			bookDTO.setNhaXuatBan(publishDTO);
			
			bookList.add(bookDTO);
		}
		
		return bookList;
	}

	@Override
	public List<SachDTO> search(String tenSach, String tenTheLoai, String tenNhaXuatBan, String tenNhomMua,
			long donGiaBatDau, long donGiaKetThuc) {
		
		List<Sach> listSaches = sachDao.search(tenSach, tenTheLoai, tenNhaXuatBan, tenNhomMua, donGiaBatDau,
				donGiaKetThuc);
		List<SachDTO> sachDTOs = new ArrayList<SachDTO>();
		
		for (Sach sach : listSaches) {
			SachDTO dto = new  SachDTO();
			
			dto.setMaSach(sach.getMaSach());
			dto.setTenSach(sach.getTenSach());
			dto.setDonGia(sach.getDonGia());
			dto.setHinhAnh(sach.getHinhAnh());
			dto.setHinhAnh2(sach.getHinhAnh2());
			dto.setHinhAnh3(sach.getHinhAnh3());
			dto.setNgayCapNhat(sach.getNgayCapNhat());
			dto.setMoTa(sach.getMoTa());
			dto.setSoLuongTon(sach.getSoLuongTon());
			dto.setSoLuongMua(sach.getSoLuongMua());
			
			TheloaiDTO genreDTO = new TheloaiDTO();
			genreDTO.setMaTheLoai(sach.getTheloai().getMaTheLoai());
			genreDTO.setTenTheLoai(sach.getTheloai().getTenTheLoai());
			dto.setTheLoai(genreDTO);
			
			NhommuaDTO groupDTO = new NhommuaDTO();
			groupDTO.setMaNhom(sach.getNhommua().getMaNhom());
			groupDTO.setTenNhom(sach.getNhommua().getTenNhom());
			dto.setNhomMua(groupDTO);
			
			NhaxuatbanDTO publishDTO = new NhaxuatbanDTO();
			publishDTO.setMaNhaXuatBan(sach.getNhaxuatban().getMaNhaXuatBan());
			publishDTO.setTenNhaXuatBan(sach.getNhaxuatban().getTenNhaXuatBan());
			dto.setNhaXuatBan(publishDTO);
			
			sachDTOs.add(dto);
		}
		return sachDTOs;
	}

}
