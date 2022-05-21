package com.diosaraiva.springutils.ui.options;

import java.util.Map;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class OptionsCommands{
	@ShellMethod("List available options in OptionsEnum.")
	public void options(){
		Map<Integer,String> optionList = OptionsEnum.getOptionsFromEnum();

		OptionsEnum.printOptions(optionList);
	}
}