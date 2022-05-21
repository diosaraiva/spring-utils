package com.diosaraiva.springutils.utils.regex;

import java.util.ArrayList;
import java.util.List;

public class RegexConsole {
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
					.append(new RegexUtils().isNumeric(test)));
		});
	}
}
