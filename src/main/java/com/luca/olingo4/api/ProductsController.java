package com.luca.olingo4.api;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.luca.olingo4.model.Products;
import com.luca.olingo4.model.ProductsRepository;

@RestController
@RequestMapping(path = "/api/products", produces = { APPLICATION_JSON_VALUE })
public class ProductsController {

	@Autowired
	ProductsRepository productsRepository;

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<Products> healthCheck() {

		return productsRepository.findAll();

//		return "{\"status\": \"ok\"}";
	}

}
