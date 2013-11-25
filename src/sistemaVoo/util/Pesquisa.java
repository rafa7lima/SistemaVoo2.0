package sistemaVoo.util;

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
		String[] string = {"a","b"};
		return string;
	}
	

}
