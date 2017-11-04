package uk.co.novinet.codewars;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VasyaClerk {
	/*
	The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line. Each of them has a single 100, 50 or 25 dollars bill. A "Avengers" ticket costs 25 dollars.
	
	Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.
	
	Can Vasya sell a ticket to each person and give the change if he initially has no money and sells the tickets strictly in the order people follow in the line?
	
	Return YES, if Vasya can sell a ticket to each person and give the change. Otherwise return NO.
	
	###Examples:
	
	Line.Tickets(new int[] {25, 25, 50}) // => YES 
	Line.Tickets(new int []{25, 100}) 
    // => NO. Vasya will not have enough money to give change to 100 dollars
	 */
	
	public static String tickets(int[] peopleInLine) {
		List<Integer> change = new ArrayList<Integer>();
		
		for (int i = 0; i < peopleInLine.length; i++) {
			int currentNote = peopleInLine[i];
			if (!sufficientChange(change, currentNote)) {
				return "NO";
			} else {
				change.add(peopleInLine[i]);
			}
		}
		
		return "YES";
	}

	private static boolean sufficientChange(List<Integer> change, int note) {
		switch (note) {
			case (25):
				return true;
			case (50):
				if (numberOfNotesOfValue(change, 25) >= 1) {
					return removeNote(change, 25);
				}
			case (100):
				if (numberOfNotesOfValue(change, 50) >= 1 && numberOfNotesOfValue(change, 25) >= 1) {
					return removeNote(change, 50) && removeNote(change, 25);
				} else if (numberOfNotesOfValue(change, 25) >= 3) {
					return removeNote(change, 25, 3);
				}
			default:
				return false;
		}
	}
	
	private static boolean removeNote(List<Integer> change, int note) {
		return removeNote(change, note, 1);
	}
	
	private static boolean removeNote(List<Integer> change, int note, int numberToRemove) {
		int numberRemoved = 0;
		for (Iterator<Integer> it = change.iterator(); it.hasNext();) {
			if (it.next() == note) {
				it.remove();
				numberRemoved++;
				if (numberRemoved == numberToRemove) {
					return true;
				}
			}
		}
		return false;
	}

	private static long numberOfNotesOfValue(List<Integer> change, int noteValue) {
		return change.stream().filter(changeNote -> changeNote == noteValue).count();
	}
}
