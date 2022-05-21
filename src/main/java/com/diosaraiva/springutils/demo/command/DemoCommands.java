package com.diosaraiva.springutils.demo.command;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import com.diosaraiva.springutils.demo.controller.DemoController;
import com.diosaraiva.springutils.demo.dto.DemoDto;

@ShellComponent
public class DemoCommands{
	@ShellMethod("Generate a Demo object.")
	public DemoDto demo(@ShellOption(defaultValue = "0") Integer i){
		return new DemoController().generateDemo(Optional.ofNullable(i)).getBody();
	}
}