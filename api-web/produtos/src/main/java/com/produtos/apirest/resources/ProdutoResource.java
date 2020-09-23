package com.produtos.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutosRepository;

@RestController
@RequestMapping(value="/api")
public class ProdutoResource {
	
	@Autowired
	ProdutosRepository produtosRepository;

	@GetMapping("/produtos")
	public List<Produto> ListaProdutos() {
		return produtosRepository.findAll();
	}
	
	@GetMapping("/produto/{id}")
	public Produto ListaProdutoUnico(@PathVariable(value="id") long id) {
		return produtosRepository.findById(id);
	}
	
}
