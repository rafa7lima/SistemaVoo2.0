package sistemaVoo.entidades;

import sistemaVoo.Ler;
import sistemaVoo.testes.TesteCpf;

public abstract class PessoaFisica {

	protected String nome = " ";
	protected String endereco = " ";
	protected String cpf = "";
	protected String telefone = " ";
	
	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}

	//CADASTRAR
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
			}
			else{
				System.out.println("CPF inv‡lido. Favor inserir um CPF v‡lido.\n");
			}
			return validacaoCpf;
			
			
		}
	
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
				System.out.println("CPF inv‡lido. Favor inserir um CPF v‡lido.\n");
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
