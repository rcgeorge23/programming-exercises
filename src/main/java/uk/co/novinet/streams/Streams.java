package uk.co.novinet.streams;

import static java.util.Arrays.stream;

import java.util.List;
import java.util.function.Predicate;

public class Streams {
	public String reduce(String delimiter, String... strings) { 
		return stream(strings).reduce((string1, string2) -> string1 + delimiter + string2).get();
	}
	
	public long filterAndCount(List<String> strings, Predicate<String> filterPredicate) {
		return strings.stream().filter(filterPredicate).count();
	}
	
}
