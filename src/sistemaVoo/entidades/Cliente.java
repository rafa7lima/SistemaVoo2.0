package sistemaVoo.entidades;

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
	
	public void cadastrarCliente(String nome, String endereco, String cpf, String telefone){
			TesteCpf teste = new TesteCpf();
			boolean validacaoCpf = teste.ValidarCpf(cpf);
			if(validacaoCpf == true){
				this.nome= nome;
				this.endereco= endereco;
				this.cpf = cpf;
				this.telefone = telefone;
				System.out.println("Cliente " + this.nome + " cadastrado.");
			}
			else{
				System.out.println("CPF inv‡lido. Favor inserir um CPF v‡lido.");
			}
		}

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
