package com.sampleTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class MyFirstTest 
    
{
	@Test
	public void canAddTwoPlusTwo(){
		
		int answer=2+2;
		
		assertEquals("2+2=4", 4, answer );
	}
}
