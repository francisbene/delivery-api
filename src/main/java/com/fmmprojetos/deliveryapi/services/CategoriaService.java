package com.fmmprojetos.deliveryapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmmprojetos.deliveryapi.domain.Categoria;
import com.fmmprojetos.deliveryapi.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> Listar() {
	
		return categoriaRepository.findAll();

	}

}
