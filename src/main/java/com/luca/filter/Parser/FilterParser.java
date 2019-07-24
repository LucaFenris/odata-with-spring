package com.luca.filter.Parser;

import java.util.ArrayList;
import java.util.List;

import com.luca.filter.QueryObject;

public class FilterParser {

	public List<QueryObject> whereFilter() {

		final List<QueryObject> queryObject = new ArrayList<QueryObject>();

		queryObject.add(new QueryObject("id", "gt", "1"));
		queryObject.add(new QueryObject("id", "lt", "3"));

		return queryObject;

	}

}
