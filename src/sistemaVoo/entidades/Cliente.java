package sistemaVoo.entidades;

import sistemaVoo.Ler;
import sistemaVoo.testes.TesteCpf;


public class Cliente {

	private String nome = " ";
	private String endereco = " ";
	private String cpf = "";
	private String telefone = " ";

	//Construtor SEM PARAMETRO
	public Cliente() { }

	//Construtor COM 1 PARAMETRO
	public Cliente(String nomeCliente){
			this.nome = nomeCliente;
	}

	//Construtor COM 4 PARAMETROS
	public Cliente(String nomeCliente, String enderecoCliente, String cpfCliente, String telefoneCliente) {
			this.nome = nomeCliente;
			this.endereco = enderecoCliente;
			this.cpf = cpfCliente;
			this.telefone = telefoneCliente;
	}
	
	//CADASTRAR
	public void cadastrarCliente(){
			System.out.println("Diga seu CPF (Apenas números):");
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
				System.out.println("CPF inválido. Favor inserir um CPF válido.");
			}
		}
	
	//MENU
	public void menuDoCliente(){
		System.out.println("Seja bem-vindo, cliente. O que você gostaria de fazer?");
    	System.out.println("[C]adastrar-se.");	
    	
    	String leitor = Ler.lerDoTeclado().toLowerCase();
    	
        if(leitor.equals("c")){
        	this.cadastrarCliente();
        }
        else
        	System.out.println("Opção inválida.");
	}
	

	//GETTERS E SETTERS	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

		
}
