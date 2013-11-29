package sistemaVoo.entidades.testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistemaVoo.entidades.Administrador;

public class AdministradorTeste {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMenu() {
		Administrador admin = new Administrador();
		admin.menu();
		
	}

	@Test
	public void testAdministrador() {
		Administrador admin1 = new Administrador();
	}

	@Test
	public void testConsultarPassageiro() {
		Administrador admin2 = new Administrador();
	}

}
