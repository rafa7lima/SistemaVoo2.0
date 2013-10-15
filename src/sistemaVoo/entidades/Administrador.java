package sistemaVoo.entidades;

import sistemaVoo.infraestrutura.Voo;

public class Administrador extends Operador {

	public Administrador() { }
	
	// Consulta mais especializada que a do atendente
		public void consultarPassageiro(Voo voo){
			System.out.println("Os passageiros do voo " + voo.getNumero() + " s‹o:\n");
			Passageiro[] listaPassageiros = voo.getListaDePassageiros() ;
			int qntPassageiros = listaPassageiros.length;
			for(int i=0;i<qntPassageiros;i++){
				System.out.println(listaPassageiros[i].getNome() + "    " + listaPassageiros[i].getCpf());
			}
		}

}
