package sistemaVoo.entidades;


public abstract class Pessoa {
	
	//atributos de classe
	protected String nome;
	protected String endereco ;
	protected String cpf;
	protected String telefone;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	//GETTERS E SETTERS 	
		public abstract String getNome();

		public abstract void setNome(String nome);

		public abstract String getEndereco();

		public abstract void setEndereco(String endereco);

		public abstract String getCpf();

		public abstract void setCpf(String cpf);

		public abstract String getTelefone();

		public abstract void setTelefone(String telefone);

}
