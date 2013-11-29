package sistemaVoo.util.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistemaVoo.util.Horario;

public class HorarioTeste {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testImprimirHoraAtual() {
		
		Horario horario = new Horario(0,0);	
		horario.imprimirHoraAtual();
		
	}

	@Test
	public void testHorario() {
	Horario h1 =  new Horario (0,0);
	
	}

	@Test
	public void testGetHora() {
		Horario h2 = new Horario(0,1);
		h2.getHora();
		
		
	}

	@Test
	public void testSetHora() {
		
	}

	@Test
	public void testGetMin() {
		Horario h4 = new Horario(0,1);
		h4.getHora();
	
	}

	@Test
	public void testSetMin() {
	
	}

}
