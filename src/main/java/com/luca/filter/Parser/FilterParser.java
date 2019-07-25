package com.luca.filter.Parser;

import java.util.ArrayList;
import java.util.List;

import com.luca.filter.QueryObject;

public class FilterParser {

	public List<QueryObject> whereFilter(String[] queryParamsList) {

		final List<QueryObject> queryObject = new ArrayList<QueryObject>();
		String[] listaTeste;

		for (String values : queryParamsList) {
			System.out.println(values);
			listaTeste = values.split(" ");
			queryObject
					.add(new QueryObject(listaTeste[0].toString(), listaTeste[1].toString(), listaTeste[2].toString()));

		}

//		queryObject.add(new QueryObject("id", "eq", 3));
//		queryObject.add(new QueryObject("id", "le", 7));

//		queryObject.add(new QueryObject("id", "gt", 3));

//		queryObject.add(new QueryObject("description", "like", "%3%"));

		return queryObject;

	}

}
