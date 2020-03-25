package me.dane.pacman;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

import me.dane.pacman.file_manipulation.createMap;

public class DisplayMap extends JComponent{

	private String[][] map;
	private int multiplier = 25;
	private int[][] lines = new int[1000][4];
	
	public DisplayMap() {
		map = createMap.generateNewMap();
		stringToLine();
	}
	
	private void stringToLine() {
		int firstx = 0;
		int lastx = 0;
		int firsty = 0;
		int lasty = 0;
		
		int counter = 0;
		
		boolean previousWall = false;
		
		//Horizontal Counter
		for (int j = 0; j < map.length; j++) {
			for (int i = 0; i < map[j].length; i++) {
				if (map[i][j].equals("w")) {
					
					if (!previousWall){
						firstx = (i+10)*multiplier;
						firsty = (j+10)*multiplier;
						previousWall = true; 
					}
					lastx = (i+10)*multiplier;
					lasty = (j+10)*multiplier;
				}
				
				if (!(map[i][j].equals("w"))) {
					if(previousWall) {
						System.out.println(lines.length);
						int[] line = new int[4];
						line[0] = firstx;
						line[1] = firsty;
						line[2] = lastx;
						line[3] = lasty;
						lines[counter] = line;
						counter++;
						previousWall = false;
					}
				}
			}
		}
		
		
		//Vertical Counter
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j].equals("w")) {
					
					if (!previousWall){
						firstx = (i+10)*multiplier;
						firsty = (j+10)*multiplier;
						previousWall = true;
					}
					lastx = (i+10)*multiplier;
					lasty = (j+10)*multiplier;
				}
				
				if (!(map[i][j].equals("w"))) {
					if(previousWall) {
						System.out.println(lines.length);
						int[] line = new int[4];
						line[0] = firstx;
						line[1] = firsty;
						line[2] = lastx;
						line[3] = lasty;
						lines[counter] = line;
						counter++;
						previousWall = false;
					}
				}
			}
		}
		
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.WHITE);
		
		for (int i = 0; i < lines.length; i++) {
			g.drawLine(lines[i][0], lines[i][1], lines[i][2], lines[i][3]);
		}
		
		//g.drawLine(0, 0, 100, 100);
	}
	
}
