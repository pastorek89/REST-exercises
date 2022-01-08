package com.in28minutes.pastor.rest.webservices.filtering;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
	
	@GetMapping("/filtering")
	public BeanToFilter filter() {
		return new BeanToFilter("Patryk", 12, new Date());
	}
	
	@GetMapping("/filtering-list")
	public List<BeanToFilter> filterList() {
		return Arrays.asList(new BeanToFilter("Patryk", 32, new Date()), 
				new BeanToFilter("Karolina", 30, new Date()));
	}

}