package sistemaVoo.entidades;

import sistemaVoo.testes.TesteCpf;
import java.util.Scanner;


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
				System.out.println("CPF inválido. Favor inserir um CPF válido.");
			}
		}
	
	public void menuDoCliente(){
		System.out.println("Seja bem-vindo, cliente. O que você gostaria de fazer?");
    	System.out.println("[C]adastrar-se.");	
    	
    	Scanner scanIn = new Scanner(System.in);
    	String leitor = scanIn.nextLine().toLowerCase();
    	
        if(leitor.equals("c")){
        	this.cadastrarCliente("Fulano", "Casa 4 conj 5", "02545188182", "(61) 2345-5432");
        }
        else
        	System.out.println("Opção inválida.");
        
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
