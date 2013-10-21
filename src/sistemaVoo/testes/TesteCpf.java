package sistemaVoo.testes;

import java.util.InputMismatchException;

public class TesteCpf {

	public TesteCpf() { }

	public boolean ValidarCpf(String cpf){
		//Validador de Cpf 11 numeros
		  //Declarac‹o de variaveis

		  int cont,soma,valor,peso,resultado;
		  char ver1,ver2;
		  boolean validacao = true;

		   if(cpf.length() != 11){
		      System.out.println("CPF digitado Ž inv‡lido\n");
		      validacao=false;
		      return validacao;
		    }

		 
		 //Validando o primeiro numero verificador
		 //uso do Try e do Catch é para pegar erros
		  try{
		    soma=0;
		    peso=10;
		 //Como temos 11 numeros e 2 verificadores, eles sao gerados pelos primeiros nove numeros
		    for(cont=0;cont<9;cont++){
		      valor=(int)(cpf.charAt(cont)-48);   //48 é o valor de 0 na tabela Ascii
		      soma=soma+(valor*peso);
		      peso--;
		   }

		   resultado=11-(soma%11);
		     if((resultado==10)||(resultado==11)){
		         ver1='0';
		    }
		      else
		        ver1=(char)(resultado+48); //Converte novamente para uma String

		 //Calculando o segundo digito verificador
		   soma=0;
		   peso=11;  //Ultimo digito
		     for(cont=0;cont<10;cont++){
		       valor=(int)(cpf.charAt(cont)-48);
		       soma=soma+(valor*peso);
		       peso--;
		     }
		  resultado=11-(soma%11);
		   if((resultado==10)||(resultado==11)){
		     ver2='0';
		   }
		     else
		       ver2=(char)(resultado+48);

		 //Verificação se os digitos

		   if((ver1==cpf.charAt(9))&&(ver2==cpf.charAt(10))){
		     validacao=true;
		   }
		     else validacao=false;
		  }//Fim do Try

		   catch(InputMismatchException erro){
		      validacao=false;
		   }
			
		   return (validacao);
	}
	
}
