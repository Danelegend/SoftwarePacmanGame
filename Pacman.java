package me.dane.pacman;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Pacman {
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame f = new Screen();
				f.setVisible(true);
			}
		});
	}
	
}
