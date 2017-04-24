package se.iths;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Lab1Test {

	@Test
	public void testAdd() {
		Lab1 Roger = new Lab1();
		int result = Roger.add(10, 2);
		assertEquals(result,12);	
	
	}
	
	@Test
	public void testSubtract() {
		Lab1 Roger = new Lab1();
		int result = Roger.subtract(15, 2);
		assertEquals(result, 13);
	}
	
	@Test 
	public void testMultiply() {
	Lab1 Roger = new Lab1();
	int result = Roger.multiply(4, 7);
	assertEquals(result, 28);
	}
	
	@Test
	public void testDivide() {
	Lab1 Roger = new Lab1();
	int result = Roger.divide(12, 2);
	assertEquals(result, 6);
	}

	/*@Test
	public void testReverse() {
	Lab1 Roger = new Lab1();
	assertEquals("hej", Lab1Test.reverse("jeh"));
	}*/
	
	@Test 
	public void testReverse() {
	Lab1 Roger = new Lab1();
	String backwards = Roger.reverse("hej");
	assertEquals(backwards, "jeh");
	}
	
	@Test 
	public void testQuote() {
		Lab1 Roger = new Lab1();
		// innan forloopen måste detta skrivas
		boolean firstFound = false;
		boolean secondFound = false;
		boolean thirdFound = false;
		boolean fourthFound = false;
		boolean fifthFound = false;
		boolean sixthFound = false;
		boolean seventhFound = false;
		boolean eighthFound = false;
		
		
		for (int i=0; i<100; i++) {
			String result = Roger.quote();
			System.out.println(result);
			if(result.equals("You must be the change you wish to see in the world. - Mahatma Gandhi")){
				firstFound = true;
			}else if(result.equals("Choose a job you love, and you will never have to work a day in your life. - Confucius")){
				secondFound = true;
			}else if(result.equals("To expect the unexpected shows a thoroughly modern intellect. - Oscar Wilde")){
				thirdFound = true;
			}else if(result.equals("In the End, we will remember not the words of our enemies, but the silence of our friends. - Martin Luther King, Jr.")){
				fourthFound = true;
			}else if(result.equals("We cannot solve our problems with the same thinking we used when we created them. - Albert Einstein")){
				fifthFound = true;
			}else if(result.equals("Without music, life would be a mistake. - Friedrich Nietzsche")){
				sixthFound = true;
			}else if(result.equals("I love deadlines. I like the whooshing sound they make as they fly by. - Douglas Adams")){
				seventhFound = true;
			}else if(result.equals("A fool thinks himself to be wise, but a wise man knows himself to be a fool. - William Shakespeare")){
				eighthFound = true;
			}
					
		}
		assertTrue("Should have found qoute from Gandhi", firstFound);
		assertTrue("Should have found quote from Confucius", secondFound);
		assertTrue("Should have found quote from Oscar Wilde", thirdFound);
		assertTrue("Should have found quote from Martin Luther King, Jr.", fourthFound);
		assertTrue("Should have found quote from Albert Einstein", fifthFound);
		assertTrue("Should have found quote from Friedrich Nietzsche", sixthFound);
		assertTrue("Should have found qoute from Douglas Adams", seventhFound);
		assertTrue("Should have found quote from William Shakespeare", eighthFound);
	}
	@After
	public void getCounterTest() {
		Lab1 Roger = new Lab1();
		int result = Roger.getCounter();
		assertEquals(result, 105);
	}
	
	
}
