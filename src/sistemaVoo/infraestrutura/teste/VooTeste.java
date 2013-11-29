package sistemaVoo.infraestrutura.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistemaVoo.entidades.Operador;
import sistemaVoo.entidades.Passageiro;
import sistemaVoo.infraestrutura.Aeronave;
import sistemaVoo.infraestrutura.Aeroporto;
import sistemaVoo.infraestrutura.Voo;
import sistemaVoo.util.Horario;

public class VooTeste {

	private static final Horario h1 = null;
	private static final Horario h2 = null;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVoo() {
		Voo voo1 = new Voo();
	}

	@Test
	public void testVooString() {
		Voo voo2 = new Voo();
	}

	@Test
	public void testCadastrarVoo() {
		
	}

	@Test
	public void testGetNumero() {
	Voo voo4 = new Voo();
	voo4.getNumero();
	}

	@Test
	public void testSetNumero() {
		Voo voo4 = new Voo();
		String numero = null;
		voo4.setNumero(numero);
		voo4.getNumero();
		
	}

	@Test
	public void testGetOrigem() {
		Voo voo5 = new Voo();
			voo5.getOrigem();
	
	}

	@Test
	public void testSetOrigem() {
		Voo voo5 = new Voo();
		Aeroporto Brasilia = null;
		voo5.setOrigem(Brasilia);
		voo5.getOrigem();
	}

	@Test
	public void testGetDestino() {
		Voo voo6 = new Voo();
		voo6.getDestino();

	}

	@Test
	public void testSetDestino() {
		Voo voo6 = new Voo();
		Aeroporto Congonhas = null;
		voo6.setDestino(Congonhas);
		voo6.getOrigem();

	}

	@Test
	public void testGetHorarioPartida() {
		Voo voo7 = new Voo();
		voo7.getHorarioPartida();
	}

	@Test
	public void testSetHorarioPartida() {
		Voo voo7 = new Voo();
		voo7.setHorarioPartida(h1);
		voo7.getHorarioPartida();
	}

	@Test
	public void testGetHorarioChegada() {
		Voo voo8 = new Voo();
		voo8.getHorarioChegada();
	}

	@Test
	public void testSetHorarioChegada() {
		Voo voo8 = new Voo();
		voo8.setHorarioChegada(h2);
		voo8.getHorarioPartida();
	}

	@Test
	public void testGetAviaoDoVoo() {
		Voo voo9 = new Voo();
		voo9.getAviaoDoVoo();
	}

	@Test
	public void testSetAviaoDoVoo() {
		Voo voo9 = new Voo();
		Aeronave aviao = null;
		voo9.setAviaoDoVoo(aviao);
		voo9.getHorarioPartida();
	}

	@Test
	public void testGetListaDePassageiros() {
		Voo voo10 = new Voo();
		voo10.getListaDePassageiros();
	}

	@Test
	public void testSetListaDePassageiros() {
		Voo voo10 = new Voo();
		Passageiro[] listaDePassageiros = null;
		voo10.setListaDePassageiros(listaDePassageiros);
		voo10.getListaDePassageiros();
	}

}
