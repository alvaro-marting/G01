package test;

import static org.junit.Assert.*;
import main.Sum;

import org.junit.Test;

public class TestSum {

	@Test
	public void testSum(){
		assertEquals(9, Sum.sum(4, 5));
	}
	
}
