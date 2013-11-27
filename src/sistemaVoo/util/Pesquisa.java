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

		//Acessa o BD
		Voo[] BD = acessarBD();
		
		//Busca no BD um voo com os criterios selecionados pelo cliente
		ArrayList<Voo> list = new ArrayList<Voo>();

		int cadeirasNecessarias = this.adultos + this.criancas;
		int cadeirasDisponiveis;
		for(int i = 0;i<BD.length;i++){
			if(this.origem.equals(BD[i].getOrigem())){
				if(this.destino.equals(BD[i].getDestino())){
					cadeirasDisponiveis = BD[i].getMaxPassageiros() - BD[i].getListaDePassageiros().length;
					if(cadeirasNecessarias <= cadeirasDisponiveis){
						list.add(BD[i]);
					}
				}	
			}
		}
		
		
		//Definindo a saida do metodo
		int tamanhoArrayResultado = 6 + 4*list.size();
		String resultado[] = new String[tamanhoArrayResultado];
		
		String stIda = ida.getDia() + "/" + ida.getMes() + "/" + ida.getAno();
		String stVolta = volta.getDia() + "/" + volta.getMes() + "/" + volta.getAno();
		String stPartida;
		String stChegada;
		String stPreco = null;
		
		resultado[0] = origem;
		resultado[1] = destino;
		resultado[2] = stIda;
		resultado[3] = stVolta;
		resultado[4] = adultos+"";
		resultado[5] = criancas+"";

		for(int i=0;i<list.size();i++){
			resultado[i + 6 + i*4] = list.get(i).getNumero();

			stPartida = list.get(i).getHorarioPartida().getHora() + ":" + list.get(i).getHorarioPartida().getMin();
			resultado[i + 7 +i*4] = stPartida;
			
			stChegada = list.get(i).getHorarioChegada().getHora() + ":" + list.get(i).getHorarioChegada().getMin();
			resultado[i + 8 + i*4] = stChegada;

			stPreco = String.format("%.2f", list.get(i).getPreco());
			resultado[i + 9 + i*4] = "R$ " + stPreco;
		}
		
		return resultado;
	}

	private Voo[] acessarBD(){

		// Aqui seria preciso acessar o BD. Pra simplificar, usaremos um array de voos
		Voo voo1 = new Voo("A100");
		Voo voo2 = new Voo("B200");
		Voo voo3 = new Voo("C300");

		Horario hora1 = new Horario(8,10);
		Horario hora2 = new Horario(9,50);
		voo1.cadastrarVoo("A100", "Brasilia", "Congonhas", hora1, hora2, 300);
		voo1.setPreco(343);
		//System.out.println("voo1 cadastrado");

		hora1 = new Horario(10,30);
		hora2 = new Horario(12,10);
		voo2.cadastrarVoo("B200", "Congonhas", "Brasilia", hora1, hora2, 300);
		voo2.setPreco(249);
		//System.out.println("voo2 cadastrado");

		hora1 = new Horario(19,55);
		hora2 = new Horario(21,45);
		voo3.cadastrarVoo("C300", "Brasilia", "Gale‹o", hora1, hora2, 200);
		voo3.setPreco(138);
		//System.out.println("voo3 cadastrado");
		
		Voo[] BD = {voo1,voo2,voo3};
		return BD;
		
	}
	

}

