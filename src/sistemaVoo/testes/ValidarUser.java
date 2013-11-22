package sistemaVoo.testes;

public  class ValidarUser {
	
	//variaveis
	private int resultado;
	private int senha;

 //Senhas padrão
	/*/
	  458927  //Mod 7
      294580 //Mod 11
      527896  //Mod 4
	 */
	
	//Construtor vazio
		 public ValidarUser(){
			 
		 }
	
//Metodo para validar
  public int Valida(int senha){
	  if(senha%7==0){
			resultado=1;
		}
		else
			if(senha%11==0){
				resultado=2;
			}
			else
				if( senha%4==0){
					resultado=3;
				}
				else{
					resultado=0;
				}
	   return (resultado);
  }//Fim do metodo para validar

	public int getResultado() {
		return resultado;
	}
	
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}


}
