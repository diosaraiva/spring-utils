package com.diosaraiva.springutils.utils.console;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ConsoleCommand{
	@ShellMethod("Open console interactive menu.")
	public void runconsole(){
		new AppOptions().runConsole();
	}
}