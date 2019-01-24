package com.Kata.CamelCase;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CamelCaseApplicationTests {

	@Test
	public void testTwoWords() {
		assertEquals("TestCase", CamelCaseApplication.camelCase("test case"));
	}

	@Test
	public void testThreeWords() {
		assertEquals("CamelCaseMethod", CamelCaseApplication.camelCase("camel case method"));
	}

	@Test
	public void testLeadingSpace() {
		assertEquals("CamelCaseWord", CamelCaseApplication.camelCase(" camel case word"));
	}

	@Test
	public void testTrailingSpace() {
		assertEquals("SayHello", CamelCaseApplication.camelCase("say hello "));
	}

	@Test
	public void testSingleLetter() {
		assertEquals("Z", CamelCaseApplication.camelCase("z"));
	}

	@Test
	public void testTwoSpacesBetweenWords() {
		assertEquals("AbC", CamelCaseApplication.camelCase("ab  c"));
	}

	@Test
	public void testEmptyString() {
		assertEquals("", CamelCaseApplication.camelCase(""));
	}

}
