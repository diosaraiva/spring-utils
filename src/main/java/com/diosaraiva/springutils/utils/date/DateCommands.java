package com.diosaraiva.springutils.utils.date;

import java.time.LocalDateTime;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class DateCommands{
	@ShellMethod("Returns the current system time.")
	public String now(){
		return new DateUtils().getFormattedDate(LocalDateTime.now());
	}
}