package test;


import static org.junit.Assert.*;
import main.Res;

import org.junit.Test;

public class TestRes {

	@Test
	public void testRes(){
		assertEquals(1, Res.res(6, 5));
	}
	
	@Test
	public void testRes2(){

		assertEquals(0, Res.res(5, 5));

	}
	
}

