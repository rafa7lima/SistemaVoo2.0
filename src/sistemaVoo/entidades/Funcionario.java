package sistemaVoo.entidades;


import sistemaVoo.Ler;
import sistemaVoo.infraestrutura.Voo;

public class Funcionario {

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
		//OBS: MELHORAR A SEGURANÇA DESTE METODO
	}
	
	//VERIFICAR SENHA
	public boolean verificarSenha(){
		System.out.println("Qual é a sua senha?");
		String leitor = Ler.lerDoTeclado();
        return leitor.equals(this.senha);
	}

	//CONSULTA PASSAGEIROS
	public void consultarPassageiros(Voo voo){
		System.out.println("Você não tem permissão para consultar esse tipo de informação.");
	}
	
	//MENU COM SAIDA
	public int menuDoFuncionario(){
    	System.out.println("Seja bem-vindo, funcionário");
    	System.out.println("Você é: A[t]endente, A[d]ministrador ou [O]perador?");
    	
    	String leitor = Ler.lerDoTeclado().toLowerCase();
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
		System.out.println("Bem vindo, funcionário!");
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}


}
