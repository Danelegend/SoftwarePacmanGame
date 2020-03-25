package me.dane.pacman;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Screen extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Screen() {
		this.setSize(new Dimension(1500, 1500));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Test");
		this.getContentPane().setBackground(Color.BLACK);
		this.add(new DisplayMap());
	}
	
}
