package test;

import org.junit.Test;

import main.Res;

public class TestRes {
	
	@Test
	public void testRes(){
		assert(Res.res(1, 4)==4);
	}

}
