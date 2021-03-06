package com.in28minutes.pastor.rest.webservices.filtering;

import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

public class FilteringWay {

	static MappingJacksonValue filtering(SimpleBeanPropertyFilter filter, List<BeanToFilter> list) {
		FilterProvider filters = new SimpleFilterProvider().addFilter("BeanToFilterFilter", filter);		
		MappingJacksonValue mapping = new MappingJacksonValue(list);		
		mapping.setFilters(filters);		
		return mapping;
	}
	
	static MappingJacksonValue filtering(SimpleBeanPropertyFilter filter, BeanToFilter beanToFilter) {
		FilterProvider filters = new SimpleFilterProvider().addFilter("BeanToFilterFilter", filter);		
		MappingJacksonValue mapping = new MappingJacksonValue(beanToFilter);		
		mapping.setFilters(filters);		
		return mapping;
	}
}
