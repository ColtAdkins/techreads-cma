package com.manifestcorp.techreadsCMA;
import org.junit.Test;

import com.manifestcorp.techreadsCMA.model.Book;

import org.junit.Before;

import static org.junit.Assert.*;

import org.junit.After;

public class BookTest {
	private Book book;
	
	@Before
	public void setUp() {
		book = new Book();
	}
	@After
	public void tearDown() {
		book = null;
	}
	@Test
	public void testReturnsSevenFields() throws Exception {
		
	}

}
