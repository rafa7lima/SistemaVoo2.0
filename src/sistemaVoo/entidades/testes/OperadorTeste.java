package sistemaVoo.entidades.testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistemaVoo.entidades.Operador;

public class OperadorTeste {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMenu() {
		Operador oper1 = new Operador();
		oper1.menu();
		
		}

	@Test
	public void testOperador() {
	Operador oper1 = new Operador();
	}

}
