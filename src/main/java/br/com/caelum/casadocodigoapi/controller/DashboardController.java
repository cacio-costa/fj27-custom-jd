package br.com.caelum.casadocodigoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caelum.casadocodigoapi.controller.dto.output.DashboardOutputDto;
import br.com.caelum.casadocodigoapi.repository.AuthorRepository;
import br.com.caelum.casadocodigoapi.repository.BookRepository;
import br.com.caelum.casadocodigoapi.repository.CategoryRepository;
import br.com.caelum.casadocodigoapi.repository.ProductRepository;

@RestController
public class DashboardController {

	@Autowired 
	private BookRepository bookRepository;
	
	@Autowired 
	private AuthorRepository authorRepository;
	
	@Autowired 
	private ProductRepository productRepository;
	
	@Autowired 
	private CategoryRepository categoryRepository;
	
	@GetMapping("/api/admin/dashboard")
	public DashboardOutputDto dashboard() {
		return new DashboardOutputDto(
			bookRepository.count(), 
			authorRepository.count(), 
			productRepository.count(), 
			categoryRepository.count()
		);
	}
	
}
