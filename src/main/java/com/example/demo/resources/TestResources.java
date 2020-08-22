package com.example.demo.resources;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResources {
	
	@RequestMapping("/test")
	public Map<Integer,String> getString(){
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Gebre");
		map.put(2, "Haile");
		map.put(3, "Gashe");
		map.put(4, "Amir");
		return map;
	}

}
