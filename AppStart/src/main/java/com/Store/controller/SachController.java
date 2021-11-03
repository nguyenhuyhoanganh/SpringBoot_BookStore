package com.Store.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.Store.model.SachDTO;
import com.Store.service.NhaXuatBanService;
import com.Store.service.NhomMuaSevice;
import com.Store.service.SachService;
import com.Store.service.TheLoaiService;

@Controller
public class SachController {

	@Autowired
	private SachService sachService;
	@Autowired
	private TheLoaiService theLoaiService;
	@Autowired
	private NhomMuaSevice nhomMuaSevice;
	@Autowired
	private NhaXuatBanService nhaXuatBanService;

	@GetMapping(value = "/danh-sach-san-pham")
	public String getListBook(HttpServletRequest req) {
		int size = 5;
		int totalData = sachService.getAllBook(0, 1000).size();

		int totalPage = totalData / size * size < totalData ? totalData / size + 1 : totalData / size;

		int currentPage = req.getParameter("currentPage") == null ? 1
				: Integer.parseInt(req.getParameter("currentPage"));
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
		return "admin/book/listbook";
	}

	@GetMapping(value = "/xoa-san-pham/{bookId}")
	public String deletesBook(HttpServletRequest req, @PathVariable(name = "bookId") int bookId) {
		sachService.deleteBook(sachService.getBookById(bookId));
		return "redirect:/danh-sach-san-pham";
	}

	@GetMapping(value = "/chi-tiet-san-pham/{bookId}")
	public String detailsBook(HttpServletRequest req, @PathVariable(name = "bookId") int bookId) {

		req.setAttribute("book", sachService.getBookById(bookId));
		return "admin/book/details";
	}
	
	@GetMapping(value = "/download")
    public void download(HttpServletResponse response, @RequestParam("image") String image) {
	final String uploadFolder = ".\\src\\main\\resources\\static\\img\\";
	File file = new File(uploadFolder + File.separator + image);
	if (file.exists()) {
	    try {
		Files.copy(file.toPath(), response.getOutputStream());
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	}
    }

	@GetMapping(value = "/them-moi-san-pham")
	public String addBook(HttpServletRequest req, Model model) {

		req.setAttribute("TheLoais", theLoaiService.getAll(0, 1000));
		req.setAttribute("NhomMuas", nhomMuaSevice.getAll(0, 1000));
		req.setAttribute("NhaXuatBans", nhaXuatBanService.getAll(0, 1000));
		model.addAttribute("Sach", new SachDTO());
		

		return "admin/book/addbook";
	}

	@PostMapping(value = "/them-moi-san-pham")
	public String addBook(HttpServletRequest req, @ModelAttribute("Sach") SachDTO sach,
			@RequestParam(name = "imageFile") List<MultipartFile> imagefiles) throws IOException {

		List<String> fileNames = new ArrayList<String>();
		for (MultipartFile file : imagefiles) {

			String originalFilename = file.getOriginalFilename();

			int lastIndex = originalFilename.lastIndexOf(".");

			String ext = originalFilename.substring(lastIndex);

			String fileName = System.currentTimeMillis() + ext;

			
			Path uploadPath = Paths.get(".\\src\\main\\resources\\static\\img\\");
			
			if(!Files.exists(uploadPath)) {
				Files.createDirectories(uploadPath);
			}
			
			try(InputStream inputStream = file.getInputStream()) {
				Path filePath = uploadPath.resolve(fileName);
				
				System.out.println(filePath.toString());
				System.out.println(filePath.toFile().getAbsolutePath());
				
				Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				throw new IOException("Could not save upload file: " + fileName);
			}
			
			fileNames.add(fileName);
		}
		sach.setHinhAnh(fileNames.get(0));
		if (fileNames.size() >= 2)
			sach.setHinhAnh2(fileNames.get(1));
		if (fileNames.size() == 3)
			sach.setHinhAnh3(fileNames.get(2));
		
		Date dt = new Date();
		
		sach.setNgayCapNhat(dt);
		
		sachService.addBook(sach);

		return "redirect:/danh-sach-san-pham";
	}

}
