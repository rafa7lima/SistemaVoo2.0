package sistemaVoo.entidades;

import java.util.Scanner;
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
		String leitor;
		Scanner scanIn = new Scanner(System.in);
		System.out.println("Qual é a sua senha?");
		leitor = scanIn.nextLine();
        leitor= leitor.toLowerCase();
        boolean saida = false;
        if(leitor.equals(this.senha)){
        	saida = true;
        }
        else{
        	System.out.println("Senha incorreta.");
        }
        return saida;
	}

	//CONSULTA PASSAGEIROS
	public void consultarPassageiros(Voo voo){
		System.out.println("Você não tem permissão para consultar esse tipo de informação.");
	}
	
	//MENU COM SAIDA
	public int menuDoFuncionario(){
    	System.out.println("Seja bem-vindo, funcionário");
    	System.out.println("Você é: A[t]endente, A[d]ministrador ou [O]perador?");
    	
    	Scanner scanIn = new Scanner(System.in);
    	String leitor2 = scanIn.nextLine().toLowerCase();
    	int saida=4;
        if(leitor2.equals("t") | leitor2.equals("atendente")){
        	saida = 1;
        }
        if(leitor2.equals("d") | leitor2.equals("administrador")){
        	saida = 2;
        }
        if(leitor2.equals("o") | leitor2.equals("operador")){
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
