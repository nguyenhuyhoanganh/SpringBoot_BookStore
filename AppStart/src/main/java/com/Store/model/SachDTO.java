package com.Store.model;

import java.util.Date;

public class SachDTO {
	private int maSach;
	private long donGia;
	private String hinhAnh;
	private String hinhAnh2;
	private String hinhAnh3;
	private String moTa;
	private Date ngayCapNhat;
	private int soLuongMua;
	private int soLuongTon;
	private String tenSach;
	
	private NhomMuaDTO nhomMua;
	private TheLoaiDTO theLoai;
	private NhaXuatBanDTO nhaXuatBan;
	
	public int getMaSach() {
		return maSach;
	}
	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}
	public long getDonGia() {
		return donGia;
	}
	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public String getHinhAnh2() {
		return hinhAnh2;
	}
	public void setHinhAnh2(String hinhAnh2) {
		this.hinhAnh2 = hinhAnh2;
	}
	public String getHinhAnh3() {
		return hinhAnh3;
	}
	public void setHinhAnh3(String hinhAnh3) {
		this.hinhAnh3 = hinhAnh3;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public Date getNgayCapNhat() {
		return ngayCapNhat;
	}
	public void setNgayCapNhat(Date ngayCapNhat) {
		this.ngayCapNhat = ngayCapNhat;
	}
	public int getSoLuongMua() {
		return soLuongMua;
	}
	public void setSoLuongMua(int soLuongMua) {
		this.soLuongMua = soLuongMua;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public NhomMuaDTO getNhomMua() {
		return nhomMua;
	}
	public void setNhomMua(NhomMuaDTO nhomMua) {
		this.nhomMua = nhomMua;
	}
	public TheLoaiDTO getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(TheLoaiDTO theLoai) {
		this.theLoai = theLoai;
	}
	public NhaXuatBanDTO getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(NhaXuatBanDTO nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	
	public SachDTO(int maSach, long donGia, String hinhAnh, String hinhAnh2, String hinhAnh3, String moTa,
			Date ngayCapNhat, int soLuongMua, int soLuongTon, String tenSach) {
		super();
		this.maSach = maSach;
		this.donGia = donGia;
		this.hinhAnh = hinhAnh;
		this.hinhAnh2 = hinhAnh2;
		this.hinhAnh3 = hinhAnh3;
		this.moTa = moTa;
		this.ngayCapNhat = ngayCapNhat;
		this.soLuongMua = soLuongMua;
		this.soLuongTon = soLuongTon;
		this.tenSach = tenSach;
		
		this.nhomMua = new NhomMuaDTO();
		this.theLoai = new TheLoaiDTO();
		this.nhaXuatBan = new NhaXuatBanDTO();
	}
	public SachDTO() {
		super();
		
		this.nhomMua = new NhomMuaDTO();
		this.theLoai = new TheLoaiDTO();
		this.nhaXuatBan = new NhaXuatBanDTO();
	}
	
	
}
