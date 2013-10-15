package sistemaVoo.infraestrutura;

import sistemaVoo.entidades.Operador;
import sistemaVoo.entidades.Passageiro;
import sistemaVoo.util.Horario;


public class Voo {
	private String numero;
	private Aeroporto origem;
	private Aeroporto destino;
	private Horario horarioPartida;
	private Horario horarioChegada;
	private Aviao aviaoDoVoo;
	private Passageiro[] listaDePassageiros = {};
	
	public Voo() {
		// TODO Auto-generated constructor stub
	}

	public void cadastrarVoo(String numeroVoo, Aeroporto origemVoo, Aeroporto destinoVoo,
			Horario horarioPartida, Horario horarioChegada, Aviao aviao, Operador operador){
		boolean validacao = operador.verificarSenha();
		if (validacao){
			this.numero = numeroVoo;
			this.origem = origemVoo;
			this.destino = destinoVoo;
			this.horarioPartida = horarioPartida;
			this.horarioChegada = horarioChegada;
			this.aviaoDoVoo = aviao;
		}
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Aeroporto getOrigem() {
		return origem;
	}

	public void setOrigem(Aeroporto origem) {
		this.origem = origem;
	}

	public Aeroporto getDestino() {
		return destino;
	}

	public void setDestino(Aeroporto destino) {
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

	public Aviao getAviaoDoVoo() {
		return aviaoDoVoo;
	}

	public void setAviaoDoVoo(Aviao aviaoDoVoo) {
		this.aviaoDoVoo = aviaoDoVoo;
	}

	public Passageiro[] getListaDePassageiros() {
		return listaDePassageiros;
	}

	public void setListaDePassageiros(Passageiro[] listaDePassageiros) {
		this.listaDePassageiros = listaDePassageiros;
	}
	
	

}
