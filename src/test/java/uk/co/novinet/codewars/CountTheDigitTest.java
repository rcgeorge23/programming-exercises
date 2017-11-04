package uk.co.novinet.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static uk.co.novinet.codewars.CountTheDigit.nbDig;

import org.junit.jupiter.api.Test;

public class CountTheDigitTest {
	private static void testing(int actual, int expected) {
		assertEquals(expected, actual);
	}

	@Test
	public void test1() {
		testing(nbDig(5750, 0), 4700);
	}

	@Test
	public void test2() {
		testing(nbDig(11011, 2), 9481);
	}

	@Test
	public void test3() {
		testing(nbDig(12224, 8), 7733);
	}

	@Test
	public void test4() {
		testing(nbDig(11549, 1), 11905);
	}
}
