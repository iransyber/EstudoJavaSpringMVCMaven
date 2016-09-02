package br.com.casadocodigo.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.daos.ProductDAO;
import br.com.casadocodigo.loja.models.Product;

@Controller
public class ProductsController {
	
	@Autowired
	private ProductDAO ProductDAO = new ProductDAO();

	@RequestMapping("/products/form") 
	public String form(){ 
		return "products/form"; 
	}
	
	@RequestMapping("/produtos")
	public String save(Product product){
		ProductDAO.save(product);
		System.out.println("Cadastrando o Produto: "+product.toString());
		return "products/ok";
	}
	
	
	
}
