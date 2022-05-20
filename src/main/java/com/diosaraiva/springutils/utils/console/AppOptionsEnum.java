package com.diosaraiva.springutils.utils.console;

public enum AppOptionsEnum{
	BOOT_WEBSHELL					("boot/web_and_shell"),
	BOOT_SHELL						("boot/shell_only");

	public static void runOptionEnum(String option) throws Exception{
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

	public String getEnumOption(){
		return enumOption;
	}

	private final String enumOption;

	private AppOptionsEnum(String enumOption){
		this.enumOption = enumOption;
	}

	private static AppOptionsEnum getEnum(String enumOption){
		for (AppOptionsEnum e : values()){
			if (e.enumOption.equals(enumOption)) return e;
		}
		return null;
	}
}