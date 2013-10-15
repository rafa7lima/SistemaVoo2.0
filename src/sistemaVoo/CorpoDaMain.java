package sistemaVoo;


import sistemaVoo.entidades.Administrador;
import sistemaVoo.entidades.Atendente;
import sistemaVoo.entidades.Cliente;
import sistemaVoo.entidades.Funcionario;
import sistemaVoo.entidades.Operador;
import sistemaVoo.util.Data;


public class CorpoDaMain {

	public CorpoDaMain() { }

	public static void main(String[] args) { 
<<<<<<< HEAD
		//CABECALHO
		System.out.println("QUINTA ETAPA DA ATIVIDADE PRÁTICA");
		System.out.println("Disciplina: Orientacao a objetos");
		System.out.println("Professora Milene");
		System.out.println("Grupo: 7\n");
=======
	System.out.println("QUINTA ETAPA DA ATIVIDADE PR√ßTICA");
	System.out.println("Disciplina: Orientacao a objetos");
	System.out.println("Professora Milene");
	System.out.println("Grupo: 7\n");
	Data nova=new Data();
	nova.dataAtual();
	
	String leitor;
	Scanner scanIn = new Scanner(System.in);
	boolean testeSairDoLoop = true;
	
	while(testeSairDoLoop){
		System.out.println("VocÔøΩ ≈Ω: [C]liente ou [F]uncion‚Ä°rio?");
		System.out.println("Para sair, digite [S].");
>>>>>>> c77e6e49b73e9a0f10b47c9cad217c38017b2f98

		// DEFININDO A VARIAVEL QUE LE OS DADOS DO TECLADO
		String leitor;
		boolean testeSairDoLoop = true;

		//LOOP PINCIPAL
		while(testeSairDoLoop){
			System.out.println("Você é: [C]liente ou [F]uncionário?");
			System.out.println("Para sair, digite [S].");

<<<<<<< HEAD
			leitor = Ler.lerDoTeclado().toLowerCase();//Qualquer coisa digitada vira caracter minusculo
=======
	    switch (caso){
	    case 1: //Cliente
	    	Cliente cliente = new Cliente();
	    	cliente.menuDoCliente();
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
	    		System.out.println("Insira um caractere v‚Ä°lido.\n");
	    	}
	    	break;
	    case 3: //Sair
	    	System.out.println("At≈Ω a pr‚Äîxima!");
	    	break;
	    default: //Outra coisa
	    	System.out.println("Insira um caracter v‚Ä°lido!\n");
	    	break;
	    }
	}
>>>>>>> c77e6e49b73e9a0f10b47c9cad217c38017b2f98

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
				cliente.menuDoCliente();
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
