package com.Store.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Store.model.SachDTO;
import com.Store.service.SachService;

@Controller
public class SachController {
	
	@Autowired
	SachService sachService;
	
	@GetMapping(value = "/danh-sach-san-pham")
	public String getListBook (HttpServletRequest req) {
		int size = 2;
		int totalData = sachService.getAllBook(0, 1000).size();
		
		int totalPage = totalData / size * size < totalData ? totalData / size + 1 : totalData / size;
		
		int currentPage = req.getParameter("currentPage") == null ? 1 : Integer.parseInt(req.getParameter("currentPage"));
		currentPage = currentPage < 1 ? 1 : currentPage > totalPage ? totalPage : currentPage;
		
		int start = (currentPage - 1) * size + 1;
		
		int end = start + size - 1 < totalData ? start + size - 1 : totalData;
		
		req.setAttribute("currentPage", currentPage);
		req.setAttribute("totalData", totalData);
		req.setAttribute("totalPage", totalPage);
		req.setAttribute("start", start);
		req.setAttribute("end", end);
		
		List<SachDTO> books = sachService.getAllBook(currentPage, size);

		req.setAttribute("books", books);
		return "views/admin/listbook";
	}
	@GetMapping(value = "/chi-tiet-san-pham/{bookId}")
	public String detailsBook(HttpServletRequest req, @PathVariable(name = "bookId") int bookId) {

		req.setAttribute("book", sachService.getBookById(bookId));
		return "views/details";
	}
	/*
	 * @GetMapping(value = "/danh-sach-san-pham") public String
	 * searchBook(HttpServletRequest request) {
	 * 
	 * String tenTheLoai = request.getParameter("tenTheLoai") == null ? "" :
	 * request.getParameter("tenTheLoai");
	 * 
	 * String tenNhaXuatBan = request.getParameter("tenNhaXuatBan") == null ? "" :
	 * request.getParameter("tenNhaXuatBan");
	 * 
	 * String tenNhomMua = request.getParameter("tenNhomMua") == null ? "" :
	 * request.getParameter("tenNhomMua");
	 * 
	 * String tenSach = request.getParameter("tenSach") == null ? "" :
	 * request.getParameter("tenSach");
	 * 
	 * Integer page = request.getParameter("page") == null ? 1 :
	 * Integer.valueOf(request.getParameter("page"));
	 * 
	 * Long priceStart = (request.getParameter("priceStart") == null ||
	 * request.getParameter("priceStart") == "") ? 1 :
	 * Long.valueOf(request.getParameter("priceStart"));
	 * 
	 * Long priceEnd = (request.getParameter("priceEnd") == null ||
	 * request.getParameter("priceEnd") == "") ? 100000 :
	 * Long.valueOf(request.getParameter("priceEnd"));
	 * 
	 * List<SachDTO> listPro = sachService.search(tenSach,tenTheLoai, tenNhaXuatBan,
	 * tenNhomMua, priceStart, priceEnd, 0, page * 10); List<CategoryDTO>
	 * categoryDTOs = categoryService.search("", 0, page * 10); List<ThuongHieuDTO>
	 * thuongHieuDTOs = thuongHieuService.search("", 0, page * 10);
	 * List<KichThuocDTO> kichThuocDTOs = kichThuocService.search("", 0, page * 10);
	 * List<GioiTinhDTO> gioiTinhDTOs = gioiTinhService.search("", 0, page * 10);
	 * 
	 * request.setAttribute("gioiTinhList", gioiTinhDTOs);
	 * request.setAttribute("kichThuocList", kichThuocDTOs);
	 * request.setAttribute("thuongHieuList", thuongHieuDTOs);
	 * request.setAttribute("productList", listPro);
	 * request.setAttribute("categoryList", categoryDTOs);
	 * 
	 * request.setAttribute("gioiTinhName", gioiTinhName);
	 * request.setAttribute("kichThuocName", kichThuocName);
	 * request.setAttribute("categoryName", categoryName);
	 * request.setAttribute("thuongHieuName", thuongHieuName);
	 * request.setAttribute("page", page); request.setAttribute("keyword", keyword);
	 * return "admin/product/search"; }
	 */

}
