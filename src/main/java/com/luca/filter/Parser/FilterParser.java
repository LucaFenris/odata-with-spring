package com.luca.filter.Parser;

import java.util.ArrayList;
import java.util.List;

import com.luca.filter.QueryObject;

public class FilterParser {

	public List<QueryObject> whereFilter() {

		final List<QueryObject> queryObject = new ArrayList<QueryObject>();

//		queryObject.add(new QueryObject("id", "eq", 3));
//		queryObject.add(new QueryObject("id", "le", 7));

		queryObject.add(new QueryObject("id", "gt", 3));
		
//		queryObject.add(new QueryObject("description", "like", "%3%"));

		return queryObject;

	}

}
