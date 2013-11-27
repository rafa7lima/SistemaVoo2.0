package sistemaVoo.infraestrutura;

import sistemaVoo.entidades.Operador;
import sistemaVoo.entidades.Passageiro;
import sistemaVoo.util.Horario;


public class Voo {
	private String numero;
	private String origem;
	private String destino;
	private Horario horarioPartida;
	private Horario horarioChegada;
	private Aeronave aviaoDoVoo;
	private int maxPassageiros;
	private Passageiro[] listaDePassageiros = {};
	private double preco;
	
	public Voo() {
		// TODO Auto-generated constructor stub
	}
	
	public Voo(String numeroVoo){
		this.numero = numeroVoo;
	}

	public void cadastrarVoo(String numeroVoo, String origemVoo, String destinoVoo,
			Horario horarioPartida, Horario horarioChegada, int max){
		this.numero = numeroVoo;
		this.origem = origemVoo;
		this.destino = destinoVoo;
		this.horarioPartida = horarioPartida;
		this.horarioChegada = horarioChegada;
		this.maxPassageiros = max;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Horario getHorarioPartida() {
		return horarioPartida;
	}

	public void setHorarioPartida(Horario horarioPartida) {
		this.horarioPartida = horarioPartida;
	}

	public Horario getHorarioChegada() {
		return horarioChegada;
	}

	public void setHorarioChegada(Horario horarioChegada) {
		this.horarioChegada = horarioChegada;
	}

	public Aeronave getAviaoDoVoo() {
		return aviaoDoVoo;
	}

	public void setAviaoDoVoo(Aeronave aviaoDoVoo) {
		this.aviaoDoVoo = aviaoDoVoo;
	}

	public Passageiro[] getListaDePassageiros() {
		return listaDePassageiros;
	}

	public void setListaDePassageiros(Passageiro[] listaDePassageiros) {
		this.listaDePassageiros = listaDePassageiros;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double d) {
		this.preco = d;
	}

	public int getMaxPassageiros() {
		return maxPassageiros;
	}

	public void setMaxPassageiros(int maxPassageiros) {
		this.maxPassageiros = maxPassageiros;
	}
	
	

}
