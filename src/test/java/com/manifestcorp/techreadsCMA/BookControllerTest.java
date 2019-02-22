package com.manifestcorp.techreadsCMA;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.manifestcorp.techreadsCMA.controller.BookController;
import com.manifestcorp.techreadsCMA.model.Book;

public class BookControllerTest {
		private BookController controlTester;
		
		@Before
		public void setUp() {
			controlTester = new BookController();
		}
		@After
		public void tearDown() {
			controlTester = null;
		}
		@Test
		public void goesToBookPage() throws Exception {
			
		}
}
