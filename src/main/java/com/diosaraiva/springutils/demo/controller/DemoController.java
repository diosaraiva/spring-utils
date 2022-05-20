package com.diosaraiva.springutils.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.diosaraiva.springutils.demo.dto.DemoDto;
import com.diosaraiva.springutils.demo.service.DemoService;

@RestController
@RequestMapping(value= "/test")
public class DemoController 
{
	@Autowired
	private DemoService demoService = new DemoService();
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST,
	produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<DemoDto> generateDemo(@RequestBody Optional<Integer> i) 
	{
		DemoDto demoDto = demoService.generateDemo(i.orElse(0));

		return ResponseEntity.ok(demoDto);
	}
}