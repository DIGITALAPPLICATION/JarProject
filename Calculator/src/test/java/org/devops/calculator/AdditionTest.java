package org.devops.calculator;

import junit.framework.TestCase;

public class AdditionTest extends TestCase{
	Addition add=new Addition();

	public AdditionTest(String name) {
		super(name);
	}

	public void testSumOfTwoPositiveNumbers() {
		assertEquals(60,add.addition(20,30));
		System.out.println("testSumOfTwoPositiveNumbers: "+add.addition(20,30));
	}
	public void testSumOfTwoNegativeNumbers() {
		assertEquals(-50,add.addition(-20,-30));
		System.out.println("testSumOfTwoNegativeNumbers: "+add.addition(-20,-30));
	}
	public void testSumOfTwoOnePositiveAndNegativeNumbers() {
		assertEquals(10,add.addition(-20,30));
		System.out.println("testSumOfTwoOnePositiveAndNegativeNumbers: "+add.addition(-20,30));
	}
}