package uk.co.novinet.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindTheMissingLetterTest {
    @Test
    public void exampleTests() {
        assertEquals('e', FindTheMissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', FindTheMissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}
