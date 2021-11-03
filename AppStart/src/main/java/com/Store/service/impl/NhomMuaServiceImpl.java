package com.Store.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Store.dao.NhomMuaDAO;
import com.Store.entity.Nhommua;
import com.Store.model.NhommuaDTO;
import com.Store.service.NhomMuaSevice;

@Transactional
@Service
public class NhomMuaServiceImpl implements NhomMuaSevice {

	@Autowired
	private NhomMuaDAO nhomMuaDAO;

	@Override
	public void add(NhommuaDTO nhomMuaDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(NhommuaDTO nhomMuaDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(NhommuaDTO nhomMuaDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public NhommuaDTO getByID(int maNhomMuaDTO) {
		Nhommua nhomMua = nhomMuaDAO.getByID(maNhomMuaDTO);

		NhommuaDTO nhommuaDTO = new NhommuaDTO();

		nhommuaDTO.setMaNhom(nhomMua.getMaNhom());
		nhommuaDTO.setTenNhom(nhomMua.getTenNhom());

		return nhommuaDTO;
	}

	@Override
	public List<NhommuaDTO> getAll(int curentPage, int size) {
		List<NhommuaDTO> listNhomMuaDTO = new ArrayList<NhommuaDTO>();
		
		List<Nhommua> listNhomMua = nhomMuaDAO.getAll(curentPage, size);
		for(Nhommua nhomMua : listNhomMua) {
			NhommuaDTO nhommuaDTO = new NhommuaDTO();
			
			nhommuaDTO.setMaNhom(nhomMua.getMaNhom());
			nhommuaDTO.setTenNhom(nhomMua.getTenNhom());
			
			listNhomMuaDTO.add(nhommuaDTO);		
		}
		
		return listNhomMuaDTO;
	}

	@Override
	public List<NhommuaDTO> searchByName(String tenNhomMuaDTO, int curentPage, int size) {
		// TODO Auto-generated method stub
		return null;
	}

}
