package com.diosaraiva.springutils.utils.regex;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class RegexCommands{
	@ShellMethod("Returns the current system time.")
	public Boolean isnumeric(String s){
		return new RegexUtils().isNumeric(s);
	}
}