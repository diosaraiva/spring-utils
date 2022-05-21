package com.diosaraiva.springutils.ui.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SwingMain{
	private JFrame frame;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void launch(){
		frame = new JFrame();

		JLabel lblText = new JLabel("Hello World!", SwingConstants.CENTER);
		frame.getContentPane().add(lblText);

		frame.setSize(640,480);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}  
}