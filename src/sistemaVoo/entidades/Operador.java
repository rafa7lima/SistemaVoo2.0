package sistemaVoo.entidades;

public class Operador extends Funcionario {

	protected String login = "";
	protected String senha = "";
	
	//CONSTRUTOR VAZIO
	public Operador() {}
	
	//CONSTRUTOR COM 1 PARAMETRO
	public Operador(String loginOp) {
		this.login = loginOp;
	}
	
	//CADASTRAR SENHA
	public void cadastrarSenha(String senha){
		this.senha = senha;
		System.out.println("Senha cadastrada com sucesso.");
		//OBS: MELHORAR A SEGURAN‚A DESTE METODO
	}

}
