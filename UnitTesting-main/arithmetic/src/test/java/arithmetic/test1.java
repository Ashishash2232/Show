package arithmetic;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test1 {

private int a,b,c;
	
	CalcService calc=new CalcService();
	//fixture
	@Before
	public void setup() {
		System.out.println("J-Unit testing 2 starts...");
		a=1;
		b=2;
		c=-1;
		
	}
	
	//testcase
	@Test
	public void testAdd() {
		assertEquals(3,calc.add(a,b));
	}
	
	@Test
	public void testSub() {
		assertEquals(c,calc.sub(a,b));
	}
	
	@After
	 public void stop()
	 {
	  System.out.println("stopping!");
	 }
	
}
