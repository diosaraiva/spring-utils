package com.diosaraiva.springutils.ui.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;

import com.diosaraiva.springutils.ui.options.OptionsEnum;

public class ConsoleOptions{
	public boolean runConsole(){
		System.out.println(new StringBuilder()
				.append("----------------[ MENU: ")
				.append(OptionsEnum.values().length)
				.append(" OPTIONS ]----------------"));

		Map<Integer,String> optionList = OptionsEnum.getOptionsFromEnum();

		OptionsEnum.printOptions(optionList);

		System.out.println("\n0. EXIT PROGRAM");

		try{		
			String option = readUserOption();

			if(Integer.parseInt(option) == 0){
				displayExitProgram();

				return false;
			}

			System.out.print(new StringBuilder()
					.append("\n----------------[ OUTPUT: <")
					.append(option));
			option = optionList.get(Integer.parseInt(option));
			System.out.println(new StringBuilder()
					.append(". ")
					.append(option)
					.append("> ]----------------"));

			if(option != null) OptionsEnum.runConsoleOption(option);

			else displayInvalidOption();
		} catch (Exception e){
			displayError(e);
		} 

		pressToContinue();

		return true;
	}

	private String readUserOption() throws IOException{
		System.out.print("\nEnter output option number: ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		return br.readLine();
	}

	private void pressToContinue(){
		System.out.println("\nPress ENTER to continue...");
		Scanner s = new Scanner(System.in);
		s.nextLine();
	}

	private void displayExitProgram(){
		System.out.println("\n----------------[ EXITING PROGRAM ]----------------");
	}

	private void displayError(Exception e){
		System.out.println(new StringBuilder()
				.append("\n[ ERROR: ")
				.append(e.toString())
				.append(" ]"));
	}

	private void displayInvalidOption(){
		System.out.println("INVALID OPTION");
	}
}