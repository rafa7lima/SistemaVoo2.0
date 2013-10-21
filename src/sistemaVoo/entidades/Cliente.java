package sistemaVoo.entidades;

import sistemaVoo.Ler;


public class Cliente extends PessoaFisica {

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
	
	//Cadastrar
	public boolean cadastrar(){
		boolean resultadoValidacao = super.cadastrar();
		if (resultadoValidacao){
			System.out.println("O cliente " + this.nome + " foi cadastrado com sucesso.\n");
		}
		return resultadoValidacao;
	}
	
	//MENU
	public void menu(){
		System.out.println("Seja bem-vindo, cliente. O que você gostaria de fazer?");
    	System.out.println("1. Cadastrar-se.");	
    	
    	int i = Ler.lerInteiro();
    	
        if(i == 1){
        	this.cadastrar();
        }
        else
        	System.out.println("Opção inválida.");
	}
	

		
}
