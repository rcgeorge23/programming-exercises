package uk.co.novinet.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VasyaClerkTest {

	@Test
	public void test1() {
		assertEquals("YES", VasyaClerk.tickets(new int[] { 25, 25, 50 }));
	}

	@Test
	public void test2() {
		assertEquals("NO", VasyaClerk.tickets(new int[] { 25, 100 }));
	}
	
	@Test
	public void test3() {
		assertEquals("YES", VasyaClerk.tickets(new int[] { 25, 25, 25, 100 }));
	}
	
	@Test
	public void test4() {
		assertEquals("NO", VasyaClerk.tickets(new int[] { 25, 25, 100 }));
	}
	
	@Test
	public void test5() {
		assertEquals("NO", VasyaClerk.tickets(new int[] { 50, 25, 100 }));
	}
	
	@Test
	public void test6() {
		assertEquals("NO", VasyaClerk.tickets(new int[] { 100, 25, 100 }));
	}
	
	@Test
	public void test7() {
		assertEquals("YES", VasyaClerk.tickets(new int[] { 25, 50, 25, 50, 25, 100 }));
	}
	
	@Test
	public void test() {
		assertEquals("YES", VasyaClerk.tickets(new int[] { 25, 50 }));
		assertEquals("NO", VasyaClerk.tickets(new int[] {25, 25, 50, 50, 100}));
	}
	
	@Test
	public void test8() {
		assertEquals("NO", VasyaClerk.tickets(new int[] {25, 25, 25, 25, 25, 100, 100}));
	}
}
