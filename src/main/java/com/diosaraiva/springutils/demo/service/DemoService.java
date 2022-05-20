package com.diosaraiva.springutils.demo.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.diosaraiva.springutils.demo.dto.DemoDto;

@Service
public class DemoService
{
	public static DemoDto generateDemo(int i) 
	{
		return DemoDto.builder()
				.id(i)
				.time(LocalDateTime.now())
				.dbTest("Ok["+ i +"]")
				.build();
	}
}