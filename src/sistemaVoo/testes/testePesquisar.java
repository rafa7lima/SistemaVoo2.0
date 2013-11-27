package sistemaVoo.testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistemaVoo.util.Data;
import sistemaVoo.util.Pesquisa;

public class testePesquisar {

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando");
	}

	@Test
	public void testPesquisar() {
		
		Data ida = new Data(25,12,2013);
		Data volta = new Data(30,12,2013);
		Pesquisa pesquisaDeTeste = new Pesquisa("Brasilia", "Congonhas", ida, volta, 1, 0);
		
		String[] resultado = pesquisaDeTeste.pesquisar();
		
		for(int i = 0; i<resultado.length;i++){
			System.out.println(resultado[i]);
		}
		
		
		assertEquals(resultado[0], "Brasilia");
		assertEquals(resultado[1], "Congonhas");
		assertEquals(resultado[2], "25/12/2013");
		assertEquals(resultado[3], "30/12/2013");
		assertEquals(resultado[4], "1");
		assertEquals(resultado[5], "0");
		
		assertEquals(resultado[6], "A100");
		assertEquals(resultado[7], "8:10");
		assertEquals(resultado[8], "9:50");
		assertEquals(resultado[9], "R$ 343,00");
		
	}

}
