package sistemaVoo.entidades;


import sistemaVoo.Ler;
import sistemaVoo.infraestrutura.Voo;
import sistemaVoo.testes.TesteCpf;

public class Funcionario extends PessoaFisica {

	protected String login = "";
	protected String senha = "";
	
	//CONSTRUTOR VAZIO
	public Funcionario() {}
	
	//CONSTRUTOR COM 1 PARAMETRO
	public Funcionario(String login) {
		this.login = login;
	}
	
	//CADASTRAR SENHA
	public void cadastrarSenha(String senha){
		this.senha = senha;
		System.out.println("Senha cadastrada com sucesso.");
		//OBS: MELHORAR A SEGURAN‚A DESTE METODO
	}
	
	//Cadastrar
	public boolean cadastrar(){
		System.out.println("Diga seu CPF (Apenas numeros):");
		String cpf = Ler.lerString();
		TesteCpf teste = new TesteCpf();
		boolean validacaoCpf = teste.ValidarCpf(cpf);
		if(validacaoCpf == true){
			System.out.println("Insira os demais dados:");
			System.out.println("Login:");
			this.login= Ler.lerString();
			System.out.println("Senha:");
			this.senha= Ler.lerString();
			System.out.println("Nome:");
			this.nome= Ler.lerString();
			System.out.println("Endereco:");
			this.endereco=Ler.lerString();
			System.out.println("Telefone:");
			this.telefone=Ler.lerString();
			this.cpf = cpf;
			System.out.println("O funcionario " + this.nome + " foi cadastrado com sucesso.\n");

		}
		else{
			System.out.println("CPF invalido. Favor inserir um CPF valido.\n");
		}
		return validacaoCpf;
	}
	
	//VERIFICAR SENHA
	public boolean verificarSenha(){
		System.out.println("Qual eh a sua senha?");
		String leitor = Ler.lerString();
        return leitor.equals(this.senha);
	}

	//CONSULTA PASSAGEIROS
	public void consultarPassageiros(Voo voo){
		System.out.println("Voce nao tem permissao para consultar esse tipo de informacao.");
	}
	
	//MENU COM SAIDA
	public int menuDoFuncionario(){
    	System.out.println("Seja bem-vindo, funcionario");
    	System.out.println("Voce eh: A[t]endente, A[d]ministrador ou [O]perador?");
    	
    	String leitor = Ler.lerString().toLowerCase();
    	int saida=0;
        if(leitor.equals("t") | leitor.equals("atendente")){
        	saida = 1;
        }
        if(leitor.equals("d") | leitor.equals("administrador")){
        	saida = 2;
        }
        if(leitor.equals("o") | leitor.equals("operador")){
        	saida = 3;
        }
        return saida;	
	}
	
	//MENU SEM SAIDA (POLIMORFISMO)
	public void menu(){
		System.out.println("Bem vindo, funcionario!");
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}


}
