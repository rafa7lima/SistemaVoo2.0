package sistemaVoo.entidades;

import sistemaVoo.Ler;
import sistemaVoo.testes.TesteCpf;
import sistemaVoo.entidades.PessoaFisica;
import sistemaVoo.entidades.Mensagem;

public class Cliente extends PessoaFisica {
	private String post =""; 

	//Construtor SEM PARAMETRO
	public Cliente() { }

	//Construtor COM 1 PARAMETRO
	public Cliente(String nomeCliente){
			this.nome = nomeCliente;
	}

	//Construtor COM 4 PARAMETROS
	public Cliente(String nome, String endereco, String cpf, String telefone) {
			this.nome = nome;
			this.endereco = endereco;
			this.cpf = cpf;
			this.telefone = telefone;
	}
	
	//Cadastrar
	public boolean cadastrar(){
		System.out.println("Diga seu CPF (Apenas nœmeros):");
		String cpf = Ler.lerString();
		TesteCpf teste = new TesteCpf();
		boolean validacaoCpf = teste.ValidarCpf(cpf);
		if(validacaoCpf == true){
			System.out.println("Insira os demais dados:");
			System.out.println("Nome:");
			this.nome= Ler.lerString();
			System.out.println("Endereco:");
			this.endereco=Ler.lerString();
			System.out.println("Telefone:");
			this.telefone=Ler.lerString();
			this.cpf = cpf;
			System.out.println("O cliente " + this.nome + " foi cadastrado com sucesso.\n");

		}
		else{
			System.out.println("CPF invalido. Favor inserir um CPF v‡lido.\n");
		}
		return validacaoCpf;
	}
	
	//MENU
	public void menu(){
		System.out.println("Seja bem-vindo, cliente. O que voce gostaria de fazer?");
    	System.out.println("1. Cadastrar-se.");
    	System.out.println("2. escreva uma mensagem ou avaliacao para nosso sistema");
    	
    	int i = Ler.lerInteiro();
    	
        if(i == 1){
        	this.cadastrar();
        }
        if(i == 2){
        	System.out.println("Diga seu CPF (Apenas nœmeros):");
    		String post = Ler.lerString();      	
        	        	
        	public void postarmensagem(String mensagem){
        		
        		
        		Mensagem mensagem1 = new Mensagem();
        		mensagem1.ListaMensagem.add(post);
        		
        	}
        }
        else
        	System.out.println("Opcao invalida.");
	}

	

		
}
