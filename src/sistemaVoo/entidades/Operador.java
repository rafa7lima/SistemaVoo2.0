package sistemaVoo.entidades;

import sistemaVoo.Ler;
//import sistemaVoo.infraestrutura.Voo;


public class Operador extends Funcionario { 

	public Operador(){
		super();
	}
	public void menu(){
		System.out.println("O que você deseja fazer?");
		System.out.println("1. Cadastrar Voo");
		
		int i = Ler.lerInteiro();
		if (i == 1){
			boolean verifica = super.verificarSenha();
			if(verifica){
				//Voo novoVoo = new Voo();
				//novoVoo.cadastrarVoo(numeroVoo, origemVoo, destinoVoo, horarioPartida, horarioChegada, aviao, operador)
				//implementar
			}else{
				System.out.println("senha inválida.");
			}
			
		}
	}
}