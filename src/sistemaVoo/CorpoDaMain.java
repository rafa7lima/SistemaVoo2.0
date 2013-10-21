package sistemaVoo;


import sistemaVoo.entidades.Administrador;
import sistemaVoo.entidades.Atendente;
import sistemaVoo.entidades.Cliente;
import sistemaVoo.entidades.Funcionario;
import sistemaVoo.entidades.Operador;


public class CorpoDaMain {

	public CorpoDaMain() { }

	public static void main(String[] args) { 
		//CABECALHO
		System.out.println("SEXTA ETAPA DA ATIVIDADE PRÁTICA");
		System.out.println("Disciplina: Orientacao a objetos");
		System.out.println("Professora Milene");
		System.out.println("Grupo: 7\n");

		String leitor;
		boolean testeSairDoLoop = true;
		
		//LOOP PINCIPAL
		while(testeSairDoLoop){
			System.out.println("Você é: [C]liente ou [F]uncionário?");
			System.out.println("Para sair, digite [S].");
			
			leitor = Ler.lerString().toLowerCase();//Qualquer coisa digitada vira caracter minusculo

			int caso = 0;
			if (leitor.equals("c")| leitor.equals("cliente")){
				caso = 1;
			}
			else if(leitor.equals("f") | leitor.equals("funcionario")){
				caso = 2;
			}
			else if(leitor.equals("s")){
				testeSairDoLoop = false;
				caso = 3;
			}

			switch (caso){
			case 1: //Cliente
				Cliente cliente = new Cliente();
				cliente.menu();
				break;

			case 2: //Funcionario
				Funcionario funcionario = new Funcionario();
				int caso2 = funcionario.menuDoFuncionario();
				if(caso2==1){ //Atendente (upcasting)
					funcionario = new Atendente();
					funcionario.menu();
				}
				else if(caso2 ==2){ //Administrador (upcasting)
					funcionario = new Administrador();
					funcionario.menu();
				}
				else if(caso2==3){ //Operador (upcasting)
					funcionario = new Operador();
					funcionario.menu();
				}
				else{
					System.out.println("Insira um caractere válido.\n");
				}

				break;
			case 3: //Sair
				System.out.println("Até a próxima!");
				break;
			default: //Outra coisa
				System.out.println("Insira um caracter válido!\n");
				break;
			}
		}

	}	
}
