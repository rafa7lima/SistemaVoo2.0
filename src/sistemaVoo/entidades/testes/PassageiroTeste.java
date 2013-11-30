package sistemaVoo.entidades.testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistemaVoo.entidades.Passageiro;

public class PassageiroTeste {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPassageiro() {
		Passageiro p1 = new Passageiro();
	}

	@Test
	public void testGetNumeroAssento() {
		Passageiro p1 = new Passageiro();
		p1.getNumeroAssento();
	
	}

	@Test
	public void testSetNumeroAssento() {
		Passageiro p1 = new Passageiro();
		p1.setNumeroAssento((Integer) null);
		p1.getNumeroAssento();
	}

	@Test
	public void testToString() {
		Passageiro p1 = new Passageiro();
		p1.toString();
	}

}
