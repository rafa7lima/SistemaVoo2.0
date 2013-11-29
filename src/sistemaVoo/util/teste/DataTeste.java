package sistemaVoo.util.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistemaVoo.util.Data;

public class DataTeste {

	@Before
	public void setUp() throws Exception {
		
	}


	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testData() {
		Data d0 = new Data();
	}

	

	@Test
	public void testDataIntIntInt() {
		Data d1 = new Data( 2, 3, 1991);
	}

	@Test
	public void testGetDia() {
		Data d2 = new Data( 2, 3, 1991);
		d2.getDia();
	}

	@Test
	public void testSetDia() {
		Data d2 = new Data( 2, 3, 1991);
		d2.setDia(4);
		d2.getDia();
	}

	@Test
	public void testGetMes() {
		Data d3 = new Data( 4, 4, 1992);
		d3.getMes();
	}

	@Test
	public void testSetMes() {
		Data d3 = new Data( 4, 4, 1992);
		d3.setMes(5);
		d3.getMes();
	}

	@Test
	public void testGetAno() {
		Data d4 = new Data( 5, 5, 1993);
		d4.getAno();
		
	}

	@Test
	public void testSetAno() {
		Data d4 = new Data( 5, 5, 1993);
		d4.setAno(6);
		d4.getAno();
	}

}
