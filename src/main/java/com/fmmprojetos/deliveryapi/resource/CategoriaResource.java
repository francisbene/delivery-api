package com.fmmprojetos.deliveryapi.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String Listar() {
		return "Teste";
	}

}