package arithmetictest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import arithmetic.Calculator;
import arithmetic.CalculatorService;

public class TestCalc {

	Calculator c=null;
	CalculatorService service=mock(CalculatorService.class);
	
//	@Mock
//	CalculatorService service;
	
	//@Rule public MokitoRule rule =MokitoJUnit.rule();
	
	@Before
	public void setup() {
		c=new Calculator(service);
	}
	
	@Test
	public void testPreform() {
		
		when(service.add(2, 3)).thenReturn(5);
		assertEquals(7,c.perform(2, 3));                //(x+y)+x
		verify(service).add(2, 3);
	}

}
