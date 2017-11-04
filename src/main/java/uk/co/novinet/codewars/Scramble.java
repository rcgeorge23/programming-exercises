package uk.co.novinet.codewars;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class Scramble {
	/*
		Write function scramble(str1,str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
		
		For example:
		str1 is 'rkqodlw' and str2 is 'world' the output should return true.
		str1 is 'cedewaraaossoqqyt' and str2 is 'codewars' should return true.
		str1 is 'katas' and str2 is 'steak' should return false.
		
		Only lower case letters will be used (a-z). No punctuation or digits will be included.
		Performance needs to be considered
	 */
	public static boolean scramble(String str1, String str2) {
		final List<Character> scrambled = str1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		List<Character> target = str2.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		AtomicBoolean containsAll = new AtomicBoolean(true); 
		
		target.stream().forEach(character -> {
			if (scrambled.contains(character)) {
				scrambled.remove(character);
			} else {
				containsAll.set(false);
				return;
			}
		});
		
		return containsAll.get();
	}
}
