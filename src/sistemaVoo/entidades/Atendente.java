package sistemaVoo.entidades;

import sistemaVoo.Ler;
import sistemaVoo.infraestrutura.Voo;

public class Atendente extends Funcionario {

	public Atendente() {}
	
	// Consulta pouco especializada
	public void consultarPassageiro(Voo voo){
		System.out.println("Os passageiros do voo " + voo.getNumero() + " s‹o:\n");
		Passageiro[] listaPassageiros = voo.getListaDePassageiros() ;
		int qntPassageiros = listaPassageiros.length;
		for(int i=0;i<qntPassageiros;i++){
			System.out.println(listaPassageiros[i].getNome());
		}
	}
	
	//Menu
	public void menu(){
		System.out.println("O que voc deseja fazer?");
		System.out.println("1. Realizar Check-in");
		System.out.println("2. Despachar bagagens");
		System.out.println("3. Consultar lista de passageiros");
		
		int i = Ler.lerInteiro();
		if (i == 1){
			System.out.println("MŽtodo n‹o implementado.");
		}
		if(i == 2){
			System.out.println("MŽtodo n‹o implementado.");
		}
		if(i==3){
			System.out.println("Qual o nœmero do voo?");
			String numeroVoo = Ler.lerString();
			Voo voo = new Voo(numeroVoo);
			this.consultarPassageiro(voo);
		}
	}

}
