package com.diosaraiva.springutils.ui.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class SwingMain{
	private JFrame frame;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void launch(){
		frame = new JFrame();
		frame.setSize(640,480);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		JMenuItem menuItemExit = new JMenuItem("Exit");
		menuFile.add(menuItemExit);
		
		JMenu menuHelp = new JMenu("Help");
		menuBar.add(menuHelp);
		
		JMenuItem menuItemAbout = new JMenuItem("About");
		menuHelp.add(menuItemAbout);
		
		JLabel labelText = new JLabel("Hello World!", SwingConstants.CENTER);
		frame.getContentPane().add(labelText);

		frame.setVisible(true);
	}
}