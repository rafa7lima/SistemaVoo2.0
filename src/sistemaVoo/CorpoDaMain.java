package sistemaVoo;

import java.util.Scanner;

import sistemaVoo.entidades.Cliente;
import sistemaVoo.entidades.Funcionario;


public class CorpoDaMain {

	public CorpoDaMain() { }

	public static void main(String[] args) { 
	System.out.println("QUINTA ETAPA DA ATIVIDADE PRÁTICA");
	System.out.println("Disciplina: Orientacao a objetos");
	System.out.println("Professora Milene");
	System.out.println("Grupo: 7\n");
	
	String leitor;
	Scanner scanIn = new Scanner(System.in);
	boolean testeSairDoLoop = true;
	
	while(testeSairDoLoop){
		System.out.println("Você é: [C]liente ou [F]uncionário?");
		System.out.println("Para sair, digite [S].");

	    leitor = scanIn.nextLine();
        leitor = leitor.toLowerCase();//Qualquer coisa digitada vira caracter minusculo

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
	    case 1:
	    	Cliente cliente = new Cliente();
	    	cliente.menuDoCliente();
	    	break;
	    	
	    case 2: 
	    	Funcionario funcionario = new Funcionario();
	    	funcionario.menuDoFuncionario();
	    	break;
	    case 3: 
	    	System.out.println("Até a próxima!");
	    	break;
	    default:
	    	System.out.println("Insira um caracter válido!\n");
	    	break;
	    }
	}

	scanIn.close();

	
	}
}
