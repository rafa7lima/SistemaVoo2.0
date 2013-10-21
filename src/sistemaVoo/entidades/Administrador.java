package sistemaVoo.entidades;

import sistemaVoo.Ler;
import sistemaVoo.infraestrutura.Voo;

public class Administrador extends Operador {

	public Administrador() { }
	
	// Consulta mais especializada que a do atendente
		public void consultarPassageiro(Voo voo){
			System.out.println("Os passageiros do voo " + voo.getNumero() + " são:\n");
			Passageiro[] listaPassageiros = voo.getListaDePassageiros() ;
			for(Passageiro passageiro : listaPassageiros){
				System.out.println(passageiro);
			}
		}
		
		public void menu(){
			System.out.println("O que você deseja fazer?");
			System.out.println("1. Remover voo");
			System.out.println("2. Remover passageiro");
			System.out.println("3. Consultar lista de passageiros");
			
			int i = Ler.lerInteiro();
			if (i == 1){
				System.out.println("Método não implementado.");
			}
			if(i == 2){
				System.out.println("Método não implementado.");
			}
			if(i==3){
				System.out.println("Qual o número do voo?");
				String numeroVoo = Ler.lerString();
				Voo voo = new Voo(numeroVoo);
				this.consultarPassageiro(voo);
			}
		}

}
