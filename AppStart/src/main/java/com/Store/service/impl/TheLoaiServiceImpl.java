package com.Store.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Store.dao.TheLoaiDAO;
import com.Store.entity.Theloai;
import com.Store.model.TheloaiDTO;
import com.Store.service.TheLoaiService;

@Transactional
@Service
public class TheLoaiServiceImpl implements TheLoaiService{
	
	@Autowired
	private TheLoaiDAO theLoaiDAO;

	@Override
	public void add(TheloaiDTO theLoaiDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(TheloaiDTO theLoaiDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TheloaiDTO theLoaiDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TheloaiDTO getByID(int maTheLoaiDTO) {
		Theloai theloai = theLoaiDAO.getByID(maTheLoaiDTO);

		TheloaiDTO theloaiDTO = new TheloaiDTO();

		theloaiDTO.setMaTheLoai(theloai.getMaTheLoai());
		theloaiDTO.setTenTheLoai(theloai.getTenTheLoai());
		theloaiDTO.setIcon(theloai.getIcon());

		return theloaiDTO;
	}

	@Override
	public List<TheloaiDTO> getAll(int curentPage, int size) {
		List<TheloaiDTO> listTheloaiDTOs = new ArrayList<TheloaiDTO>();
		List<Theloai> listTheloais = theLoaiDAO.getAll(curentPage, size);
		
		for(Theloai theloai : listTheloais) {
			TheloaiDTO theloaiDTO = new TheloaiDTO();

			theloaiDTO.setMaTheLoai(theloai.getMaTheLoai());
			theloaiDTO.setTenTheLoai(theloai.getTenTheLoai());
			theloaiDTO.setIcon(theloai.getIcon());
			
			listTheloaiDTOs.add(theloaiDTO);
		}
		
		return listTheloaiDTOs;
	}

	@Override
	public List<TheloaiDTO> searchByName(String tenTheLoaiDTO, int curentPage, int size) {
		// TODO Auto-generated method stub
		return null;
	}

}
