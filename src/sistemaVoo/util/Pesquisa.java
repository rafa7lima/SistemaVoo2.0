package sistemaVoo.util;

import java.util.ArrayList;

import sistemaVoo.infraestrutura.Voo;

public class Pesquisa {

	private String origem;
	private String destino;
	private Data ida;
	private Data volta;
	private int adultos;
	private int criancas;
	
	
	public Pesquisa(String origem, String destino, Data ida, Data volta, int adultos, int criancas) {
		this.origem=origem;
		this.destino=destino;
		this.ida=ida;
		this.volta=volta;
		this.adultos=adultos;
		this.criancas=criancas;
	}
	
	public String[] pesquisar(){
		
		// Aqui seria preciso acessar o BD. Pra simplificar, usaremos um array de voos
		Voo voo1 = new Voo("A100");
		Voo voo2 = new Voo("B200");
		Voo voo3 = new Voo("C300");
		
		Horario hora1 = new Horario(8,10);
		Horario hora2 = new Horario(9,50);
		voo1.cadastrarVoo("A100", "Bras’lia", "Congonhas", hora1, hora2, 300);
		voo1.setPreco(343);
		
		hora1 = new Horario(10,30);
		hora2 = new Horario(12,10);
		voo2.cadastrarVoo("B200", "Congonhas", "Bras’lia", hora1, hora2, 300);
		voo2.setPreco(249);
		
		hora1 = new Horario(19,55);
		hora2 = new Horario(21,45);
		voo3.cadastrarVoo("C300", "Bras’lia", "Gale‹o", hora1, hora2, 200);
		voo3.setPreco(138);
		
		Voo[] BD = {voo1,voo2,voo3};
		ArrayList<Voo> list = new ArrayList<Voo>();
		
		for(int i = 0;i<BD.length;i++){
			if(this.origem.equals(BD[i].getOrigem())){
				if(this.destino.equals(BD[i].getDestino())){
					list.add(BD[i]);
							
				}	
		}
	}

		
		String stIda = ida.getDia() + "/" + ida.getMes() + "/" + ida.getAno();
		String stVolta = volta.getDia() + "/" + volta.getMes() + "/" + volta.getAno();
		String[] resultado = {origem, destino, stIda, stVolta, adultos + "", criancas + ""};
		return resultado;
	}
	

}
