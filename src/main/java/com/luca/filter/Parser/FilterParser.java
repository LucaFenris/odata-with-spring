package com.luca.filter.Parser;

import java.util.ArrayList;
import java.util.List;

import com.luca.filter.QueryObject;

public class FilterParser {

	public List<QueryObject> whereFilter(String[] queryParamsList) {

		final List<QueryObject> queryObject = new ArrayList<QueryObject>();
		String[] queryParams;

		for (String values : queryParamsList) {
			System.out.println(values);
			queryParams = values.split(" ");
			queryObject.add(
					new QueryObject(queryParams[0].toString(), queryParams[1].toString(), queryParams[2].toString()));

		}

		return queryObject;

	}

}
