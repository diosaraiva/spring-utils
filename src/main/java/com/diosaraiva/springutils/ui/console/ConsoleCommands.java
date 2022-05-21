package com.diosaraiva.springutils.ui.console;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ConsoleCommands{
	@ShellMethod("Open console interactive menu.")
	public void console(){
		new ConsoleOptions().runConsole();
	}
}