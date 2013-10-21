package sistemaVoo.testes;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistemaVoo.entidades.Funcionario;

import junit.framework.TestCase;

public class TesteCadastroViaCpf extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Iniciando...\n");
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Fim.\n");
	}

	@Test
	public void test() {
		Funcionario funcionario = new Funcionario();
		
		String cpfValido = "02545188182";
		String cpfInvalido = "12345678901";
		
		System.out.println("Teste com CPF v‡lido:");
		boolean resposta = funcionario.cadastrar(cpfValido);
		assertTrue(resposta);
		
		System.out.println("\nTeste com CPF inv‡lido:");
		resposta = funcionario.cadastrar(cpfInvalido);
		assertFalse(resposta);
		
	}
}
