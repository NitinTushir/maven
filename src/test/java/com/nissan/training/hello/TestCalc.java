package com.nissan.training.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void testAdd() {
		Calc c=new Calc();
		assertEquals(10,c.add(5, 5));
	}
	@Test
	public void testSub() {
		Calc c=new Calc();
		assertEquals(-5,c.subtract(5, 10));
	}
	@Test
	public void testMult() {
		Calc c=new Calc();
		assertEquals(50,c.multiply(10, 5));
	}
	@Test
	public void testDiv() {
		Calc c=new Calc();
		assertEquals(1,c.divide(5, 5));
	}

}
