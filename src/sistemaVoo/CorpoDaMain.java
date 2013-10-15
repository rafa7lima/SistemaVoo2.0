package sistemaVoo;

import java.util.Scanner;

import sistemaVoo.entidades.Administrador;
import sistemaVoo.entidades.Atendente;
import sistemaVoo.entidades.Cliente;
import sistemaVoo.entidades.Funcionario;
import sistemaVoo.entidades.Operador;
import sistemaVoo.util.Data;


public class CorpoDaMain {

	public CorpoDaMain() { }

	public static void main(String[] args) { 
	System.out.println("QUINTA ETAPA DA ATIVIDADE PRçTICA");
	System.out.println("Disciplina: Orientacao a objetos");
	System.out.println("Professora Milene");
	System.out.println("Grupo: 7\n");
	Data nova=new Data();
	nova.dataAtual();
	
	String leitor;
	Scanner scanIn = new Scanner(System.in);
	boolean testeSairDoLoop = true;
	
	while(testeSairDoLoop){
		System.out.println("Voc� Ž: [C]liente ou [F]uncion‡rio?");
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
	    		System.out.println("Insira um caractere v‡lido.\n");
	    	}
	    	break;
	    case 3: //Sair
	    	System.out.println("AtŽ a pr—xima!");
	    	break;
	    default: //Outra coisa
	    	System.out.println("Insira um caracter v‡lido!\n");
	    	break;
	    }
	}

	scanIn.close();

	
	}
}
