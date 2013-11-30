package sistemaVoo.entidades.testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistemaVoo.Ler;
import sistemaVoo.entidades.Cliente;

public class ClienteTeste {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCadastrar() {

	}

	@Test
	public void testCliente() {
		Cliente cliente0 = new Cliente();

	}

	@Test
	public void testClienteString() {
		Cliente cliente = new Cliente(null);
	}

	@Test
	public void testClienteStringStringStringString() {
		Cliente cliente = new Cliente(null,null,null,null);
	}

	@Test
	public void testMenu() {
		Cliente cliente = new Cliente();
		//cliente.menu();		
	}

}
