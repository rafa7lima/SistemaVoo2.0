package sistemaVoo.entidades;

import sistemaVoo.Ler;
import sistemaVoo.testes.TesteCpf;


<<<<<<< HEAD
public class Cliente extends Pessoa {
	
=======
public class Cliente extends PessoaFisica {
>>>>>>> Rafael

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
	
<<<<<<< HEAD
	//CADASTRAR
	public void cadastrarCliente(){
			System.out.println("Diga seu CPF (Apenas nœmeros):");
			String cpf = Ler.lerDoTeclado();
			TesteCpf teste = new TesteCpf();
			boolean validacaoCpf = teste.ValidarCpf(cpf);
			if(validacaoCpf == true){
				System.out.println("Insira os demais dados:");
				System.out.println("Nome:");
				this.nome= Ler.lerDoTeclado();
				System.out.println("Endereco:");
				this.endereco=Ler.lerDoTeclado();
				System.out.println("Telefone:");
				this.telefone=Ler.lerDoTeclado();
				this.cpf = cpf;
				System.out.println("O cliente " + this.nome + " foi cadastrado com sucesso.\n");
			}
			else{
				System.out.println("CPF invalido. Favor inserir um CPF valido.");
			}
=======
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

>>>>>>> Rafael
		}
		else{
			System.out.println("CPF inv‡lido. Favor inserir um CPF v‡lido.\n");
		}
		return validacaoCpf;
	}
	
	//MENU
<<<<<<< HEAD
	public void menuDoCliente(){
		System.out.println("Seja bem-vindo, cliente. O que voce gostaria de fazer?");
    	System.out.println("[C]adastrar-se.");	
=======
	public void menu(){
		System.out.println("Seja bem-vindo, cliente. O que voc gostaria de fazer?");
    	System.out.println("1. Cadastrar-se.");	
>>>>>>> Rafael
    	
    	int i = Ler.lerInteiro();
    	
        if(i == 1){
        	this.cadastrar();
        }
        else
        	System.out.println("Opcao invalida.");
	}

	

		
}
