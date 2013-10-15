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
		//OBS: MELHORAR A SEGURAN�A DESTE METODO
	}
	
	//VERIFICAR SENHA
	public boolean verificarSenha(){
		System.out.println("Qual � a sua senha?");
		String leitor = Ler.lerDoTeclado();
        return leitor.equals(this.senha);
	}

	//CONSULTA PASSAGEIROS
	public void consultarPassageiros(Voo voo){
		System.out.println("Voc� n�o tem permiss�o para consultar esse tipo de informa��o.");
	}
	
	//MENU COM SAIDA
	public int menuDoFuncionario(){
    	System.out.println("Seja bem-vindo, funcion�rio");
    	System.out.println("Voc� �: A[t]endente, A[d]ministrador ou [O]perador?");
    	
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
		System.out.println("Bem vindo, funcion�rio!");
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}


}
