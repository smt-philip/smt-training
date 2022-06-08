package com.mann.philip.training.introToProgramming.four.homework.states;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/*******************************************************************************
*<b>Title:</b> Exercise.java
*<b>Project:</b> smt-training
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Jun 7, 2022
*<b>updates:</b>
*******************************************************************************/

public class Exercise {

	public static void main(String[] args) {
		TreeMap<String, String> states = new TreeMap<>();
		states.put("NH", "New Hampshire");
		states.put("HA", "Hawaii");
		states.put("AK", "Alaska");
		states.put("IL", "Illinois");
		states.put("TX", "Texas");
		states.put("AR", "Arkansas");
		
		orderData(states);
		reverseOrderData(states);
		
	}
	/**
	 * 
	 * @param states
	 */
	public static void orderData(Map<String, String> states) {
		System.out.println("states: " + states);	
	}
	/**
	 * 
	 * @param states
	 */
	public static void reverseOrderData(SortedMap<String, String> states) {
		Map<String, String> reversedMap = ((TreeMap<String,String>) states).descendingMap();
		System.out.println("reversedMap: " + reversedMap);
	}
}
