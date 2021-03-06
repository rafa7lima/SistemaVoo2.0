package sistemaVoo.entidades;

import sistemaVoo.Ler;
import sistemaVoo.testes.TesteCpf;

public abstract class PessoaFisica {

	protected String nome = " ";
	protected String endereco = " ";
	protected String cpf = "";
	protected String telefone = " ";
	
	//CADASTRAR
	public abstract boolean cadastrar();
	
	//CADASTRAR_TESTE
	public boolean cadastrar(String cpf){
			TesteCpf teste = new TesteCpf();
			boolean validacaoCpf = teste.ValidarCpf(cpf);
			if(validacaoCpf == true){
				System.out.println("Insira os dados:");
				System.out.println("Nome:");
				this.nome= Ler.lerString();
				System.out.println("Endereco:");
				this.endereco=Ler.lerString();
				System.out.println("Telefone:");
				this.telefone=Ler.lerString();
				this.cpf = cpf;
			}
			else{
				System.out.println("CPF invalido. Favor inserir um CPF valido.\n");
			}
			return validacaoCpf;
			
			
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
