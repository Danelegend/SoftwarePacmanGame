package me.dane.pacman.file_manipulation;

public class createMap {

	//Screen = 1000 * 1000
	// 1 spot = 10 pixels
	// First = horizontal
	// Second = vertical
	//w = wall
	//s = space
	//d = door
	//t = teleporter

	
	public createMap() {

		
	}
	
	public static String[][] generateNewMap() {
		String[][] map = new String[40][40];
		
		for (int i = 0; i < 40; i++) {
			for (int j = 0; j < 40; j++) {
				map[i][j] = "s";
				map[j][i] = "s";
			}
		}
		
		for (int i = 0; i < 40; i++) {
			map[i][0] = "w"; 
			map[i][39] = "w";
			map[0][i] = "w";
			map[39][i] = "w";
		} 
		
		for (int i = 14; i < 14+10; i++) {
			map[i][16] = "w";
			map[i][22] = "w";
			map[14][i] = "w";
			map[24][i] = "w";
		}
		
		//Temp
		
		
		map[19][22] = "d";
		map[20][23] = "d";
		
		map[0][19] = "t";
		map[39][19] = "t";
		

		
		return map;
	}
	
}
