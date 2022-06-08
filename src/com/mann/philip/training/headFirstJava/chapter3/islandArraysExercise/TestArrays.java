package com.mann.philip.training.headFirstJava.chapter3.islandArraysExercise;

public class TestArrays {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String [] islands = getIslands();
		
		int [] index = getIndexes();
		
		display(index, islands);
	}
	
	/**
	 * 
	 * @param index
	 * @param islands
	 */
	public static void display(int[] index, String[] islands) {
		
		int ref;
		
		int y = 0;
		while (y < 4) {
			ref = index[y];
			System.out.println("island: " + islands[ref]);
			y = y + 1;
		}
	}
	
	/**
	 * 
	 * @return Array of all indexes
	 */
	private static int[] getIndexes() {
		int [] index = new int[4];
		// adding elements into index array = ints
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		
		return index;
	}
	
	/**
	 * Loads all of the islands
	 * @return Array of all of the islands
	 */
	public static String[] getIslands() {
		String [] islands = new String[4];
		// adding elements into islands array = strings
		islands[0] = "Bermuda";
		islands[1] = "Fiji";
		islands[2] = "Azorez";
		islands[3] = "Cozumel";
		
		return islands;
	}
}