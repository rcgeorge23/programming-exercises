package uk.co.novinet.fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzz {
	
	public FizzBuzz() { }
	
	public void printNumbers() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(resolveNumber(i));
		}
	}

	String resolveNumber(int i) {
		if (isMultiple(i, 3) && isMultiple(i, 5)) {
			return "FizzBuzz";
		}
		
		if (isMultiple(i, 3)) {
			return "Fizz";
		}
		
		if (isMultiple(i, 5)) {
			return "Buzz";
		}
		
		return valueOf(i);
	}

	private boolean isMultiple(int candidate, int multiplier) {
		return candidate % multiplier == 0;
	}
}
