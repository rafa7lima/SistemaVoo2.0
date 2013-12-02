package sistemaVoo.entidades;

import sistemaVoo.Ler;
import sistemaVoo.testes.TesteCpf;


public class Cliente extends PessoaFisica {

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
		System.out.println("Diga seu CPF (Apenas numeros):");
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
			System.out.println("CPF invalido. Favor inserir um CPF valido.\n");
		}
		return validacaoCpf;
	}
	
	//MENU
	public void menu(){
		System.out.println("Seja bem-vindo, cliente. O que você gostaria de fazer?");
    	System.out.println("1. Cadastrar-se.");	
    	
    	int i = Ler.lerInteiro();
    	
        if(i == 1){
        	this.cadastrar();
        }
<<<<<<< HEAD
=======
        if(i == 2){
        	System.out.println("Diga seu CPF (Apenas números):");
    		String post = Ler.lerString();      	
        	        	
        	
        }
>>>>>>> origin/iago
        else
        	System.out.println("Opcao invalida.");
	}

	

		
}
