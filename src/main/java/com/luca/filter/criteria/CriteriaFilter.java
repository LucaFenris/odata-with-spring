package com.luca.filter.criteria;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.luca.filter.QueryObject;
import com.luca.filter.Parser.FilterParser;
import com.luca.filter.model.Products;

public class CriteriaFilter {

	FilterParser filterParser = new FilterParser();

	public List<Predicate> whereParams(CriteriaBuilder builder, Root<Products> root) {

		final List<Predicate> predicates = new ArrayList<Predicate>();
		List<QueryObject> parserList = filterParser.whereFilter();

		for (QueryObject object : parserList) {
			object.getObject();
			predicates.add(whereOperator(object, builder, root));
		}

		return predicates;

	}

	public Predicate whereOperator(QueryObject object, CriteriaBuilder builder, Root<Products> root) {
		switch (object.getOperator()) {
		case "eq":
			return builder.equal(root.get(object.getObject()), object.getValue().toString());
		case "ne":
			return builder.notEqual(root.get(object.getObject()), object.getValue().toString());
		case "gt":
			return builder.gt(root.get(object.getObject()), Integer.parseInt(object.getValue().toString()));
		case "ge":
			return builder.ge(root.get(object.getObject()), Integer.parseInt(object.getValue().toString()));
		case "lt":
			return builder.lt(root.get(object.getObject()), Integer.parseInt(object.getValue().toString()));
		case "le":
			return builder.le(root.get(object.getObject()), Integer.parseInt(object.getValue().toString()));
		case "like":
			return builder.like(root.get(object.getObject()), object.getValue().toString());
		}

		return null;
	}
}
