package com.diosaraiva.springutils.ui.options;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public enum OptionsEnum{
	BOOT_WEBSHELL					("boot/web_and_shell"),
	BOOT_SHELL						("boot/shell_only");

	public static void runConsoleOption(String option) throws Exception{
		switch (getEnum(option)){

		case BOOT_WEBSHELL: {
			//
			break;
		}
		case BOOT_SHELL: {
			//
			break;
		}
		}
	}
	
	public static Map<Integer,String> getOptionsFromEnum(){
		Map<Integer, String> optionList = new HashMap<Integer, String>();

		int i = 0;
		for (OptionsEnum consoleOptionsEnum : OptionsEnum.values()){
			String consoleOption = consoleOptionsEnum.getEnumOption();
			optionList.put(++i, consoleOption);
		}

		return optionList;
	}

	public static void printOptions(Map<Integer,String> optionList){
		for (Entry<Integer,String> option : optionList.entrySet()){
			System.out.println(new StringBuilder()
					.append(option.getKey())
					.append(". ")
					.append(option.getValue()));
		}
	}
	
	public String getEnumOption(){
		return enumOption;
	}

	private final String enumOption;

	private OptionsEnum(String enumOption){
		this.enumOption = enumOption;
	}

	private static OptionsEnum getEnum(String enumOption){
		for (OptionsEnum e : values()){
			if (e.enumOption.equals(enumOption)) return e;
		}
		return null;
	}
}