package com.diosaraiva.springutils.ui.swing;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class SwingCommands{
	@ShellMethod("Open console interactive menu.")
	public void swing(){
		new SwingMain().launch();
	}
}