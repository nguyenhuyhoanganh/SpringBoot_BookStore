package com.Store.model;

public class NhomMuaDTO {
	private int maNhom;
	private String tenNhom;

	public int getMaNhom() {
		return maNhom;
	}

	public void setMaNhom(int maNhom) {
		this.maNhom = maNhom;
	}

	public String getTenNhom() {
		return tenNhom;
	}

	public void setTenNhom(String tenNhom) {
		this.tenNhom = tenNhom;
	}

	public NhomMuaDTO(int maNhom, String tenNhom) {
		super();
		this.maNhom = maNhom;
		this.tenNhom = tenNhom;
	}

	public NhomMuaDTO() {
		super();
	}
}
