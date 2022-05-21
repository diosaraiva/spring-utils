package com.diosaraiva.springutils.demo.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diosaraiva.springutils.demo.dto.DemoDto;
import com.diosaraiva.springutils.demo.model.Demo;
import com.diosaraiva.springutils.demo.repository.DemoRepository;

@Service
public class DemoService
{
	@Autowired
	private DemoRepository demoRepository;

	public static DemoDto generateDemo(int i) 
	{
		return DemoDto.builder()
				.id(i)
				.time(LocalDateTime.now())
				.test("Ok["+ i +"]")
				.build();
	}

	//CREATE
	public Demo addDemo(Demo demo) 
	{
		return demoRepository.save(demo);
	}

	//RETRIEVE
	public List<Demo> getAllApiDemos() 
	{
		List<Demo> apiDemos = new ArrayList<>();
		demoRepository.findAll().forEach(apiDemos::add);

		return apiDemos;
	}

	public Demo getApiDemo(long id) 
	{
		return demoRepository.findById(id)
				.orElseThrow();
	}

	//UPDATE
	public Demo updateApiDemo(Demo demo) 
	{
		demoRepository.findById(demo.getId())
		.ifPresent(this::addDemo);

		return demoRepository.findById(demo.getId())
				.orElseThrow();
	}

	//DELETE
	public void deleteApiDemo(long id) 
	{
		demoRepository.deleteById(id);
	}
}