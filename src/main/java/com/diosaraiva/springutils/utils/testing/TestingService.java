package com.diosaraiva.springutils.utils.testing;

public class TestingService{
	public int add(int a, int b){
		return a+b;
	}

	public String concat(String a, String b){
		return new StringBuilder()
				.append(a)
				.append(b)
				.toString();
	}
}