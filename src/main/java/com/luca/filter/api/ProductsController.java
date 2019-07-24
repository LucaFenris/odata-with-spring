package com.luca.filter.api;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.luca.filter.criteria.CriteriaSQL;
import com.luca.filter.model.Products;
import com.luca.filter.model.ProductsRepository;

@RestController
@RequestMapping(path = "/api/products", produces = { APPLICATION_JSON_VALUE })
public class ProductsController {

	@Autowired
	ProductsRepository productsRepository;

	@PersistenceContext
	private EntityManager em;

	CriteriaSQL criteriaFilter = new CriteriaSQL();

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<Products> getValue() {

		return criteriaFilter.filter(em);

	}

}
