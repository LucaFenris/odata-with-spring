package com.luca.filter.criteria;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.luca.filter.model.Products;

public class CriteriaSQL {

	CriteriaFilter filter = new CriteriaFilter();

	public List<Products> filter(EntityManager em) {

		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Products> query = builder.createQuery(Products.class);
		Root<Products> root = query.from(Products.class);

		List<Predicate> predicates = filter.whereParams(builder, root);

		query.select(root);
		query.where(builder.and(predicates.toArray(new Predicate[predicates.size()])));

		return em.createQuery(query).getResultList();

	}

}
