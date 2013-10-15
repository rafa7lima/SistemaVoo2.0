package sistemaVoo.entidades;

public class Passageiro extends Cliente {

	//Atributos únicos de passageiro
	private int numeroAssento;
	
	
	public Passageiro() { }
	
	public int getNumeroAssento(){
		return numeroAssento;
	}
	
	public void setNumeroAssento(int numeroAssento){
		this.numeroAssento=numeroAssento;
		
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() +"    |  CPF: "+ getCpf(); 
	}

}
