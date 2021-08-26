package com.fmmprojetos.deliveryapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fmmprojetos.deliveryapi.domain.Categoria;
import com.fmmprojetos.deliveryapi.repositories.CategoriaRepository;
import com.fmmprojetos.deliveryapi.services.CategoriaService;

@RestController
@RequestMapping
public class CategoriaResource {
	
	@Autowired	
	private CategoriaService service;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping("/categorias")
	public List<Categoria> listar() {
		return categoriaRepository.findAll();
		
	}
	
	@PostMapping
	public Categoria adicionar(@RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);
	}


}


