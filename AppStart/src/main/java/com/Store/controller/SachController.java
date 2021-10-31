package com.Store.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.Store.model.SachDTO;
import com.Store.service.SachService;

@Controller
public class SachController {
	
	@Autowired
	SachService sachService;
	
	@GetMapping(value = "/danh-sach-san-pham")
	public String getListBook (HttpServletRequest req) {
		
		List<SachDTO> books = sachService.getAllBook();

		req.setAttribute("books", books);
		return "views/listbook";
	}
}
