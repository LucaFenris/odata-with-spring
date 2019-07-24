package com.luca.filter.criteria;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.luca.filter.model.Products;

public class CriteriaFilter {

	public List<Products> filter(EntityManager em) {

		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Products> query = builder.createQuery(Products.class);

		Root<Products> root = query.from(Products.class);

		query.select(root).where(builder.gt(root.get("id"), 1));

		return em.createQuery(query).getResultList();

	}

}
