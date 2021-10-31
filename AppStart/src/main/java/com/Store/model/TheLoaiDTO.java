package com.Store.model;

public class TheLoaiDTO {
	private int maTheLoai;
	private String icon;
	private String tenTheLoai;

	public int getMaTheLoai() {
		return maTheLoai;
	}

	public void setMaTheLoai(int maTheLoai) {
		this.maTheLoai = maTheLoai;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getTenTheLoai() {
		return tenTheLoai;
	}

	public void setTenTheLoai(String tenTheLoai) {
		this.tenTheLoai = tenTheLoai;
	}

	public TheLoaiDTO(int maTheLoai, String icon, String tenTheLoai) {
		super();
		this.maTheLoai = maTheLoai;
		this.icon = icon;
		this.tenTheLoai = tenTheLoai;
	}

	public TheLoaiDTO() {
		super();
	}
	
}
