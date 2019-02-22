package com.manifestcorp.techreadsCMA;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

import org.junit.After;

import com.manifestcorp.techreadsCMA.model.*;
public class BootStrapTest {
		private BootStrap bootStrap;
		
		@Before
		public void setUp() {
			bootStrap = new BootStrap();
		}
		@After
		public void tearDown() {
			bootStrap = null;
		}
		@Test
		public void testRepoStatusIsNull() throws Exception {
			BootStrap book = new BootStrap();
			assertEquals("bookSize should equal null.", null, bootStrap.getBookRepoStatus(null));
		}
		
}
