package com.in28minutes.pastor.rest.webservices.filtering;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//Two ways of static ignore properties in response, however for me @JsonIgnore is a better one, because @JsonIgnoreProperties is hard-coded.
//@JsonIgnoreProperties(value = "date")
//Dynamic filtering in FilteringController
@JsonFilter(value = "BeanToFilterFilter")
public class BeanToFilter {

	private String name;
	//@JsonIgnore
	private int value;
	private Date date;
	
	public BeanToFilter(String name, int value, Date date) {
		super();
		this.name = name;
		this.value = value;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
	
	public Date getDate() {
		return date;
	}
	
	
}
