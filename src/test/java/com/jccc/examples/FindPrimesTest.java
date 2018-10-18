package com.jccc.examples;

import org.junit.Assert;
import org.junit.Test;


public class FindPrimesTest {
	
	@Test
	public void findPrimesTest(){
		Assert.assertEquals(7919, new FindPrimes().primeNumberFinder(1000));
		Assert.assertEquals(2, new FindPrimes().primeNumberFinder(2));
		Assert.assertEquals(104729, new FindPrimes().primeNumberFinder(10000));
	}
	

}
