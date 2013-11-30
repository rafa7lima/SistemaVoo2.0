package sistemaVoo.entidades.testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistemaVoo.entidades.Funcionario;

public class FuncionarioTeste {

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
	public void testFuncionario() {
		Funcionario fun1 = new Funcionario();
		
	}

	@Test
	public void testFuncionarioString() {
		Funcionario fun1 = new Funcionario(null);

		
	}

	@Test
	public void testCadastrarSenha() {
		Funcionario fun1 = new Funcionario();
		fun1.cadastrarSenha(null);
		
	}

	@Test
	public void testVerificarSenha() {
		Funcionario fun1 = new Funcionario();
		fun1.verificarSenha();
		
	}

	@Test
	public void testConsultarPassageiros() {
		Funcionario fun1 = new Funcionario();
		fun1.consultarPassageiros(null);
	}

	@Test
	public void testMenuDoFuncionario() {
		Funcionario fun1 = new Funcionario();
		fun1.menuDoFuncionario();
	}

	@Test
	public void testMenu() {
		Funcionario fun1 = new Funcionario();
		fun1.menu();
	}

	@Test
	public void testGetLogin() {
		Funcionario fun1 = new Funcionario();
		fun1.getLogin();
	}

	@Test
	public void testSetLogin() {
		Funcionario fun1 = new Funcionario();
		fun1.setLogin(null);
		fun1.getLogin();
	}

}
