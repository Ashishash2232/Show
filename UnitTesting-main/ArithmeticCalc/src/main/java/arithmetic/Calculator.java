package arithmetic;

public class Calculator {
	
	CalculatorService service;
	

		
		public Calculator(CalculatorService service) {
		// TODO Auto-generated constructor stub
			this.service=service;
	}


   //logic=(x+y)+x
		public int perform(int x,int y) {
			
			int sum= service.add(x, y);  
			
	//		return sum+x;
			 return (x+y)+x;
		}
		
	//case 1 service returns 0
	//case 2 service returns add(x,y)	
		

	}


