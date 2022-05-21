package com.diosaraiva.springutils.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diosaraiva.springutils.demo.model.Demo;

public interface DemoRepository extends JpaRepository<Demo, Long> 
{
	//
}