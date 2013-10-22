package sistemaVoo.util;

import java.util.Calendar;

public class Horario {

	private int hora;
	private int min;
	
	
	public void imprimirHoraAtual(){
		//Utilizando a classe calendario
		Calendar calendario=Calendar.getInstance();  //Pegando a instancia de Calendar
		hora=calendario.get(Calendar.HOUR_OF_DAY); //Variavel int recebe a hora do dia 
		min=calendario.get(Calendar.MINUTE);

		//Verificacao do horario e imprimindo resposta
		if(hora>6 && hora<12){
			System.out.printf("Bom Dia!\n");
			System.out.println(+hora+":"+min);
			System.out.printf("\n");
		}else if(hora>=12&&hora<18){
			System.out.printf("Boa Tarde!\n");
			System.out.println(+hora+":"+min);
			System.out.printf("\n");
		}else{
			System.out.printf("Boa Noite!\n");
			System.out.println(+hora+":"+min);
			System.out.printf("\n");
		}
	} 
	
	public Horario(int h,int m) {
		this.hora = h;
		this.min = m;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}



}
