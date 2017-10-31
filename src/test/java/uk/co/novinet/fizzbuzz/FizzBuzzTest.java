package uk.co.novinet.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz testObj = new FizzBuzz();
	
    @Test
    public void testThatWhenNumberIsMultipleOf3And5ResolveNumberReturnsFizzBuzz() {
        assertEquals("FizzBuzz", testObj.resolveNumber(15));
    }
    
    @Test
    public void testThatWhenNumberIsMultipleOf3AndNot5ResolveNumberReturnsFizz() {
        assertEquals("Fizz", testObj.resolveNumber(9));
    }
    
    @Test
    public void testThatWhenNumberIsMultipleOf5AndNot3ResolveNumberReturnsBuzz() {
        assertEquals("Buzz", testObj.resolveNumber(10));
    }
	
}
