import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorial {

	@Test
	public void factorialDe0Es1() {
		assertEquals(new Integer(1),new Integer(Factorial.calcular(0)));
	}
	
	public void factorial1es1(){
		assertEquals(new Integer(1),new Integer(Factorial.calcular(1)));
	}
	
	public void factorial2es2(){
		assertEquals(new Integer(2),new Integer(Factorial.calcular(3)));
		
	}
	
	public void factorial3es6(){
		assertEquals(new Integer(6),new Integer(Factorial.calcular(3)));
	}

}
