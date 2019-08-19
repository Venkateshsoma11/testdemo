package com.demo.testdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator {

	Calculator c1 = new Calculator();
	
	@Test
	public void abc() {
		System.out.println("abc() testcase");
		assertEquals(30, c1.add(10, 20));
		
	}
	@Test
	public void xyz()
	{
		System.out.println("xyz() testcase");
		assertEquals(30,c1.sub(30,20));
		
	}
	@Test
	public void atoz()
	{
		System.out.println("atoz() testcase");
	
		assertTrue(c1.equals(20, 10));
	}
	@Test
	public void demo()
	{
		System.out.println("demo() testcase");
		
		assertFalse(c1.equals(20, 10));
	}
	
	@Before
	public void something()
	{
		System.out.println("Executed before testcase");
	}
	
	@After
	public void everything()
	{
		System.out.println("Executed after every testcase\n--------------------\n");
	}
	
	@BeforeClass
	public static void firstOne()
	{
		System.out.println("Executed before all the testcases\n");
	}
	@AfterClass
	public static void lastOne()
	{
		System.out.println("Executed after all the testcases");
	}
	

}
