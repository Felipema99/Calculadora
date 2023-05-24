import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCalculadora {

	public Calculadora cal = new Calculadora();
	
	@Test
	public void test() {
		
		double subtrair = cal.subtrair(8, 4);//Determina os números a a ser utilizado na calculadora//
		assertEquals(4,subtrair);// O Resultado esperado para o teste nesse caso é "4"; 
	}

}
