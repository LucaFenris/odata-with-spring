package com.luca.filter.Parser;

import java.util.ArrayList;
import java.util.List;

import com.luca.filter.QueryObject;

public class FilterParser {

	public List<QueryObject> whereFilter() {

		final List<QueryObject> queryObject = new ArrayList<QueryObject>();

		queryObject.add(new QueryObject("id", "ge", 3));
//		queryObject.add(new QueryObject("id", "le", 10));

//		queryObject.add(new QueryObject("name", "like", "Produto 2"));

		queryObject.add(new QueryObject("description", "like", "%Descrição%"));

		return queryObject;

	}

}
