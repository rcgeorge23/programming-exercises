package uk.co.novinet.streams;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StreamsTest {
	
	private Streams streams = new Streams();
	
	@Test
	public void testReduceConcatenatesStrings() {
		assertEquals(streams.reduce("#", "a", "b", "c", "d", "e", "f"), "a#b#c#d#e#f");
	}
	
	@Test
	public void testFilterAndCountReturnsTwoWhenPredicateIdentifiesStringsThatStartWithAnA() {
		assertEquals(2, streams.filterAndCount(asList("a", "ab", "ba", "bb"), (string) -> string.startsWith("a")));
	}
}
