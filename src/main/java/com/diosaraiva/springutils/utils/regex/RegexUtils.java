package com.diosaraiva.springutils.utils.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RegexUtils{
	public static Boolean isNumeric(String strNum){		
		if (strNum == null) return false;

		Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
		return pattern.matcher(strNum).matches();
	}

	public static void testIsNumeric(){		

		List<String> testList = new ArrayList<String>();
		testList.add("0");
		testList.add("-1");
		testList.add("2.0");
		testList.add("abc");
		testList.add(" ");

		testList.forEach(test -> {
			System.out.println(new StringBuilder()
					.append("String: [")
					.append(test)
					.append("]\t")
					.append(isNumeric(test)));
		});
	}
}