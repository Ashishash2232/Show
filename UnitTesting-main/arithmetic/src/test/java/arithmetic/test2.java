package arithmetic;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test2 {
	
	CalcService calc=new CalcService();

	private int a,b;
	
	//fixture
	@Before
	public void setup() {
		System.out.println("J-Unit testing 2 starts...");
		a=1;
		b=2;
	}
	
	//testcase
	@Test
	public void testmul() {
		
		assertEquals(21,calc.mul(a,b));
	}
	
	@Test
	public void testdiv() {
		
		assertEquals(13,calc.div(a,b));
	}
	
	
	@After
	 public void stop()
	 {
	  System.out.println("stopping!");
	 }

}
