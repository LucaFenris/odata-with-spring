package com.luca.filter;

public class QueryObject {

	private String object;
	private String operator;
	private Object value;

	public QueryObject(String object, String operator, Object value) {
		this.object = object;
		this.operator = operator;
		this.value = value;
	}

	public String getObject() {
		return object;
	}

	public String getOperator() {
		return operator;
	}

	public Object getValue() {
		return value;
	}

}
