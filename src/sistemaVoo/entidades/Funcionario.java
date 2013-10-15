package sistemaVoo.entidades;

import java.util.Scanner;
import sistemaVoo.infraestrutura.Voo;
import sistemaVoo.util.Data;
import sistemaVoo.util.Horario;

public class Funcionario {

	protected String login = "";
	protected String senha = "";
	
	//CONSTRUTOR VAZIO
	public Funcionario() {}
	
	//CONSTRUTOR COM 1 PARAMETRO
	public Funcionario(String loginOp) {
		this.login = loginOp;
	}
	
	//CADASTRAR SENHA
	public void cadastrarSenha(String senha){
		this.senha = senha;
		System.out.println("Senha cadastrada com sucesso.");
		//OBS: MELHORAR A SEGURAN�A DESTE METODO
	}
	
	//VERIFICAR SENHA
	public boolean verificarSenha(){
		String leitor;
		Scanner scanIn = new Scanner(System.in);
		System.out.println("Qual � a sua senha?");
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
	public void consultaPassageiros(Voo voo){
		System.out.println("Voc� n�o tem permiss�o para consultar esse tipo de informa��o.");
	}
	
	//MENU
	public void menuDoFuncionario(){
    	System.out.println("Seja bem-vindo, funcion�rio. O que voc� gostaria de fazer?");
    	System.out.println("[C]adastrar voo");
    	
    	Scanner scanIn = new Scanner(System.in);
    	String leitor = scanIn.nextLine().toLowerCase();
    	
        if(leitor.equals("c")){
        	Voo voo = new Voo();
        	
    		// Dados de teste
    		Data dataVoo = new Data(1,1,2013);
    		Horario horarioVoo = new Horario(14,30);
        	
    		/** DEPENDENCIA ENTRE VOO E OPERADOR TESTADA \/ \/ \/
        	voo.cadastrarVoo("A200", "Bras�lia", "Guarulhos", dataVoo, horarioVoo, 300);
        	System.out.println("Voo cadastrado. M�ximo de passageiros: " + voo.getMaxPassageiro());
        	
        	// Adicionando um passageiro
        	Cliente cliente = new Cliente();
        	cliente.setNomeCliente("Jos�");
        	voo.adicionarPassageiro(cliente);
        	System.out.println("Existe(m) " + voo.getPassageiros().length + " passageiro(s) " +
        			"cadastrado(s) nesse voo.\n");
        	voo.listarPassageiros();**/
        }
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}


}
